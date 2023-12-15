package LooK;

import java.awt.Color;
import Vista.vista;

public class look {
	vista miVistaEstilo;
	
	public look(vista miVistaEstilo) {
		this.miVistaEstilo = miVistaEstilo;
	}
	
	public void FondoPCHelper() {
		miVistaEstilo.principalPCHelper.getContentPane().setBackground(new Color(254, 219, 179));
	}
	
}
