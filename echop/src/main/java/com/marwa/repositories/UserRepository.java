package com.marwa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marwa.models.User;


	public interface UserRepository extends JpaRepository<User, Long> {
		
	}

