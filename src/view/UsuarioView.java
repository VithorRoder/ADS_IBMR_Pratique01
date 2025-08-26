package view;

import model.Usuario;

public class UsuarioView {

    public void mostrarDadosDoUsuario(Usuario usuario) {
        System.out.println("Nome de Usuario: " + usuario.getNome());
        System.out.println("Idade do Usuario: " + usuario.getIdade() + " anos");
        System.out.println("Telefone do Usuario: " + usuario.getTelefone());
    }
}
