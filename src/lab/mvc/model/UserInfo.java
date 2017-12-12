package lab.mvc.model;

public class UserInfo {

	private String email;
	private String password;
	private String firstName;
	private String lastName;	
	private String tel;
	private String houseId;
	public UserInfo(String email, String password, String firstName,
			String lastName, String tel, String houseId) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tel = tel;
		this.houseId = houseId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	
}
