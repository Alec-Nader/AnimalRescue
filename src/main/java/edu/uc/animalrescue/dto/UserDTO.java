package edu.uc.animalrescue.dto;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user")
@Entity
public class UserDTO {

	public enum Permission { ADMIN, USER, EMPLOYEE }
    // Required Parameters for a pet
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;
    private String email;
    private String username;
    private String password;
    private String salt;
    private Permission permission;   
    private boolean isAccountActive;
    
    public UserDTO() {
    	
    }
    
    public UserDTO(String email, String username, String password) {
    	this.email = Objects.requireNonNull(email);
    	this.username = Objects.requireNonNull(username);
        this.password = Objects.requireNonNull(password);
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public boolean isAccountActive() {
		return isAccountActive;
	}

	public void setAccountActive(boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}
}
