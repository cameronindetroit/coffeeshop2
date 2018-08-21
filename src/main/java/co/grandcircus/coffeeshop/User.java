package co.grandcircus.coffeeshop;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String number;
	private String password;
	private String password2;
	private String age;
	private String confirmedPassword;

	public User(String firstName, String lastName, String email, String number, String password, String age,
			String password2, String confirmedPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.number = number;
		this.password = password;
		this.age = age;
		this.password2 = password2;
		this.confirmedPassword = confirmedPassword;
	}

	public User() {

	}

	public String confirmedPassword(String password, String password2) {

		String confrimedPassword = "";

		if (password.equals(password2)) {

			confrimedPassword = password;
			return confrimedPassword;

		} else {
			return "Passwords do not match. Please go back and try again";
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public void setConfirmedPassword(String confiremdPassword) {
		this.confirmedPassword = confiremdPassword;
	}

	public String getConfirmedPassword() {
		return confirmedPassword;
	}

	public String getAge() {
		return age;

	}

	public void setAge(String age) {
		this.age = age;

	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", number=" + number
				+ ", password=" + password + "]" + ", age=" + age;
	}

}
