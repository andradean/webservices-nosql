package com.vinicius.webservice.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vinicius.webservice.resources.exception.StandardError;
import com.vinicius.webservice.services.exception.objectNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler  {
	
	@ExceptionHandler(objectNotFoundException.class)
	public ResponseEntity<StandardError> objNotFound(objectNotFoundException e, HttpServletRequest req){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado", e.getMessage(), req.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
}
