import java.awt.*;
import javax.swing.*;

public class LoginWindow extends JFrame {
	
	private JLabel label;
	private JButton login;
	private JTextField teamLogin;
	
	public LoginWindow() {
		setLayout(new FlowLayout());
		
		label = new JLabel("Please enter your Team # to proceed.");
		add(label);
		
		teamLogin = new JTextField(15);
		add(teamLogin);
		
		login = new JButton("Login");
		add(login);
	}
}
