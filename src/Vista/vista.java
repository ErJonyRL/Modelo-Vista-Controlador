package Vista;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

/**
 * Clase que representa la interfaz gráfica de usuario de PCHelper.
 */
public class vista {
	
	/**
	 *  ventana principal del proyecto
	 */
    public JFrame principalPCHelper;
    private JDialog pantallaCargaPCHelper;

    /**
     * Constructor de la clase vista.
     */
    public vista() {
        // Puedes agregar inicializaciones aquí si es necesario.
    }

    /**
     * Método para cargar la ventana de la aplicación.
     */
    public void cargarVentana() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    vista window = new vista();
                    window.mostrarPantallaCargaPCHelper();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Método para mostrar la pantalla de carga de PCHelper.
     */
    public void mostrarPantallaCargaPCHelper() {
        pantallaCargaPCHelper = new JDialog((JFrame) null, "Cargando...", true);
        pantallaCargaPCHelper.setSize(200, 100);
        pantallaCargaPCHelper.setLocationRelativeTo(null);

        Timer temporizador = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ocultarPantallaCarga();
            }
        });
        temporizador.setRepeats(false);
        temporizador.start();

        pantallaCargaPCHelper.setVisible(true);
        pantallaPrincipalPCHelper();
    }

    /**
     * Método para ocultar la pantalla de carga de PCHelper.
     */
    private void ocultarPantallaCarga() {
        pantallaCargaPCHelper.dispose();
    }

    /**
     * Método para inicializar los contenidos de la pantalla principal de PCHelper.
     */
    private void pantallaPrincipalPCHelper() {
        principalPCHelper = new JFrame();
        principalPCHelper.setBounds(100, 100, 450, 300);
        principalPCHelper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        principalPCHelper.getContentPane().add(panel, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("PCHelper");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGap(185)
                    .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addGap(190))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addComponent(lblNewLabel)
                    .addContainerGap(247, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        principalPCHelper.setVisible(true);
    }
}