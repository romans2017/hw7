package ua.goit.graphic;

import ua.goit.handlers.CanFill;

import java.util.Objects;

public class Quad extends Shape implements CanFill {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Quad(Point pointA, Point pointB, Point pointC, Point pointD) {
        super();
        this.type = "Quad";
        this.pointA = new Point(pointA);
        this.pointB = new Point(pointB);
        this.pointC = new Point(pointC);
        this.pointD = new Point(pointD);
    }

    public Quad(Colors color, Point pointA, Point pointB, Point pointC, Point pointD) {
        super(color);
        this.type = "Quad";
        this.pointA = new Point(pointA);
        this.pointB = new Point(pointB);
        this.pointC = new Point(pointC);
        this.pointD = new Point(pointD);
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = new Point(pointA);
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = new Point(pointB);
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = new Point(pointC);
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = new Point(pointD);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return pointA.equals(quad.pointA)
                && pointB.equals(quad.pointB)
                && pointC.equals(quad.pointC)
                && pointD.equals(quad.pointD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointA, pointB, pointC, pointD);
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
}
