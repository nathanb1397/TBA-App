import java.net.*;

public class main {

	public static void main(String[] args) throws Exception {
		
		 URL aURL = new URL("https://www.thebluealliance.com:443" + "/frc4322:TBA_App:test");
		 
		 System.out.println("protocol = " + aURL.getProtocol());
		 System.out.println("authority = " + aURL.getAuthority());
		 System.out.println("host = " + aURL.getHost());
		 System.out.println("port = " + aURL.getPort());
		 System.out.println("path = " + aURL.getPath());
		 System.out.println("query = " + aURL.getQuery());
		 System.out.println("filename = " + aURL.getFile());
		 System.out.println("ref = " + aURL.getRef());
	}
}
