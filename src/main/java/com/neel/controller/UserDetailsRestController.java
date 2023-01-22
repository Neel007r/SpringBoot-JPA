package com.neel.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neel.entity.UserDetails;
import com.neel.service.UserDetailsService;

@RestController
@RequestMapping("/user")
public class UserDetailsRestController {

	private UserDetailsService userDetailsService;

	public UserDetailsRestController(UserDetailsService theUser) {
		userDetailsService = theUser;
	}
	
	@PostMapping("/details")
	public UserDetails addDetails(@RequestBody UserDetails theUser) {
		userDetailsService.save(theUser);
		return theUser;
	}

}
