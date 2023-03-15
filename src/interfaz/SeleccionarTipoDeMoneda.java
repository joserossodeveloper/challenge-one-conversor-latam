package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class SeleccionarTipoDeMoneda extends JFrame {

	private JPanel contentPane;
	private ConversorDeMonedas conversor = new ConversorDeMonedas();
	private static double cantidad;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		cantidad = Double.parseDouble(args[0]);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionarTipoDeMoneda frame = new SeleccionarTipoDeMoneda();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public SeleccionarTipoDeMoneda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 124);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(conversor.getEtiquetas()));
		
		JButton OK = new JButton("OK");
		OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				double monedaCambiada = conversor.ConvertirMoneda(cantidad, conversor.getTasasDeCambio(comboBox.getSelectedIndex()));
				JOptionPane.showMessageDialog(null, "Tienes "+
				conversor.getSimboloMonedas(comboBox.getSelectedIndex())+monedaCambiada+" "
				+ conversor.getNombreMonedas(comboBox.getSelectedIndex()), "Resultado", JOptionPane.INFORMATION_MESSAGE);
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Pregunta", JOptionPane.YES_NO_OPTION);
				if (respuesta == JOptionPane.YES_OPTION) {
					MenuPrincipal.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "El programa a terminado");
				}
			}
		});
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuPrincipal.main(null);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, 0, 326, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(99)
					.addComponent(OK, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Cancel)
					.addGap(100))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(OK)
						.addComponent(Cancel))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
