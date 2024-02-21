package com.main.BookMovieShow.exception;

public class ShowNotFoundException extends RuntimeException{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowNotFoundException() {}
	
	public ShowNotFoundException(Long showId) {
		super("Show not found with show Id: " + showId);
	}
	
	@Override
    public String getMessage() {
        return super.getMessage();
    }
}
