package ua.goit.graphic;

import java.util.Objects;

public class Point extends Shape {
    private int x;
    private int y;

    public Point(Colors color, int x, int y) throws IllegalArgumentException {
        super(color);
        if (x<0 || y<0) {
            throw new IllegalArgumentException("x and y must be non-negative");
        }
        this.type = "Point";
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) throws IllegalArgumentException {
        super();
        if (x<0 || y<0) {
            throw new IllegalArgumentException("x and y must be non-negative");
        }
        this.type = "Point";
        this.x = x;
        this.y = y;
    }

    public Point(Point aPoint) {
        super();
        this.type = "Point";
        this.x = aPoint.x;
        this.y = aPoint.y;
        this.color = aPoint.color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) throws IllegalArgumentException {
        if (x<0) {
            throw new IllegalArgumentException("y of Point must be non-negative");
        }
        this.x = x;
    }

    public void setY(int y) throws  IllegalArgumentException{
        if (y<0) {
            throw new IllegalArgumentException("y of Point must be non-negative");
        }
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y,color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y && color.equals(point.color);
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color.toString() + '\'' +
                '}';
    }

    public void shift(int shiftX, int shiftY) throws IllegalArgumentException {
        setX(getX() + shiftX);
        setY(getY() + shiftY);
    }

}
