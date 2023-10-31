package com.vinicius.webservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.webservice.domain.Post;
import com.vinicius.webservice.repository.PostRepository;
import com.vinicius.webservice.services.exception.objectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Optional<Post> findById(String id) {
		Optional<Post> post = repo.findById(id);
		if (post == null) {
			throw new objectNotFoundException("Objeto não encontrado");
		}

		return post;
	}


	

}
