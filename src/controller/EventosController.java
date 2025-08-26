package controller;

import model.Eventos;
import view.EventosView;

public class EventosController {
    
    private Eventos eventos;
    private EventosView view;
    
    public EventosController(Eventos eventos, EventosView view) {
        this.eventos = eventos;
        this.view = view;
    }
    
    public void atualizarView() {
        view.mostrarEventos(eventos);
    }
    
}
