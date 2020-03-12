package programacion.capitulo08.gestionEntidad;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.ventaDeCoches.Fabricante;

public class PanelGestionFabricante extends JPanel {
	public static int LOAD_FIRST = 0;
	public static int LOAD_PREV = 1;
	public static int LOAD_NEXT = 2;
	public static int LOAD_LAST = 3;
	public static int NEW = 4;
	public static int SAVE = 5;
	public static int REMOVE = 6;
	
	JTextField jtfId = new JTextField(5);
	JTextField jtfCif = new JTextField(15);
	JTextField jtfNombre = new JTextField(40);
	
	Fabricante actual = null;
	
	public PanelGestionFabricante() {
		
	}
	private void construir() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.insets = new Insets(0, 0, 25, 0);
		
	}
	
	private Jpanel getPanelNavegacion() {
		JPanel pnl = new JPanel();
	}
}
