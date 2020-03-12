package programacion.capitulo08.gestionEntidad;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelGestionFabricante extends JPanel {
	public static int LOAD_FIRST = 0;
	public static int LOAD_PREV = 1;
	public static int LOAD_NEXT = 2;
	public static int LOAD_LAST = 3;
	public static int NEW = 4;
	public static int SAVE = 5;
	public static int REMOVE = 6;
	
	JTextField jtfId = new JTextField(5);
}
