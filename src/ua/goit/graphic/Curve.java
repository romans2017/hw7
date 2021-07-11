package ua.goit.graphic;

import java.util.Objects;

public class Curve extends Line{
    private Point pointStart;
    private Point pointEnd;
    private Point pointAnchor1;
    private Point pointAnchor2;

    public Curve(Point pointStart, Point pointEnd, Point pointAnchor1, Point pointAnchor2) {
        super();
        this.type += "-curve";
        this.pointAnchor1 = new Point(pointAnchor1.getX(), pointAnchor1.getY());
        this.pointAnchor2 = new Point(pointAnchor2.getX(), pointAnchor2.getY());
        this.pointStart = new Point(pointStart.getX(), pointStart.getY());
        this.pointEnd = new Point(pointEnd.getX(), pointEnd.getY());
    }

    public Curve(Colors color, Point pointStart, Point pointEnd, Point pointAnchor1, Point pointAnchor2) {
        super(color);
        this.type += "-curve";
        this.pointAnchor1 = new Point(color, pointAnchor1.getX(), pointAnchor1.getY());
        this.pointAnchor2 = new Point(color, pointAnchor2.getX(), pointAnchor2.getY());
        this.pointStart = new Point(color, pointStart.getX(), pointStart.getY());
        this.pointEnd = new Point(color, pointEnd.getX(), pointEnd.getY());
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

    public void setPointStart(Point pointStart) {
        this.pointStart = new Point(pointStart.getColor(), pointStart.getX(), pointStart.getY());
    }

    public void setPointEnd(Point pointEnd) {
        this.pointEnd = new Point(pointEnd.getColor(), pointEnd.getX(), pointEnd.getY());
    }

    public void setPointAnchor1(Point pointAnchor1) {
        this.pointAnchor1 = pointAnchor1;
    }

    public void setPointAnchor2(Point pointAnchor2) {
        this.pointAnchor2 = pointAnchor2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointStart, pointEnd, pointAnchor1, pointAnchor2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            Curve anObj = (Curve)obj;
            return (anObj.pointStart.equals(pointStart)
                    && anObj.pointEnd.equals(pointEnd)
                    && anObj.pointAnchor1.equals(pointAnchor1)
                    && anObj.pointAnchor2.equals(pointAnchor2));
        }
        return false;
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "pointStart=" + pointStart +
                ", pointEnd=" + pointEnd +
                ", pointAnchor1=" + pointAnchor1 +
                ", pointAnchor2=" + pointAnchor2 +
                ", color='" + color + '\'' +
                '}';
    }
}
