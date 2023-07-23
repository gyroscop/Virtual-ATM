package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class Login extends JFrame{
	
	
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
		
		JTextField cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 250, 30);
		add(cardTextField);
		
		JLabel pin = new JLabel("Pin :");
		pin.setBounds(120, 220, 250, 30);
		pin.setFont(new Font("Raleway", Font.BOLD,28));
		add(pin);
		
		JTextField pinTextField = new JTextField();
		pinTextField.setBounds(300, 220, 250, 30);
		add(pinTextField);
		
		
		
		
		setSize(800,480);
		setVisible(true);
		setLocation(550,300);
		setTitle("Your Virtual ATM (VTM)");
		getContentPane().setBackground(Color.WHITE);///set custom color 
		
		
		

	}
	

	public static void main(String[] args) {
		
		new Login();
	}

	

}
