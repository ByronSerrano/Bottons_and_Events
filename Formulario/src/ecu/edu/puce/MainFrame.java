package ecu.edu.puce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	private JButton botonNuevo;
	private JButton botonGuardar;
	private JButton botonCancelar;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(26, 27, 77, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			// Para el evento del focus del Nombre
			@Override
			public void focusLost(FocusEvent e) {
				txtNombre.setText(txtNombre.getText().toUpperCase());
			}
		});
		txtNombre.setBounds(113, 24, 205, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(26, 69, 62, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.addFocusListener(new FocusAdapter() {
			// El evento del Lost Focus del Apellido
			@Override
			public void focusLost(FocusEvent e) {
				txtApellido.setText(txtApellido.getText().toUpperCase());
			}
		});
		txtApellido.setBounds(113, 66, 205, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(26, 111, 77, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.addFocusListener(new FocusAdapter() {
			// El evento del Lost Focus del boton de la direccion
			@Override
			public void focusLost(FocusEvent e) {
				txtDireccion.setText(txtDireccion.getText().toUpperCase());
			}
		});
		txtDireccion.setBounds(113, 108, 205, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		botonNuevo = new JButton("Nuevo");
		botonNuevo.addMouseListener(new MouseAdapter() {
			// El OnCLick del boton Nuevo
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNombre.setText(null);
				txtApellido.setText(null);
				txtDireccion.setText(null);
				lblMensaje.setText(null);
			}
		});
		botonNuevo.setBounds(52, 197, 89, 23);
		contentPane.add(botonNuevo);
		
		botonGuardar = new JButton("Guardar");
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonGuardar.addMouseListener(new MouseAdapter() {
			// El OnCLick del Boton Siguiente
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMensaje.setText("Bienvenido " + txtNombre.getText());
			}
		});
		botonGuardar.setBounds(211, 197, 89, 23);
		contentPane.add(botonGuardar);
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.addMouseListener(new MouseAdapter() {
			// El OnCLick del boton Cancelar
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		botonCancelar.setBounds(367, 197, 89, 23);
		contentPane.add(botonCancelar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(165, 172, 205, 14);
		contentPane.add(lblMensaje);
	}
}
