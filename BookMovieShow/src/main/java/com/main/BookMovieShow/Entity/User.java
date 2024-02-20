package com.main.BookMovieShow.Entity;

import com.main.BookMovieShow.Dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    private Long userId;
	
	@Column(name="user_name")
    private String username;
	
    private String password;
    private String email;
    private Long phoneNumber;
   
	/**
	 * 
	 */
	public User() {}	
	
	/**
	 * @param userId
	 * @param username
	 * @param password
	 * @param email
	 * @param phoneNumber
	 */
	
	public User(Long userId, String username, String password, String email, Long phoneNumber) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	

	// Getters and Setters, Constructors, etc.

	
    public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}

	
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	
	public static UserDto prepareUserDTO(User user) {
		UserDto userDto = new UserDto();
		userDto.setUserId(user.getUserId());
		userDto.setUsername(user.getUsername());
		userDto.setPassword(user.getPassword());
		userDto.setEmail(user.getEmail());
		userDto.setPhoneNumber(user.getPhoneNumber());
		return userDto;
		
	}    
    
}
