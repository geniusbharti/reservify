package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.UserDto;

public interface UserService {
			UserDto getUserById(Long userId);
		
		    List<UserDto> getAllUsers();
		
		    void registerUser(UserDto userDto);
		
		    UserDto updateUser(Long userId, UserDto userDto);
		
		    void deleteUser(Long userId);

			void updateUsername(Long userId, String newUsername);

			void updatePhoneNumber(Long userId, Long newPhoneNumber);

			void updateEmail(Long userId, String newEmail);
}
