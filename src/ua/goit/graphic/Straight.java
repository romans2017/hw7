package ua.goit.graphic;

import java.util.Objects;

public class Straight extends Shape {

    private final Point pointStart;
    private final Point pointEnd;

    public Straight(Point pointStart, Point pointEnd) {
        this(Colors.Black, pointStart, pointEnd);
    }

    public Straight(Colors color, Point pointStart, Point pointEnd) {
        super(color);
        this.type = "Line-straight";
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Point getPointStart() {
        return pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointStart, pointEnd, color, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Straight straight = (Straight) o;
        return Objects.equals(pointStart, straight.pointStart)
                && Objects.equals(pointEnd, straight.pointEnd)
                && color.equals(straight.color)
                && type.equals(straight.type);
    }

    @Override
    public String toString() {
        return type + "{" +
                "color='" + color + '\'' +
                ", pointStart=" + pointStart +
                ", pointEnd=" + pointEnd +
                '}';
    }

    @Override
    public Straight clone() throws CloneNotSupportedException {
        return new Straight(
                color,
                pointStart.clone(),
                pointEnd.clone());
    }

    @Override
    public void move(int shiftX, int shiftY) {
        pointStart.shift(shiftX, shiftY);
        pointEnd.shift(shiftX, shiftY);
    }
}
