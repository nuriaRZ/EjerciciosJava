package programacion.capitulo08.gestionEntidad;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import programacion.capitulo08.utils.Apariencia;
import programacion.capitulo08.utils.CacheImagenes;

public class VentanaPrincipal extends JFrame {
	public static int ANCHO = 800;
	public static int ALTO = 600;
	public static String TITULO = "Gestion_Fabricante";

	private CacheImagenes cacheImagenes;
	public static BufferedImage iconoApp;
	
	static {
		Apariencia.setAparienciasOrdenadas(Apariencia.aparienciasOrdenadas);
	}
	
	public VentanaPrincipal() {
		super(TITULO);
		
		cacheImagenes = new CacheImagenes();
		iconoApp = cacheImagenes.getImagen("nave.gif");
		setIconImage(iconoApp);
		this.setExtendedState(JFrame.NORMAL);
		this.setMinimumSize(new Dimension(ANCHO, ALTO));
		
		agregarGestionCierreAplicacion();
		
		
		
	}
	
	private void agregarGestionCierreAplicacion() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {				
				super.windowClosing(e);
				String posiblesRespuestas[] = {"Sí","No"};
				int opcionElegida = JOptionPane.showOptionDialog(null, "¿Realmente desea cerrar la aplicación?", TITULO, 
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, cacheImagenes.getIcono("confirm.png"), posiblesRespuestas, posiblesRespuestas[1]);
				if(opcionElegida == 0) {
					System.exit(0);
				}
			}
			
		});
	}
	
	
}
