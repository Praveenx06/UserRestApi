package com.hexaware.springrest.user.Dto;
/*
 * @Author : Praveen
 * Modified On : 06-Aug-2025
 * Description : User Dto class with neccessary validation .. 
 * 
 */
import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDto {
	@Min(value=10)
	@Max(value=20)
	private int userId;
	@NotEmpty
	private String userName;
	@NotBlank
	private String address;
	@FutureOrPresent(message="Enter Date of birth")
	private LocalDate dob;
	@Pattern(regexp = "\\d{12}", message = "Aadhaar number must be 12 digits")
	private String aadhaarNumber;
	@Pattern (regexp="[A-Z]{5}[0-9]{4}[A-Z]")
	private String panNumber;
	@Email
	private String email;

}
