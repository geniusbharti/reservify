package com.main.BookMovieShow.exception;

public class OptimisticLockingException extends RuntimeException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OptimisticLockingException() {}
	
    public OptimisticLockingException(String message) {
        super(message);
    }
    
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

