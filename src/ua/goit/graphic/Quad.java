package ua.goit.graphic;

import ua.goit.handlers.Fillable;

import java.util.Objects;

public class Quad extends Shape implements Fillable {

    private final Point pointA;
    private final Point pointB;
    private final Point pointC;
    private final Point pointD;

    public Quad(Point pointA, Point pointB, Point pointC, Point pointD) {
        this(Colors.Black, pointA, pointB, pointC, pointD);
    }

    public Quad(Colors color, Point pointA, Point pointB, Point pointC, Point pointD) {
        super(color);
        this.type = "Quad";
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return Objects.equals(pointA, quad.pointA)
                && Objects.equals(pointB, quad.pointB)
                && Objects.equals(pointC, quad.pointC)
                && Objects.equals(pointD, quad.pointD)
                && color.equals(quad.color)
                && type.equals(quad.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointA, pointB, pointC, pointD, color, type);
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "color='" + color + '\'' +
                ", A=" + pointA +
                ", B=" + pointB +
                ", C=" + pointC +
                ", D=" + pointD +
                '}';
    }

    @Override
    public String fill(Colors fillColor) {
        return "Quad " + toString() + " is filled with " + fillColor;
    }

    @Override
    public Quad clone() throws CloneNotSupportedException {
        return new Quad(
                color,
                pointA.clone(),
                pointB.clone(),
                pointC.clone(),
                pointD.clone());
    }

    @Override
    public void move(int shiftX, int shiftY) {
        pointA.shift(shiftX, shiftY);
        pointB.shift(shiftX, shiftY);
        pointC.shift(shiftX, shiftY);
        pointD.shift(shiftX, shiftY);
    }
}
