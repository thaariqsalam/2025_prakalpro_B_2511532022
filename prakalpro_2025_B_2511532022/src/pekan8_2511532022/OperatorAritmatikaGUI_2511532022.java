package pekan8_2511532022;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511532022 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField textBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan",JOptionPane.ERROR_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532022 frame = new OperatorAritmatikaGUI_2511532022();
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
	public OperatorAritmatikaGUI_2511532022() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(72, 24, 284, 57);
		contentPane.add(lblNewLabel);
		
		JLabel txtBil = new JLabel("Bilangan 1");
		txtBil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtBil.setBounds(24, 85, 92, 21);
		contentPane.add(txtBil);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(99, 87, 96, 19);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		JLabel txttttt = new JLabel("Bilangan 2");
		txttttt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txttttt.setBounds(24, 116, 92, 21);
		contentPane.add(txttttt);
		
		textBil2 = new JTextField();
		textBil2.setColumns(10);
		textBil2.setBounds(99, 116, 96, 19);
		contentPane.add(textBil2);
		
		JLabel cbOperator = new JLabel("Operator");
		cbOperator.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbOperator.setBounds(24, 150, 92, 21);
		contentPane.add(cbOperator);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(24, 185, 92, 21);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		comboBox.setBounds(99, 147, 96, 24);
		contentPane.add(comboBox);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(99, 181, 96, 19);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hasil = 0;
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Bilangan 1 Harus Di Isi");
				} else if (textBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Bilangan 2 Harus diisi ");
				} else 
				{
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(textBil2.getText());
						int c = comboBox.getSelectedIndex();
					
						if (c==0) {
							hasil = (a+b);}
						if (c==1) {
							hasil = (a-b);}
						if (c==2) {
							hasil = (a*b);}
						if (c==3) {
							hasil = (a/b);}
						if (c==4) {
							hasil = (a%b);}
					}
						catch (NumberFormatException ex) {
							pesanEror ("Bilangan 1 dan Bilangan 2 harus diisi angka");
						}
					txtHasil.setText(String.valueOf(hasil));
					}
				}
					
		});
		btnNewButton.setBounds(221, 151, 85, 21);
		contentPane.add(btnNewButton);

	}
}
