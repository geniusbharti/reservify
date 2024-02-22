package com.main.BookMovieShow.exception;

public class SeatNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SeatNotFoundException() {}
	
	public SeatNotFoundException(Long seatId) {
		super("Seat not found with seat Id: " + seatId);
	}
	
	@Override
    public String getMessage() {
        return super.getMessage();
    }
}
