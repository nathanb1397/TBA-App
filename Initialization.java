import java.awt.*;
import javax.swing.*;

public class Initialization extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JButton login;
	private JTextField teamLogin;
	
	public Initialization() {
		setLayout(new FlowLayout());
		
		label = new JLabel("Please enter your Team # to proceed.");
		add(label);
		
		teamLogin = new JTextField(15);
		add(teamLogin);
		
		login = new JButton("Login");
		add(login);
	}
}
