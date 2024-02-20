package com.main.BookMovieShow.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.BookMovieShow.Dto.UserDto;
import com.main.BookMovieShow.Entity.User;
import com.main.BookMovieShow.Repository.UserRepository;
import com.main.BookMovieShow.Service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDto getUserById(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		User userEntity = user.get();
		UserDto userDto = User.prepareUserDTO(userEntity);
		return userDto;
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users = userRepository.findAll();
        return users.stream().map(User::prepareUserDTO).collect(Collectors.toList());
	}

	@Override
	public void registerUser(UserDto userDto) {
		User user = userDto.prepareUserEntity(userDto);
        userRepository.save(user);
	}

//	@Override
//	public UserDto updateUser(Long userId, UserDto userDto) {
//		Optional<User> userOptional = userRepository.findById(userId);
//		
//	}

	@Override
	public void deleteUser(Long userId) {
		 userRepository.deleteById(userId);
	}
	
	@Override
	public void updateUsername(Long userId, String newUsername) {
	    Optional<User> userOptional = userRepository.findById(userId);

	    if (userOptional.isPresent()) {
	        User existingUser = userOptional.get();
	        
	        // Update the username
	        existingUser.setUsername(newUsername);

	        // Save the updated user to the repository
	        userRepository.save(existingUser);
	    }

//	    return null; // Return null if the user with the specified ID is not found
	}
	
	@Override
	public void updatePhoneNumber(Long userId, Long newPhoneNumber) {
	    Optional<User> userOptional = userRepository.findById(userId);

	    if (userOptional.isPresent()) {
	        User existingUser = userOptional.get();
	        
	        // Update the phone number
	        existingUser.setPhoneNumber(newPhoneNumber);

	        // Save the updated user to the repository
	        userRepository.save(existingUser);
	    }

	 
	}

	
	@Override
	public void updateEmail(Long userId, String newEmail) {
	    Optional<User> userOptional = userRepository.findById(userId);

	    if (userOptional.isPresent()) {
	        User existingUser = userOptional.get();
	        
	        // Update the email
	        existingUser.setEmail(newEmail);

	        // Save the updated user to the repository
	        userRepository.save(existingUser);
	        
	    }
	}

	@Override
	public UserDto updateUser(Long userId, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
