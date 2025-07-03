package com.dkte;


public class Point2D {
    private double x;
    private double y;

    // Parameterized constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to return string form of point's coordinates
    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // Method to check equality of two points
    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    // Method to calculate distance between two points
    public double calculateDistance(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
