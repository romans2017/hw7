package ua.goit.graphic;

import java.util.Objects;

public class Straight extends Line{

    private Point pointStart;
    private Point pointEnd;

    public Straight(Colors color, Point pointStart, Point pointEnd) {
        super(color);
        this.type += "-straight";
        this.pointStart = new Point(color, pointStart.getX(), pointStart.getY());
        this.pointEnd = new Point(color, pointEnd.getX(), pointEnd.getY());
    }

    public Straight(Point pointStart, Point pointEnd) {
        super();
        this.type += "-straight";
        this.pointStart = new Point(pointStart.getX(), pointStart.getY());
        this.pointEnd = new Point(pointEnd.getX(), pointEnd.getY());
    }

    public Point getPointStart() {
        return pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public void setPointStart(Point pointStart) {
        this.pointStart = new Point(pointStart);
    }

    public void setPointEnd(Point pointEnd) {
        this.pointEnd = new Point(pointEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointStart, pointEnd);
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
            Straight anObj = (Straight)obj;
            return (anObj.pointStart.equals(pointStart)
                    && anObj.pointEnd.equals(pointEnd));
        }
        return false;
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "color='" + color + '\'' +
                ", pointStart=" + pointStart +
                ", pointEnd=" + pointEnd +
                '}';
    }
}
