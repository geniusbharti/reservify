package com.main.BookMovieShow.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import com.main.BookMovieShow.Dto.UserDto;
import com.main.BookMovieShow.Entity.User;
import com.main.BookMovieShow.Repository.UserRepository;
import com.main.BookMovieShow.Service.UserService;
import com.main.BookMovieShow.exception.NoSuchUserExistsException;

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

	@Override
	public void deleteUser(Long userId) {
		 userRepository.deleteById(userId);
	}
	

	@Override
	public void updateUser(Long userId, UserDto updatedUserDto){
		Optional<User> userOptional = userRepository.findById(userId);
		if(userOptional.isPresent()) {
			User existingUser = userOptional.get();
			
			//update
			existingUser.setUsername(updatedUserDto.getUsername());
			existingUser.setPassword(updatedUserDto.getPassword());
			existingUser.setEmail(updatedUserDto.getEmail());
			existingUser.setPhoneNumber(updatedUserDto.getPhoneNumber());
			
			//save
			userRepository.save(existingUser);
		} 
		else throw new NoSuchUserExistsException(userId);
		
	}
	
}
