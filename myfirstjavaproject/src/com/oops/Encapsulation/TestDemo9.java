package com.oops.Encapsulation;

class Login{
	private String userName;
	private String password;
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void login(String username,String password) {
		if(this.userName.equals(username)&& this.password.equals(password)) {
			System.out.println("Login successfull");
		}
		else {
			System.out.println("invalid username");
		}
	}
}
public class TestDemo9 {

	public static void main(String[] args) {
		Login l=new Login();
		l.setUserName("siddu");
		l.setPassword("siddu123");
		l.login("siddu", "siddu123");
		l.login("siddu", "siffk123");
	}

}
