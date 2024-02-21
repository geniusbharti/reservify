package com.main.BookMovieShow.exception;

public class NoSuchUserExistsException extends RuntimeException{
    
	private static final long serialVersionUID = 1L;

	public NoSuchUserExistsException() {}
	
	public NoSuchUserExistsException(Long userId) {
		super("User not found with user Id: " + userId);
	}
	
	@Override
    public String getMessage() {
        return super.getMessage();
    }
	
	
}
