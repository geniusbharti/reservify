package com.main.BookMovieShow.Dto;

import com.main.BookMovieShow.Entity.User;

public class UserDto {
	    private Long userId;
	    private String username;
	    private String password;
	    private String email;
	    private Long phoneNumber;
	    
	    
	 // Getters and Setters...
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		
		

         public UserDto(){}
		
		/**
		 * @param userId
		 * @param username
		 * @param password
		 * @param email
		 * @param phoneNumber
		 */
		public UserDto(Long userId, String username, String password, String email, Long phoneNumber) {
			super();
			this.userId = userId;
			this.username = username;
			this.password = password;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}
		
		
		@Override
		public String toString() {
			return "UserDto [userId=" + userId + ", username=" + username + ", password=" + password + ", email="
					+ email + ", phoneNumber=" + phoneNumber + "]";
		}
		
		public static User prepareUserEntity(UserDto userDto) {
			User user = new User();
			user.setUserId(userDto.getUserId());
			user.setUsername(userDto.getUsername());
			user.setPassword(userDto.getPassword());
			user.setEmail(userDto.getEmail());
			user.setPhoneNumber(userDto.getPhoneNumber());
			return user;
			
		}
	    
		
}
