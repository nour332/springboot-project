package com.nour.pro.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.nour.pro.dto.UserRegistrationDto;
import com.nour.pro.model.User;



public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

}
