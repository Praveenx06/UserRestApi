package com.hexaware.springrest.user.controller;
/*
 * @Author : Praveen
 * Modified On : 06-Aug-2025
 * Description : UserController class with with slf4j
 * 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.user.Dto.UserDto;
import com.hexaware.springrest.user.entity.User;
import com.hexaware.springrest.user.service.IUserService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	IUserService service;
	
		@PostMapping("/adduser")
		public User adduser(@RequestBody @Valid UserDto dto) {
			log.info("user data added successfully");
			return service.adduser(dto);
			
		}
		@GetMapping("/getalluser")
		public List<User> getAllStudent(){
			log.info("All user retrieved successfully");
			return service.getAllStudent();
		}
		
		@DeleteMapping("/deletebyid/{userId}")
		public String deleteUserById(@PathVariable int userId) {
			log.info("User data deleted using Id");
			return service.deleteUserById(userId);
			
		}
		
		@GetMapping("/getbyId/{userId}")
		public User getById(@PathVariable int userId) {
			log.info("User data retrieved using Id");
			return service.getById(userId);
			
		}
		
		
		
	}


