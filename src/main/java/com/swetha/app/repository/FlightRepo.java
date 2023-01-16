package com.swetha.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swetha.app.model.UserIp;

@Repository
public interface FlightRepo extends CrudRepository<UserIp, Long> {

}