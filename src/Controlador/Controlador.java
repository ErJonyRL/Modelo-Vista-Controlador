package Controlador;

import Modelo.look;
import Vista.vista;


/**
 * Controlador de la aplicación PCHelper que gestiona la interacción entre la vista y el modelo.
 */
public class Controlador {

    private vista miVistaPCHelper;

    /**
     * Constructor del Controlador.
     *
     * @param miVistaPCHelper Objeto de la clase vista que se utilizará para gestionar la interfaz gráfica de usuario.
     */
    public Controlador(vista miVistaPCHelper) {
        this.miVistaPCHelper = miVistaPCHelper;
    }

    /**
     * Método para mostrar la vista principal de PCHelper.
     */
    public void mostrarVistaPCHelper() {
        this.miVistaPCHelper.cargarVentana();
    }
}