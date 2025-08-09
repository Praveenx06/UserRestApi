package com.hexaware.springrest.user.service;
/*
 * @Author : Praveen
 * Modified On : 06-Aug-2025
 * Description : UserService implementation class
 * 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrest.user.Dto.UserDto;
import com.hexaware.springrest.user.entity.User;
import com.hexaware.springrest.user.repository.UserRepository;
@Service
public class UserServiceImp implements IUserService {

	@Autowired
	UserRepository repo;
	
	@Override
	public User adduser(UserDto dto) {
		User user = new User();
		user.setUserId(dto.getUserId());
		user.setAadhaarNumber(dto.getAadhaarNumber());
		user.setAddress(dto.getAddress());
		user.setDob(dto.getDob());
		user.setEmail(dto.getEmail());
		user.setPanNumber(dto.getPanNumber());
		user.setUserName(dto.getUserName());
		
		
		return repo.save(user);
	}

	@Override
	public List<User> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public String deleteUserById(int userId) {
		
		 repo.deleteById(userId);
		 return "Record deleted successfully";
	}

	@Override
	public User getById(int userId) {
		
		return repo.findById(userId).orElse(null);
	}


}
