package ua.goit.graphic;

import java.util.Arrays;
import java.util.Objects;

public class BrokenLine extends Line {
    private Point[] points;

    public BrokenLine(Point[] points) {
        this(Colors.Black, points);
    }

    public BrokenLine(Colors color, Point[] points) {
        super(color);
        this.type += "-broken";
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points) * Objects.hash(color,type);
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
        return getType() + "{" +
                "points=" + Arrays.toString(points) +
                ", color='" + color + '\'' +
                '}';
    }
}
