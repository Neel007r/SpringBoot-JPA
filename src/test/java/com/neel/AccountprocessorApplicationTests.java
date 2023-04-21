package com.neel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.neel.entity.UserDetails;
import com.neel.service.UserDetailsService;

@SpringBootTest
class AccountprocessorApplicationTests {

	@Autowired
	private UserDetailsService userDetailsService;

	@Test
	void contextLoads() {
	}

	@Test
	void addDetails() {
//		UserDetails userD = new UserDetails("Neel", "Patel", "neel@gmail.com");
//		userDetailsService.save(userD);
//		System.out.println("User created");      //wrong test

		UserDetails userD = new UserDetails("Neel", "Patel", "neel@gmail.com");
		UserDetails userD2 = new UserDetails("Nel", "Patel", "nel@gmail.com");
		UserDetails actual = userDetailsService.save(userD2);
		assertEquals(userD2, actual);
	}

	@BeforeEach
	void setUp() {
		System.out.println("setting up");
	}

	@AfterEach
	void destroy() {
		System.out.println("closing");
	}

}
