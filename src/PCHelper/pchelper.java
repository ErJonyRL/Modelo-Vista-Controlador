package PCHelper;

import Controlador.Controlador;
import Vista.vista;
public class pchelper {

	public static void main(String[] args) {
		
		vista miVista = new vista();
		Controlador miControlador = new Controlador(miVista);
		
		miControlador.mostrarVista();

	}

}
