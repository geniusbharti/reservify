package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.UserDto;

public interface UserService {
			UserDto getUserById(Long userId);
		
		    List<UserDto> getAllUsers();
		
		    void registerUser(UserDto userDto);
		
		    void updateUser(Long userId, UserDto userDto);
		
		    void deleteUser(Long userId);

}
