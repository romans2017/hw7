package ua.goit.graphic;

import java.util.Arrays;

public class BrokenLine extends Line {
    private Point[] points;

    public BrokenLine(Point[] points) {
        super();
        this.type += "-broken";
        this.points = points.clone();
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenLine that = (BrokenLine) o;
        return Arrays.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "points=" + Arrays.toString(points) +
                ", color='" + color + '\'' +
                '}';
    }
}
