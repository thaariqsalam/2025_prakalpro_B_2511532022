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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tugasAlproPekan8_2511532022 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
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
					tugasAlproPekan8_2511532022 frame = new tugasAlproPekan8_2511532022();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tugasAlproPekan8_2511532022() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 250);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 227, 172)); // lihat di COLOR WHEEL RGB
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJudul = new JLabel("OPERATOR ASSIGNMENT GUI");
		lblJudul.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJudul.setBounds(125, -15, 300, 100);			//setBounds(x, y, width, height)
		contentPane.add(lblJudul);
		
		JLabel lblBil1 = new JLabel("Bilangan 1");		// Input Bilangan 1 (Nilai Awal)
		lblBil1.setFont(new Font("Arial", Font.BOLD, 14));
		lblBil1.setBounds(35, 80, 100, 20);
		contentPane.add(lblBil1);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(20, 100, 100, 40);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		txtBil1.setBackground(new Color(135, 206, 250));
		txtBil1.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel lblBil2 = new JLabel("Bilangan 2"); 		// Input Bilangan 2 (Nilai Ubah)
		lblBil2.setFont(new Font("Arial", Font.BOLD, 14));
		lblBil2.setBounds(245, 80, 100, 20);
		contentPane.add(lblBil2);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(230, 100, 100, 40);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		txtBil2.setBackground(new Color(135, 206, 250));
		txtBil2.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel lblHasil = new JLabel("Hasil");			// Hasil
		lblHasil.setFont(new Font("Arial", Font.BOLD, 14));
		lblHasil.setBounds(385, 80, 100, 20);
		contentPane.add(lblHasil);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setBounds(355, 100, 100, 40);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		txtHasil.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel cbOperator = new JLabel("Operator");
		cbOperator.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbOperator.setBounds(150, 80, 92, 21);
		contentPane.add(cbOperator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		comboBox.setBounds(150, 100, 50, 40);
		contentPane.add(comboBox);
		
		
		// ======= Mengambil Input dan Menangani Error =======
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hasil=0;
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Bilangan 1 Harus Di Isi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Bilangan 2 Harus diisi ");
				} else {
					// 1. Validasi dan Parsing Input
					try {
						int a = Integer.parseInt(txtBil1.getText()); // Nilai Awal atau Bilangan 1
						int b = Integer.parseInt(txtBil2.getText()); // Nilai Pengubah atau Bilangan 2
						int c = comboBox.getSelectedIndex();; // Hasil
	
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
					} catch (NumberFormatException ex) {
							pesanEror ("Bilangan 1 dan Bilangan 2 harus diisi angka");
						}
					txtHasil.setText(String.valueOf(hasil));
					}
				}
		});
			btnNewButton.setBounds(365, 151, 80, 20);
			contentPane.add(btnNewButton);
}}