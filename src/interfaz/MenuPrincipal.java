package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("Hola");
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_21 = new JPanel();
		panel_3.add(panel_21, BorderLayout.WEST);
		
		JPanel panel_22 = new JPanel();
		panel_3.add(panel_22, BorderLayout.CENTER);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblComboBox = new JLabel("Seleccione una opcion de conversion");
		panel_22.add(lblComboBox);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_2.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_23 = new JPanel();
		panel_9.add(panel_23, BorderLayout.EAST);
		
		JPanel panel_24 = new JPanel();
		panel_9.add(panel_24, BorderLayout.WEST);
		
		JPanel panel_25 = new JPanel();
		panel_9.add(panel_25, BorderLayout.CENTER);
		panel_25.setLayout(new GridLayout(1, 0, 0, 0));
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conversor de moneda", "Conversor de temperatura"}));
		panel_25.add(comboBox);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_7.add(panel_11, BorderLayout.WEST);
		
		JPanel panel_13 = new JPanel();
		panel_7.add(panel_13, BorderLayout.SOUTH);
		
		JPanel panel_14 = new JPanel();
		panel_7.add(panel_14, BorderLayout.NORTH);
		
		JPanel panel_15 = new JPanel();
		panel_7.add(panel_15, BorderLayout.CENTER);
		panel_15.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBackground(new Color(62, 157, 244));
		btnContinuar.setForeground(new Color(255, 255, 255));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				String input;
				try {
					input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
					Double.parseDouble(input);
					SeleccionarTipoDeMoneda.main(new String[] {input});
				} catch (NumberFormatException excepcion) {
					JOptionPane.showMessageDialog(null, "El valor ingresado no es un numero", "Numero invalido", JOptionPane.INFORMATION_MESSAGE);
					setVisible(true);
				}
			}
		});
		panel_15.add(btnContinuar);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_6.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_16 = new JPanel();
		panel_8.add(panel_16, BorderLayout.WEST);
		
		JPanel panel_17 = new JPanel();
		panel_8.add(panel_17, BorderLayout.NORTH);
		
		JPanel panel_18 = new JPanel();
		panel_8.add(panel_18, BorderLayout.SOUTH);
		
		JPanel panel_19 = new JPanel();
		panel_8.add(panel_19, BorderLayout.EAST);
		
		JPanel panel_20 = new JPanel();
		panel_8.add(panel_20, BorderLayout.CENTER);
		panel_20.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(255, 0, 0));
		panel_20.add(btnCancelar);
		
	}
}
