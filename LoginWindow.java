import java.awt.*;
import java.io.IOException;
import java.net.InetAddress;

import javax.swing.*;

public class LoginWindow extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JButton login;
	private JTextField teamLogin;
	
	private JLabel connectionError;
	private JLabel teamInfo;
	
	public LoginWindow() {
		try(InetAddress.getByName(thebluealliance.com)){
			
		}
		catch(IOException){
			connectionError = new JLabel("No Internet Connection");
		}
		
		setLayout(new FlowLayout());
		
		label = new JLabel("Please enter your Team # to proceed.");
		add(label);
		
		teamLogin = new JTextField(15);
		add(teamLogin);
		
		login = new JButton("Login");
		add(login);
		
		
		
	}
}
