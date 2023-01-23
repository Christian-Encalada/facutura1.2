package ec.chris.puce;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;


public class crearFactura extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_7;
    private ArrayList<Factura> listaFacturas = new ArrayList<Factura>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearFactura frame = new crearFactura();
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
	public crearFactura() {
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 644, 599);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombres:");
		lblNewLabel.setBounds(23, 43, 89, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula:");
		lblNewLabel_1.setBounds(23, 85, 89, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(100, 82, 205, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 40, 205, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Dirrecion:");
		lblNewLabel_2.setBounds(23, 110, 89, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 110, 205, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono:");
		lblNewLabel_3.setBounds(23, 151, 89, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(100, 148, 205, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		//tabla
		
		String[] columnNames = {"Cod", "Detalles", "Precio", "Cantidad", "Iva","Total iva","Total",};
	      DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	      JTable table = new JTable(model);
	      JScrollPane scrollPane = new JScrollPane(table);
	      scrollPane.setBounds(46, 265, 535, 181);
	      getContentPane().add(scrollPane);
	      
	      JButton btnBuscarCliente = new JButton("Buscar Cliente");
	        btnBuscarCliente.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String cedula = textField.getText();
	                for (Factura factura : listaFacturas) {
	                    if (factura.getCedula().equals(cedula)) {
	                        textField_1.setText(factura.getNombre());
	                        textField_2.setText(factura.getDireccion());
	                        textField_3.setText(factura.getTelefono());
	                        break;
	                    }
	                }
	            }
	        });
	        btnBuscarCliente.setBounds(316, 81, 123, 23);
	        getContentPane().add(btnBuscarCliente);
	      
	      JLabel lblNewLabel_4 = new JLabel("SUB TOTAL");
	      lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 11));
	      lblNewLabel_4.setBounds(415, 472, 70, 14);
	      getContentPane().add(lblNewLabel_4);
	      
	      JLabel lblNewLabel_4_1 = new JLabel("I.V.A");
	      lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 11));
	      lblNewLabel_4_1.setBounds(415, 497, 70, 14);
	      getContentPane().add(lblNewLabel_4_1);
	      
	      JLabel lblNewLabel_4_2 = new JLabel("TOTAL");
	      lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD, 11));
	      lblNewLabel_4_2.setBounds(415, 522, 70, 14);
	      getContentPane().add(lblNewLabel_4_2);
	      
	      textField_4 = new JTextField();
	      textField_4.setBounds(495, 469, 70, 20);
	      getContentPane().add(textField_4);
	      textField_4.setColumns(10);
	      
	      textField_5 = new JTextField();
	      textField_5.setBounds(495, 494, 70, 20);
	      getContentPane().add(textField_5);
	      textField_5.setColumns(10);
	      
	      textField_6 = new JTextField();
	      textField_6.setBounds(495, 519, 70, 20);
	      getContentPane().add(textField_6);
	      textField_6.setColumns(10);
	      
	      JLabel lblNewLabel_5 = new JLabel("Fecha:");
	      lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 11));
	      lblNewLabel_5.setBounds(445, 40, 70, 20);
	      getContentPane().add(lblNewLabel_5);
	      
	      JLabel lblNewLabel_6 = new JLabel("Num_fact:");
	      lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 11));
	      lblNewLabel_6.setBounds(445, 15, 70, 25);
	      getContentPane().add(lblNewLabel_6);
	      
	      textField_8 = new JTextField();
	      textField_8.setBounds(525, 40, 51, 17);
	      getContentPane().add(textField_8);
	      textField_8.setColumns(10);
	      
	      textField_7 = new JTextField();
	      textField_7.setColumns(10);
	      textField_7.setBounds(525, 17, 51, 17);
	      getContentPane().add(textField_7);
	      
	      JButton btnNewButton_1 = new JButton("Calcular");
	      btnNewButton_1.setForeground(Color.WHITE);
	      btnNewButton_1.setBackground(Color.DARK_GRAY);
	      btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 23));
	      btnNewButton_1.setBounds(156, 472, 165, 65);
	      getContentPane().add(btnNewButton_1);
		
		
		

	}
	
	public class Main {

	    public static void main(String[] args) {
	        ArrayList<Factura> listaFacturas = new ArrayList<Factura>();

	        Factura f1 = new Factura("123456789", "Juan Perez", "Calle 123", "0987654321");
	        Factura f2 = new Factura("987654321", "Maria Rodriguez", "Avenida 456", "0987654321");
	        Factura f3 = new Factura("678901234", "Pedro Gonzales", "Calle 789", "0987654321");

	        listaFacturas.add(f1);
	        listaFacturas.add(f2);
	        listaFacturas.add(f3);

	       
}
	}
	
}
