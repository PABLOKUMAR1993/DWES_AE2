package com.ai2.model.repository;
import java.util.List;

import com.ai2.model.beans.Eventos;


public interface IntEventos {

	
	Eventos buscarUno(int idEvento);
	List<Eventos> buscarTodos();
	boolean crearEvento(Eventos evento);
	boolean editarEvento(Eventos evento);
	boolean eliminarEvento(Eventos evento);
	boolean cancelarEvento(Eventos evento);
	boolean activarEvento(Eventos evento);
	
	
}
