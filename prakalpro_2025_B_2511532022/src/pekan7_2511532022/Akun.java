package tugasAlproPekan7_2511532022;

public class Akun {
	private String username;
	private String password;
	private String email;
	private int pinAngka;
	
	public Akun ( String username, String password, String email, int pinAngka) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.pinAngka = pinAngka;
	}
	
// ini SETTER ya
	public void setUsername (String username) {
		this.username = username;
	}
	public void setPassword (String password) {
		this.password = password;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	public void setPinAngka (int pinAngka) {
		this.pinAngka = pinAngka;
	}
	
// nah ini GETTER nya ya
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public int getPinAngka() {
		return pinAngka;
	}
	
// ini HELPER METHOD VALIDATION nya ,OK
	public boolean isPasswordValid() {
		return this.password.length() >= 8;
	}
	public boolean isEmailValid() {
		return this.email.indexOf('@') != -1 && this.email.indexOf('.') != -1;
	}
	public boolean isPinAngkaValid() {
		return String.valueOf(this.pinAngka).length()==6;
	}
}
