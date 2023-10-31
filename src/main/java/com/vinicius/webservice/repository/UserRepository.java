package com.vinicius.webservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vinicius.webservice.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
