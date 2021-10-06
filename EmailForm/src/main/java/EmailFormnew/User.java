package EmailFormnew;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class User {
	
	@Email
	private String email;
	
	private String username;
	
	@Size(min=4 ,max=12)
	private Long password;
	/*
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String username, Long password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}
*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getPassword() {
		return password;
	}
	public void setPassword(Long password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", username=" + username + ", password=" + password + "]";
	}
	

}
