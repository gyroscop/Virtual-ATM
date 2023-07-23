package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JTextField cardTextField ;
	JPasswordField pinTextField ;
	JButton signin, clear, signup ;
	
	Login(){
		


		
		//add image
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100,100);
		setLayout(null);///to abort default layout and set custom layout.  
		add(label);
		
		//add Welcome msg
		JLabel text = new JLabel("Welcome to VTM");
		text.setBounds(200, 40, 400, 40);
		text.setFont(new Font("Osward", Font.BOLD,38));
		add(text);
		
		//add textbox
		JLabel cardno = new JLabel("Card No :");
		cardno.setBounds(120, 150, 250, 30);
		cardno.setFont(new Font("Raleway", Font.BOLD,28));
		add(cardno);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD,14));
		add(cardTextField);
		
		JLabel pin = new JLabel("Pin :");
		pin.setBounds(120, 220, 250, 30);
		pin.setFont(new Font("Raleway", Font.BOLD,28));
		add(pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 230, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD,14));
		add(pinTextField);
		
		//add buttons
		
		signin = new  JButton("Sign In");
		signin.setBounds(300,300,100,30);
		signin.setBackground(Color.BLACK);
		signin.setForeground(Color.WHITE);
		signin.addActionListener(this);
		add(signin);
		
		
		clear = new  JButton("Clear");
		clear.setBounds(430,300,100,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signup = new  JButton("Sign Up");
		signup.setBounds(365,345,100,30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		
		// configure content pan
		setSize(800,480);
		setVisible(true);
		setLocation(550,300);
		setTitle("Your Virtual ATM (VTM)");
		getContentPane().setBackground(Color.WHITE);///set custom color 
	
		
		
		

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
			if(e.getSource()==signin) {
				
			}else if (e.getSource()==clear) {
				cardTextField.setText("");
				pinTextField.setText("");
				
			}else if (e.getSource()==signup) {
				
			}
	}
	
	

	public static void main(String[] args) {
		
		new Login();
	}


	

	

}
