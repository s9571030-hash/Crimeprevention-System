package com.starter.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starter.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User>findByUsername(String username);

}
