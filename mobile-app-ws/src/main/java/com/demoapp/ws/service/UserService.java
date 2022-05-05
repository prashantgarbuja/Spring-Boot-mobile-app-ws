package com.demoapp.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demoapp.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	
}
