package com.hexaware.springrest.user.entity;
/*
 * @Author : Praveen
 * Modified On : 06-Aug-2025
 * Description : User Entity class
 * 
 */
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
@Entity
@Setter
@Getter
@AllArgsConstructor  // parameterised constructor
@ToString
@NoArgsConstructor // 
public class User {
	
	@Id
	private int userId;
	private String userName;
	private String address;
	private LocalDate dob;
	private String aadhaarNumber;
	private String panNumber;
	private String email;
}
