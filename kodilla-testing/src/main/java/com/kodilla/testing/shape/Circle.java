package com.kodilla.testing.shape;

public class Circle implements Shape {

    private static final String name = "Circle";
    private double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.ray, ray) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(ray);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getFiled() {
        return 3.14 * ray * ray;
    }
}
