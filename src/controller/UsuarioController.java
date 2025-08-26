package controller;

import model.Usuario;
import view.UsuarioView;

public class UsuarioController {

    private Usuario usuario;
    private UsuarioView view;

    public UsuarioController(Usuario usuario, UsuarioView view) {
        this.usuario = usuario;
        this.view = view;
    }

    public void atualizarView() {
        view.mostrarDadosDoUsuario(usuario);
    }

}
