package programacion.capitulo08;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Ventana extends JFrame {
	
	public Ventana () {
		this.setBounds(0, 0, 800, 600);
		
		this.setContentPane(getPanelPrincipal());		
		this.setVisible(true);
	}
	
	public JPanel getPanelPrincipal() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// Panel para el nombre
		JPanel pnlNombre = new JPanel();
		pnlNombre.add(new JLabel("Nombre:"));
		JTextField jtfNombre = new JTextField(30);
		pnlNombre.add(jtfNombre);
		// Inserto el pnlNombre en el panel principal
		panel.add(pnlNombre);
		
		// Panel para el 1ºApellido
		JPanel pnlPrimerAp = new JPanel();
		pnlPrimerAp.add(new JLabel("Primer Apellido:"));
		JTextField jtfPrimerAp = new JTextField(30);
		pnlPrimerAp.add(jtfPrimerAp);
		// Inserto el pnlPrimerAp en el panel principal
		panel.add(pnlPrimerAp);
		
		// Panel para el 2ºApellido
		JPanel pnlSegundoAp = new JPanel();
		pnlPrimerAp.add(new JLabel("Segundo Apellido:"));
		JTextField jtfSegundoAp = new JTextField(30);
		pnlPrimerAp.add(jtfSegundoAp);
		// Inserto el pnlsegundoAp en el panel principal
		panel.add(pnlSegundoAp);
		
		// Panel para el DNI
		JPanel pnlDNI = new JPanel();
		pnlPrimerAp.add(new JLabel("DNI:"));
		JTextField jtfDNI = new JTextField(10);
		pnlPrimerAp.add(jtfDNI);
		// Inserto el pnlDNI en el panel principal
		panel.add(pnlDNI);
		
		// Panel para la Localidad
		JPanel pnlLocalidad = new JPanel();
		pnlPrimerAp.add(new JLabel("Localidad:"));
		JTextField jtfLocalidad = new JTextField(10);
		pnlPrimerAp.add(jtfLocalidad);
		// Inserto el pnlLocalidad en el panel principal
		panel.add(pnlLocalidad);
		
		JButton bt = new JButton("Botón");
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Botón Presionado");
			}
		});
		
		panel.add(bt);
		return panel;
	}
	

	public static void main(String[] args) {
		Ventana v = new Ventana();

	}

}
