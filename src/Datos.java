import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Datos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JTextField textFieldZona;
	private JTextField textFieldAltura;
	/**
	 * Create the dialog.
	 */
	public Datos(JFrame parent, String titulua,boolean modal) {
		
		super(parent,titulua,modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Introducci\u00F3n de datos");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblNewLabel.setBounds(115, 26, 194, 14);
			contentPanel.add(lblNewLabel);
		}
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(140, 82, 149, 20);
		contentPanel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldZona = new JTextField();
		textFieldZona.setBounds(140, 113, 149, 20);
		contentPanel.add(textFieldZona);
		textFieldZona.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(140, 145, 149, 20);
		contentPanel.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(39, 85, 75, 14);
		contentPanel.add(lblNombre);
		
		JLabel lblZona = new JLabel("Zona :");
		lblZona.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblZona.setBounds(39, 116, 46, 14);
		contentPanel.add(lblZona);
		
		JLabel lblAltura = new JLabel("Altura :");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltura.setBounds(39, 148, 64, 14);
		contentPanel.add(lblAltura);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Arbol arbol = new Arbol(textFieldNombre.getText(),textFieldZona.getText(),Double.parseDouble(textFieldAltura.getText()));
					
						
						((Main) getParent()).aniadirArbol(arbol);
						dispose();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
}
