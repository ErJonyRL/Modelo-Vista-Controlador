package PCHelper;

import Controlador.Controlador;
import Modelo.look;
import Vista.vista;

public class pchelper {

	public static void main(String[] args) {
		vista miVistaPCHelper = new vista();
		
		Controlador miControlador = new Controlador(miVistaPCHelper);
		
		miControlador.mostrarVistaPCHelper();

	}

}
