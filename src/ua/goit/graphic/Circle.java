package ua.goit.graphic;

import ua.goit.handlers.Fillable;

public class Circle extends Ellipse implements Fillable {

    public Circle(Point focus1, int semiMajorAxis) {
        this(Colors.Black, focus1, semiMajorAxis);
    }

    public Circle(Colors color, Point focus1, int semiMajorAxis) {
        super(color, focus1, focus1, semiMajorAxis, semiMajorAxis);
        this.type = "Circle";
    }

    @Override
    public String toString() {
        return type + "{" +
                "center=" + focus1 +
                ", radius=" + semiMajorAxis +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String fill(Colors fillColor) {
        return "Now circle's color is " + fillColor;
    }

    @Override
    public Shape copy() {
        return new Circle(
                color,
                new Point(focus1),
                semiMajorAxis);
    }

    @Override
    public void move(int shiftX, int shiftY) {
        focus1.shift(shiftX, shiftY);
    }
}
