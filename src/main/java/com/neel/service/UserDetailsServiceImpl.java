package com.neel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neel.entity.UserDetails;
import com.neel.repo.UserDetailsRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;

	@Override
	public UserDetails save(UserDetails theUserDetails) {
		return userDetailsRepo.save(theUserDetails);

	}

}
