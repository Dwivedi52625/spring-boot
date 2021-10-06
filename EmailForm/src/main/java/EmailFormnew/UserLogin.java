package EmailFormnew;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
public class UserLogin {
 
@Email
private String Email;

@Size(min=4,max=14)
private Long Password;
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Long getPassword() {
	return Password;
}
public void setPassword(Long password) {
	Password = password;
}
@Override
public String toString() {
	return "UserLogin [Email=" + Email + ", Password=" + Password + "]";
}
 
}
