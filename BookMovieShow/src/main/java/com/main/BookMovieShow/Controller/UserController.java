package com.main.BookMovieShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.UserDto;
import com.main.BookMovieShow.Service.UserService;

//user controller
@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

    // API to get a user by ID
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long userId) {
    	 UserDto user = userService.getUserById(userId);              
         return ResponseEntity.ok(user);
    }

    // API to get all users
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
    	List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    // API to register a new user
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDto userDto) {
    	// Placeholder logic - register a new user
        userService.registerUser(userDto);
        return ResponseEntity.ok("User registered successfully!");
    }

    // API to update user details
    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable Long userId, @RequestBody UserDto userDto) {
    	userService.updateUser(userId, userDto);
    	return ResponseEntity.ok("User is updated successfully!");
    }

    // API to delete a user by ID
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
    	userService.deleteUser(userId);
        return ResponseEntity.ok("User deleted Successfully");
    }
}

