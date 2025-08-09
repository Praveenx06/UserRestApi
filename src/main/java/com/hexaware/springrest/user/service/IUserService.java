package com.hexaware.springrest.user.service;
/*
 * @Author : Praveen
 * Modified On : 06-Aug-2025
 * Description : User service interface
 * 
 */
import java.util.List;

import com.hexaware.springrest.user.Dto.UserDto;
import com.hexaware.springrest.user.entity.User;

public interface IUserService {
	
	public User adduser(UserDto dto) ;
	public List<User> getAllStudent();
	public String deleteUserById(int userId); 
	public User getById(int userId);
		
	
}
