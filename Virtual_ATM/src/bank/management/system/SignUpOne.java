package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Random;

import javax.swing.*;


public class SignUpOne extends JFrame{
	
	JTextField nameTextField,fathernameTextField,emailTextField,addTextField,cityTextField,pincodeTextField,stateTextField;
	
	 SignUpOne() {
		 	Random ran = new Random(); 
		 	long Random =  Math.abs(ran.nextLong()%9000L) + 1000L ;
		 	setLayout(null); /// To override default layout so that new positions of objects can be defined
		 	
		 	//ATM LOGO
		 	
		 	ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/logo.jpg"));
		 	Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
		 	ImageIcon i3 =new ImageIcon(i2); 
		 	JLabel atm_logo = new JLabel(i3);
		 	atm_logo.setBounds(10, 10, 190, 70);
		 	add(atm_logo);
		 	
		 	///Form Header
		 	JLabel formno = new JLabel("Application Form Number : "+Random);
		 	formno.setBounds(200, 10, 500, 30);
		 	formno.setFont(new Font("Raleway", Font.BOLD, 28));
		 	add(formno);
		 	
		 	//Page Specification
		 	
		 	JLabel page = new JLabel("Page 1 : Personal Details");
		 	page.setBounds(290, 70, 300, 30);
		 	page.setFont(new Font("Raleway", Font.BOLD, 22));
		 	add(page);
		 	
		 	//Fields
		 	
		 	JLabel name = new JLabel("Name :");
		 	name.setBounds(130, 150, 200, 30);
		 	name.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(name);
		 	
		 	nameTextField = new JTextField();
		 	nameTextField.setBounds(350, 150, 400, 30);
		 	nameTextField.setFont(new Font("Arial", Font.BOLD,14));
		 	add(nameTextField);
		 	
		 	
		 	JLabel father_name = new JLabel("Father's Name :"); 
		 	father_name.setBounds(130, 200, 200, 30);
		 	father_name.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(father_name);
		 	
		 	fathernameTextField = new JTextField();
		 	fathernameTextField.setBounds(350, 200, 400, 30);
		 	fathernameTextField.setFont(new Font("Arial", Font.BOLD,14));
		 	add(fathernameTextField);
		 	
		 	JLabel dob = new JLabel("Date Of Birth :"); 
		 	dob.setBounds(130, 250, 200, 30);
		 	dob.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(dob);
		 	
		 	JLabel gender = new JLabel("Gender :"); 
		 	gender.setBounds(130, 300, 200, 30);
		 	gender.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(gender);
		 	
		 	JLabel email = new JLabel("Email Address :"); 
		 	email.setBounds(130, 350, 200, 30);
		 	email.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(email);
		 	
		 	emailTextField = new JTextField();
		 	emailTextField.setBounds(350, 350, 400, 30);
		 	emailTextField.setFont(new Font("Arial", Font.BOLD,14));
		 	add(emailTextField);

		 	JLabel marriage = new JLabel("Maritial Status:"); 
		 	marriage.setBounds(130, 400, 200, 30);
		 	marriage.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(marriage);
		 	
		 	JLabel address = new JLabel("Address:"); 
		 	address.setBounds(130, 450, 200, 30);
		 	address.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(address);
		 	
		    addTextField = new JTextField();
		    addTextField.setBounds(350, 450, 400, 30);
		    addTextField.setFont(new Font("Arial", Font.BOLD,14));
		 	add(addTextField);
		 	
		 	JLabel city = new JLabel("City:"); 
		 	city.setBounds(130, 500, 200, 30);
		 	city.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(city);
		 	
		 	cityTextField = new JTextField();
		    cityTextField.setBounds(350, 500, 400, 30);
		    cityTextField.setFont(new Font("Arial", Font.BOLD,14));
		 	add(cityTextField);
		 	
		 	JLabel pincode = new JLabel("Pincode:"); 
		 	pincode.setBounds(130, 550, 200, 30);
		 	pincode.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(pincode);
		 	
		 	pincodeTextField = new JTextField();
		 	pincodeTextField.setBounds(350, 550, 400, 30);
		 	pincodeTextField.setFont(new Font("Arial", Font.BOLD,14));
		 	add(pincodeTextField);
		 	
		 	JLabel state = new JLabel("State:"); 
		 	state.setBounds(130, 600, 200, 30);
		 	state.setFont(new Font("Raleway", Font.BOLD, 18));
		 	add(state);
		 	
		 	stateTextField = new JTextField();
		 	stateTextField.setBounds(350, 600, 400, 30);
		 	stateTextField.setFont(new Font("Arial", Font.BOLD,14));
		 	add(stateTextField);
		 	
		 	
			setSize(850,800);
			setVisible(true);
			setLocation(550,150);
			setTitle("SignUp Page One");
			getContentPane().setBackground(Color.WHITE);
		
	}

	public static void main(String[] args) {
		
		new SignUpOne();
	}

	

}
