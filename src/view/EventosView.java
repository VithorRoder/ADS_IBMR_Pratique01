package view;

import model.Eventos;

public class EventosView {

    public void mostrarEventos(Eventos eventos) {
        System.out.println("Nome do Evento: " + eventos.getNome());
        System.out.println("Endereco do Evento: " + eventos.getEndereco());
        System.out.println("Categoria do Evento: " + eventos.getCategoria());
        System.out.println("Horario do Evento: " + eventos.getHorario());
        System.out.println("Descricao do Evento: " + eventos.getDescricao());
    }

}
