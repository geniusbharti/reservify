package com.main.BookMovieShow.exception;

public class NoSuchBookingExistsException extends RuntimeException{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSuchBookingExistsException() {}
	
	public NoSuchBookingExistsException(Long bookId) {
		super("Booking not found with booking Id: " + bookId);
	}
	
	@Override
    public String getMessage() {
        return super.getMessage();
    }
}
