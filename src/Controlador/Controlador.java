package Controlador;

import Modelo.look;
import Vista.vista;
public class Controlador {
	vista miVistaPCHelper;
	
	public Controlador(vista miVistaPCHelper) {
		this.miVistaPCHelper = miVistaPCHelper;
	}
	
	public void mostrarVistaPCHelper() {
		this.miVistaPCHelper.cargarVentana();
	}
	
	

}