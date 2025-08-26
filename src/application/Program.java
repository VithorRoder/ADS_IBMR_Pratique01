package application;

import controller.UsuarioController;
import java.util.Scanner;
import model.Usuario;
import view.UsuarioView;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadastro do Usuário
        System.out.println("Informe seu Nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe seu Telefone: ");
        String telefone = sc.nextLine();

        Usuario usuario = new Usuario(nome, telefone, idade);
        UsuarioView view = new UsuarioView();

        UsuarioController usuarioController = new UsuarioController(usuario, view);
        usuarioController.atualizarView();

        sc.close();

    }

}
