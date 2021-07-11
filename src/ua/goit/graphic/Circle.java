package ua.goit.graphic;

import ua.goit.handlers.CanFill;

public class Circle extends Ellipse implements CanFill {

    public Circle(Point focus1, int semiMajorAxis) {
        super(focus1, focus1, semiMajorAxis, semiMajorAxis);
        this.type = "Circle";
    }

    public Circle(Colors color, Point focus1, int semiMajorAxis) {
        super(color, focus1, focus1, semiMajorAxis, semiMajorAxis);
        this.type = "Circle";
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "center=" + focus1 +
                ", radius=" + semiMajorAxis +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String fill(Colors fillColor) {
        return "Now circle's color is " + fillColor;
    }
}
