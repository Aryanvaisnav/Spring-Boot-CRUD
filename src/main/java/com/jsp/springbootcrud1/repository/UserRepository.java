package com.jsp.springbootcrud1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.springbootcrud1.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	@Query ("Select u from User u where u.email=:myemail AND u.password=:mypassword")
	User validateUser(@Param("myemail") String email, @Param("mypassword") String password);
	
	

		

}
