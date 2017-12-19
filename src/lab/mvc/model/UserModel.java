package lab.mvc.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class UserModel {

	private String email;
	private String pseudo;
	private String password;
	private String firstName;
	private String lastName;	
	private String tel;
	private String houseId;
	
	public UserModel(String email, String password, String firstName,
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
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
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

	public boolean addUser() {
		
		try {
			UsualFunctions f = new UsualFunctions();
			Connection c = f.connectDB();
		
			Statement s = c.createStatement();
			
			s.close();
			c.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
