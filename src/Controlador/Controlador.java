package Controlador;

import Vista.vista;

public class Controlador {
	vista miVista;
	
	public Controlador(vista miVista) {
		this.miVista = miVista;
	}
	
	public void mostrarVista() {
		this.miVista.cargarVentana();
	}

}