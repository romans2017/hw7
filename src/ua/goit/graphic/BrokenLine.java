package ua.goit.graphic;

import java.util.Arrays;
import java.util.Objects;

public class BrokenLine extends Shape {

    private final Point[] points;

    public BrokenLine(Point[] points) throws CloneNotSupportedException {
        this(Colors.Black, points);
    }

    public BrokenLine(Colors color, Point[] points) throws CloneNotSupportedException {
        super(color);
        this.type = "Line-broken";
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = points[i].clone();
        }
    }

    public Point[] getPoints() {
        return points;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points) * Objects.hash(color, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenLine that = (BrokenLine) o;
        return Arrays.equals(points, that.points)
                && color.equals(that.color)
                && type.equals(that.type);
    }

    @Override
    public String toString() {
        return type + "{" +
                "points=" + Arrays.toString(points) +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public BrokenLine clone() throws CloneNotSupportedException {
        return new BrokenLine(points);
    }

    @Override
    public void move(int shiftX, int shiftY) {
        for (Point point : points) {
            point.shift(shiftX, shiftY);
        }
    }
}
