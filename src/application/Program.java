package application;

import controller.EventosController;
import controller.UsuarioController;
import java.util.Scanner;
import model.Eventos;
import model.Usuario;
import view.EventosView;
import view.UsuarioView;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu
        System.out.println("* Menu *");
        System.out.println("1 = Cadastrar Usuario");
        System.out.println("2 = Cadastrar Evento");

        int numero = sc.nextInt();

        switch (numero) {
            case 1:
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
                Usuario usuario = new Usuario(nomeUsuario, telefoneUsuario, idadeUsuario);
                UsuarioView view = new UsuarioView();
                UsuarioController usuarioController = new UsuarioController(usuario, view);
                usuarioController.atualizarView();
                break;
            case 2:
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
                System.out.println("Digite a categoria do evento: ");
                String categoriaEvento = sc.nextLine();
                System.out.println("Digite a descricao do evento: ");
                String descricaoEvento = sc.nextLine();
                // Eventos
                Eventos eventos = new Eventos(nomeEvento, enderecoEvento, categoriaEvento, horarioEvento, descricaoEvento);
                EventosView eventosView = new EventosView();
                EventosController eventosController = new EventosController(eventos, eventosView);
                eventosController.atualizarView();
                break;
            default:
                System.out.println("Numero invalido !");
                break;
        }

        sc.close();

    }

}
