package pekan9_2511532022;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_2511532022 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_2511532022 frame = new Calculator_2511532022();
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
	public Calculator_2511532022() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 197, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setForeground(new Color(255, 255, 255));
		btnBackspace.setBackground(new Color(0, 0, 0));
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 14));
		btnBackspace.setBounds(10, 72, 50, 50);
		contentPane.add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBackground(Color.BLACK);
		btn7.setBounds(10, 122, 50, 50);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBackground(Color.BLACK);
		btn4.setBounds(10, 172, 50, 50);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBackground(Color.BLACK);
		btn1.setBounds(10, 222, 50, 50);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBackground(Color.BLACK);
		btn0.setBounds(10, 272, 50, 50);
		contentPane.add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(59, 72, 50, 50);
		contentPane.add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBackground(Color.BLACK);
		btn8.setBounds(59, 122, 50, 50);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBackground(Color.BLACK);
		btn5.setBounds(59, 172, 50, 50);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBackground(Color.BLACK);
		btn2.setBounds(59, 222, 50, 50);
		contentPane.add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(new Color(255, 255, 255));
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBackground(Color.BLACK);
		btnDot.setBounds(59, 272, 50, 50);
		contentPane.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (operation=="+") {
					result=first + second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="-") {
					result=first - second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="*") {
					result=first * second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="/") {
					result=first / second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="%") {
					result=first % second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
				
				
			}
		});
		btnEqual.setForeground(new Color(255, 255, 255));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.setBackground(Color.BLACK);
		btnEqual.setBounds(108, 272, 50, 50);
		contentPane.add(btnEqual);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBackground(Color.BLACK);
		btn3.setBounds(108, 222, 50, 50);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBackground(Color.BLACK);
		btn6.setBounds(108, 172, 50, 50);
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBackground(Color.BLACK);
		btn9.setBounds(108, 122, 50, 50);
		contentPane.add(btn9);
		
		JButton btnDoubleZero = new JButton("00");
		btnDoubleZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDoubleZero.getText();
				textField.setText(number);
			}
		});
		btnDoubleZero.setForeground(new Color(255, 255, 255));
		btnDoubleZero.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDoubleZero.setBackground(Color.BLACK);
		btnDoubleZero.setBounds(108, 72, 50, 50);
		contentPane.add(btnDoubleZero);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setForeground(new Color(255, 255, 255));
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.setBackground(Color.BLACK);
		btnPlus.setBounds(157, 72, 50, 50);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setForeground(new Color(255, 255, 255));
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMinus.setBackground(Color.BLACK);
		btnMinus.setBounds(157, 122, 50, 50);
		contentPane.add(btnMinus);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setForeground(new Color(255, 255, 255));
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMul.setBackground(Color.BLACK);
		btnMul.setBounds(157, 172, 50, 50);
		contentPane.add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setForeground(new Color(255, 255, 255));
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDivide.setBackground(Color.BLACK);
		btnDivide.setBounds(157, 222, 50, 50);
		contentPane.add(btnDivide);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnMod.setForeground(new Color(255, 255, 255));
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMod.setBackground(Color.BLACK);
		btnMod.setBounds(157, 272, 50, 50);
		contentPane.add(btnMod);

	}
}
