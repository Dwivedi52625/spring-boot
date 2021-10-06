package MainForm;

import javax.validation.constraints.Size;

public class Customer {

	private String email;
	@Size(min=8,max=20)
	private String username;
	private Long password;
	private Long contact;
	private String city;
	private Long zipcode;
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
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Customer [email=" + email + ", username=" + username + ", password=" + password + ", contact=" + contact
				+ ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
}
