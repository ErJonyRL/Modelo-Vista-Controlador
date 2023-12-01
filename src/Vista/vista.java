package Vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;

public class vista {

	private JFrame frame;
	private JDialog pantallaCarga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista window = new vista();
					window.mostrarPantallaCarga();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vista() {
		initialize();
	}

	private void mostrarPantallaCarga() {
		pantallaCarga = new JDialog((JFrame)null,"Cargando...",true);
		pantallaCarga.setSize(200, 100);
        pantallaCarga.setLocationRelativeTo(null);

        Timer Temporizador = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ocultarPantallaCarga();
            }
        });
        Temporizador.setRepeats(false); 
        Temporizador.start();
        
        pantallaCarga.setVisible(true);
	}
	
	private void ocultarPantallaCarga() {
        pantallaCarga.dispose();
        initialize();
    }
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
