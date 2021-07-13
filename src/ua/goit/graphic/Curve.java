package ua.goit.graphic;

import java.util.Objects;

public class Curve extends Line {

    private final Point pointStart;
    private final Point pointEnd;
    private final Point pointAnchor1;
    private final Point pointAnchor2;

    public Curve(Point pointStart, Point pointEnd, Point pointAnchor1, Point pointAnchor2) {
        this(Colors.Black, pointStart, pointEnd, pointAnchor1, pointAnchor2);
    }

    public Curve(Colors color, Point pointStart, Point pointEnd, Point pointAnchor1, Point pointAnchor2) {
        super(color);
        this.type += "-curve";
        this.pointAnchor1 = pointAnchor1;
        this.pointAnchor2 = pointAnchor2;
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Point getPointStart() {
        return pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public Point getPointAnchor1() {
        return pointAnchor1;
    }

    public Point getPointAnchor2() {
        return pointAnchor2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointStart, pointEnd, pointAnchor1, pointAnchor2, color, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curve curve = (Curve) o;
        return Objects.equals(pointStart, curve.pointStart)
                && Objects.equals(pointEnd, curve.pointEnd)
                && Objects.equals(pointAnchor1, curve.pointAnchor1)
                && Objects.equals(pointAnchor2, curve.pointAnchor2)
                && color.equals(curve.color)
                && type.equals(curve.type);
    }

    @Override
    public String toString() {
        return type + "{" +
                "pointStart=" + pointStart +
                ", pointEnd=" + pointEnd +
                ", pointAnchor1=" + pointAnchor1 +
                ", pointAnchor2=" + pointAnchor2 +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Shape copy() {
        return new Curve(
                color,
                new Point(pointStart),
                new Point(pointEnd),
                new Point(pointAnchor1),
                new Point(pointAnchor2));
    }

    @Override
    public void move(int shiftX, int shiftY) {
        pointStart.shift(shiftX, shiftY);
        pointEnd.shift(shiftX, shiftY);
        pointAnchor1.shift(shiftX, shiftY);
        pointAnchor2.shift(shiftX, shiftY);
    }
}
