package ua.goit.graphic;

import ua.goit.handlers.CanFill;

import java.util.Objects;

public class Ellipse extends Shape implements CanFill {

    protected final Point focus1;
    protected final Point focus2;
    protected final int semiMajorAxis;
    protected final int semiMinorAxis;

    public Ellipse(Point focus1, Point focus2, int semiMajorAxis, int semiMinorAxis) {
        this(Colors.Black, focus1, focus2, semiMajorAxis, semiMinorAxis);
    }

    public Ellipse(Colors color, Point focus1, Point focus2, int semiMajorAxis, int semiMinorAxis) {
        super(color);
        if (semiMajorAxis<=0 || semiMinorAxis<=0) {
            throw new IllegalArgumentException("semiMajorAxis and semiMinorAxis must be positive");
        }
        this.type = "Ellipse";
        this.focus1 = new Point(focus1);
        this.focus2 = new Point(focus2);
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public Point getFocus1() {
        return focus1;
    }

    public Point getFocus2() {
        return focus2;
    }

    public int getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public int getSemiMinorAxis() {
        return semiMinorAxis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return focus1.equals(ellipse.focus1)
                && focus2.equals(ellipse.focus2)
                && Objects.equals(semiMajorAxis, ellipse.semiMajorAxis)
                && Objects.equals(semiMinorAxis, ellipse.semiMinorAxis)
                && color.equals(ellipse.color)
                && type.equals(ellipse.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(focus1, focus2, semiMajorAxis, semiMinorAxis, color, type);
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "focus1=" + focus1 +
                ", focus2=" + focus2 +
                ", semiMajorAxis=" + semiMajorAxis +
                ", semiMinorAxis=" + semiMinorAxis +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String fill(Colors fillColor) {
        return "Ellipse " + toString() + " is colored " + fillColor;
    }
}
