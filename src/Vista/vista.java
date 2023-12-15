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

public class vista {

	private JFrame frame;
	private JDialog pantallaCarga;

	/**
	 * Launch the application.
	 * @return 
	 * @return 
	 */
	public void cargarVentana() {
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

	public void mostrarPantallaCarga() {
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
        initialize();
        
	}
	
	private void ocultarPantallaCarga() {
        pantallaCarga.dispose();
    }
	
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
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
		frame.setVisible(true);
	}
}
