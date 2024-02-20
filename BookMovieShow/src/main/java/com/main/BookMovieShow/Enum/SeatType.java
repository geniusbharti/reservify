package com.main.BookMovieShow.Enum;

public enum SeatType {
    STANDARD(10.0),
    RECLINER(20.0),
    GOLD(25.0);

    private final double baseFare;

    SeatType(double baseFare) {
        this.baseFare = baseFare;
    }

    public double getBaseFare() {
        return baseFare;
    }
}
