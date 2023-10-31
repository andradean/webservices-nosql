package com.vinicius.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.webservice.domain.User;
import com.vinicius.webservice.repository.UserRepository;
import com.vinicius.webservice.services.exception.objectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		
		return repo.findAll();
	}
	
	public Optional<User> findById (String id) {
		Optional<User> user = repo.findById(id);
		if(user == null) {
			throw new objectNotFoundException("Objeto não encontrado");
		}
		
		return user;
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
}
