package application;

import controller.EventosController;
import controller.UsuarioController;
import enums.Categoria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Eventos;
import model.Usuario;
import view.EventosView;
import view.UsuarioView;

public class Program {

    private static List<Eventos> listaDeEventos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Menu
            System.out.println();
            System.out.println("* Menu *");
            System.out.println("1 = Cadastrar Usuario");
            System.out.println("2 = Cadastrar Evento");
            System.out.println("3 = Ver Eventos Cadastrados");
            System.out.println("4 = Sair");

            int numero = sc.nextInt();

            switch (numero) {
                case 1 -> {
                    cadastrarUsuario(sc);
                }
                case 2 -> {
                    cadastrarEvento(sc);
                }
                case 3 -> {
                    verificarEventos();
                }
                case 4 -> {
                    // Encerrar Programa
                    System.out.println("Encerrando o Programa...");
                    sc.close();
                    System.exit(0);
                }
                default ->
                    System.out.println("Numero invalido !");
            }
        }

    }

    private static int lerOpcao(Scanner sc, int min, int max) {
        while (true) {
            if (sc.hasNextInt()) {
                int v = sc.nextInt();
                sc.nextLine();
                if (v >= min && v <= max) {
                    return v;
                }
            } else {
                sc.nextLine();
            }
            System.out.print("Opcao invalida. Digite um numero entre " + min + " e " + max + ": ");
        }
    }

    private static void cadastrarUsuario(Scanner sc) {
        // Cadastro do Usuário
        System.out.println("* CADASTRO DO USUARIO *");
        System.out.println();

        sc.nextLine();

        System.out.println("Informe seu Nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.println("Informe sua Idade: ");
        int idadeUsuario = sc.nextInt();

        sc.nextLine();

        System.out.println("Informe seu Telefone: ");
        String telefoneUsuario = sc.nextLine();

        // Usuário
        System.out.println("Usuario Cadastrado !");
        Usuario usuario = new Usuario(nomeUsuario, telefoneUsuario, idadeUsuario);
        UsuarioView view = new UsuarioView();
        UsuarioController usuarioController = new UsuarioController(usuario, view);
        usuarioController.atualizarView();

    }

    private static void cadastrarEvento(Scanner sc) {
        // Cadastro de Evento

        sc.nextLine();
        System.out.println("* CADASTRO DE EVENTO *");
        System.out.println();

        System.out.println("Digite o nome do evento: ");
        String nomeEvento = sc.nextLine();

        System.out.println("Digite o endereco do evento: ");
        String enderecoEvento = sc.nextLine();

        System.out.println("Digite o horario do evento: ");
        String horarioEvento = sc.nextLine();

        System.out.println("Escolha a categoria do evento:");
        Categoria[] categorias = Categoria.values();
        for (int n = 0; n < categorias.length; n++) {
            System.out.println((n + 1) + ") " + categorias[n]);
        }
        int opcaoCategoria = lerOpcao(sc, 1, categorias.length);
        Categoria categoriaEvento = categorias[opcaoCategoria - 1];

        System.out.println("Digite a descricao do evento: ");
        String descricaoEvento = sc.nextLine();

        // Eventos
        System.out.println("Evento Cadastrado !");
        Eventos eventos = new Eventos(nomeEvento, enderecoEvento, categoriaEvento, horarioEvento, descricaoEvento);
        EventosView eventosView = new EventosView();
        EventosController eventosController = new EventosController(eventos, eventosView);
        eventosController.atualizarView();

        listaDeEventos.add(eventos);
    }

    private static void verificarEventos() {
        for (Eventos e : listaDeEventos) {
            System.out.println(e);
        }
    }
}
