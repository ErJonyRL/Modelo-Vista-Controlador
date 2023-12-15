package Controlador;

import Vista.vista;
import LooK.look;
public class Controlador {
	vista miVistaPCHelper;
	
	public Controlador(vista miVistaPCHelper) {
		this.miVistaPCHelper = miVistaPCHelper;
	}
	
	public void mostrarVistaPCHelper() {
		this.miVistaPCHelper.cargarVentana();
	}
	
	

}