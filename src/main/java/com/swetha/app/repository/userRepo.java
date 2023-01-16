package com.swetha.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swetha.app.model.User;

@Repository
public interface userRepo extends CrudRepository<User,Long> {
	User findByEmailIdIgnoreCase(String emailId);

}