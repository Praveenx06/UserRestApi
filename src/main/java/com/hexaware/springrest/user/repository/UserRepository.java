package com.hexaware.springrest.user.repository;
/*
 * @Author : Praveen
 * Modified On : 06-Aug-2025
 * Description : UserRepository interface with Jparepo extends
 * 
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.springrest.user.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
