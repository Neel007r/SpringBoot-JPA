package com.neel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neel.entity.UserDetails;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> { //integer is a wrapper class, int type is id defined in UserDetails
	
//	public UserDetails searchById(int id);
	public UserDetails findById(int id);

}
