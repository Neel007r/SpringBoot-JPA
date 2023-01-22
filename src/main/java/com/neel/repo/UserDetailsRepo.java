package com.neel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neel.entity.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {

}
