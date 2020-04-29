package eed.tests.clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 435);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOperador = new JLabel("Operador1:");
		lblOperador.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblOperador.setBounds(53, 102, 110, 32);
		contentPane.add(lblOperador);
		
		JLabel lblOperador_1 = new JLabel("Operador2:");
		lblOperador_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblOperador_1.setBounds(53, 167, 110, 32);
		contentPane.add(lblOperador_1);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operaciones oper=new operaciones();
				result.setText(String.copyValueOf(oper.sumar(Integer.parseInt(o1.getText()),Integer.parseInt(o2.getText()))));
			}
		});
		suma.setBounds(69, 232, 110, 40);
		contentPane.add(suma);
		
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		resta.setBounds(270, 232, 125, 40);
		contentPane.add(resta);
		
		textField = new JTextField();
		textField.setBounds(270, 108, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(270, 173, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblResultado.setBounds(53, 305, 90, 22);
		contentPane.add(lblResultado);
		
		result = new JTextField();
		result.setBounds(270, 306, 125, 32);
		contentPane.add(result);
		result.setColumns(10);
	}
}
