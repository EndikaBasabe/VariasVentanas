import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Abrir Formulario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFormularioArbol();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(91, 162, 235, 23);
		contentPane.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setBounds(143, 96, 142, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Lista de arboles :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 97, 123, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(102, 205, 46, 14);
		contentPane.add(label);
		
		JButton buttonEliminarArbol = new JButton("Eliminar arbol");
		buttonEliminarArbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminarArbol();
			}
		});
		buttonEliminarArbol.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonEliminarArbol.setBounds(91, 205, 235, 23);
		contentPane.add(buttonEliminarArbol);
	}

	

	protected void abrirFormularioArbol() {
		// TODO Apéndice de método generado automáticamente
		Datos hija = new Datos(this,"Formulario",true);
		hija.setVisible(true);
	}

	public void aniadirArbol(Arbol arbol) {
		// TODO Apéndice de método generado automáticamente
		this.comboBox.addItem(arbol.getNombre() + " " + arbol.getZona() + " " + arbol.getAltura());
	}
	
	public void eliminarArbol(){
		 int index = this.comboBox.getSelectedIndex();
		this.comboBox.removeItemAt(index);
	}
}
