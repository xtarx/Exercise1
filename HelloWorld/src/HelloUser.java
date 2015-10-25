import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloUser {
	private String userName;
	
	public HelloUser(){
	}
	public void greetUser(String user){
		System.out.println("Hello "+ user);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public static void main(String[] args){
		HelloUser user = new HelloUser();
		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.print("Please enter your name: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input="";
		try {
			input = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.greetUser(input);
	}

	}
	
