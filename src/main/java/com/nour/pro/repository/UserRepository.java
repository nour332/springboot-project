package com.nour.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nour.pro.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);

}
