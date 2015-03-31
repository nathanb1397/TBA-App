import javax.swing.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int teamNumber = 0;
		boolean loggedin = false;
		
		if(teamNumber == 0) {
	    LoginWindow loginGui = new LoginWindow();
	    loginGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    loginGui.setVisible(true);
	    loginGui.setSize(225,115);
	    loginGui.setLocationRelativeTo(null);
	    loginGui.setResizable(false);
	    loginGui.setTitle("Login");
		}
		else if(teamNumber != 0)
		{
			
		}
		
	}

}
