package ua.goit.graphic;

import java.util.Objects;

/**
 * The Point class describes methods and properties of points. Point is an object that specified using Cartesian
 * coordinates. Origin point is in upper left corner of screen so there no can be points with negative coordinates.
 * Passing negative arguments to a constructor or methods setX(), setY(), shift() in this class will cause
 * a IllegalArgumentException to be thrown
 * */

public class Point extends Shape {

    private int x;
    private int y;

    public Point(Colors color, int x, int y) throws IllegalArgumentException {
        super(color);
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("x and y must be non-negative");
        }
        this.type = "Point";
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) throws IllegalArgumentException {
        this(Colors.Black, x, y);
    }

    public Point(Point point) {
        super();
        this.type = "Point";
        this.x = point.x;
        this.y = point.y;
        this.color = point.color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("y of Point must be non-negative");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws IllegalArgumentException {
        if (y < 0) {
            throw new IllegalArgumentException("y of Point must be non-negative");
        }
        this.y = y;
    }

    public void shift(int shiftX, int shiftY) throws IllegalArgumentException {
        setX(x + shiftX);
        setY(y + shiftY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x
                && y == point.y
                && color.equals(point.color)
                && type.equals(point.type);
    }

    @Override
    public String toString() {
        return type + "{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color.toString() + '\'' +
                '}';
    }

    @Override
    public Shape copy() {
        return new Point(this);
    }

    @Override
    public void move(int shiftX, int shiftY) {
        shift(shiftX, shiftY);
    }
}
