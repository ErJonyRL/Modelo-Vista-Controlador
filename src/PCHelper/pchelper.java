package PCHelper;

import Controlador.Controlador;
import Modelo.look;
import Vista.vista;

/**
 * Clase principal que contiene el método main para iniciar el programa PCHelper.
 */
public class pchelper {

    /**
     * Punto de entrada principal para el programa PCHelper.
     *
     * @param args Los argumentos de la línea de comandos (actualmente no se utilizan).
     */
    public static void main(String[] args) {
        // Se crea una instancia de la clase vista para manejar la interfaz gráfica.
        vista miVistaPCHelper = new vista();

        // Se crea una instancia del controlador y se le pasa la vista como parámetro.
        Controlador miControlador = new Controlador(miVistaPCHelper);

        // Se llama al método que muestra la interfaz de usuario del PCHelper.
        miControlador.mostrarVistaPCHelper();
    }

    /**
     * Constructor de la clase pchelper.
     */
    public pchelper() {
        // Puedes agregar inicializaciones aquí si es necesario.
    }
}
