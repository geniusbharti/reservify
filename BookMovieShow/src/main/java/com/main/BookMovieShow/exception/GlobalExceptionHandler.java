package com.main.BookMovieShow.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.main.BookMovieShow.Response.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoSuchUserExistsException.class)
    public ResponseEntity<ErrorResponse> handleNoSuchUserExistsException(NoSuchUserExistsException ex) {
      ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
	
	@ExceptionHandler(ShowNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleShowNotFoundException(ShowNotFoundException ex) {
      ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
	
}
