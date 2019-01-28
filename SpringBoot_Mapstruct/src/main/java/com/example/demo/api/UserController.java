
package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto1.UserDto;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model1.User;

@RestController
	@RequestMapping("/user")
	public class UserController {

	@PostMapping(value="/post")
	 public UserDto findAll(@RequestBody User user)
	 {
		 UserDto dt = UserMapper.INSTANCE.userToDto(user);
		 return dt;

	 }
	@GetMapping(value ="/get")
	public User save(UserDto user)
	{
	User d = UserMapper.INSTANCE.dtoToUser(user);
	return d;
	}

	}

