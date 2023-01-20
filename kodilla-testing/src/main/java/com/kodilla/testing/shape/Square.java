package com.kodilla.testing.shape;

public class Square implements Shape {
    private static final String name = "Square";
    private double squareSide;

    public Square(double squereSide) {
        this.squareSide = squereSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.squareSide, squareSide) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(squareSide);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getFiled() {
        return squareSide*squareSide;
    }
}
