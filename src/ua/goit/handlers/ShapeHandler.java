package ua.goit.handlers;

import ua.goit.graphic.*;

public class ShapeHandler {

    public Shape copy(Shape aShape) throws IllegalShapeException {
        Shape copyShape;
        if (aShape.getClass() == Point.class) {
            copyShape = new Point((Point)aShape);
        } else if (aShape.getClass() == Straight.class) {
            copyShape = new Straight(
                    aShape.getColor(),
                    new Point(((Straight) aShape).getPointStart()),
                    new Point(((Straight) aShape).getPointEnd()));
        } else if (aShape.getClass() == Curve.class) {
            copyShape = new Curve(
                    aShape.getColor(),
                    new Point(((Curve) aShape).getPointStart()),
                    new Point(((Curve) aShape).getPointEnd()),
                    new Point(((Curve) aShape).getPointAnchor1()),
                    new Point(((Curve) aShape).getPointAnchor2()));
        } else if (aShape.getClass() == BrokenLine.class) {
            copyShape = new BrokenLine(((BrokenLine)aShape).getPoints());
        } else if (aShape.getClass() == Ellipse.class) {
            copyShape = new Ellipse(
                    aShape.getColor(),
                    new Point(((Ellipse) aShape).getFocus1()),
                    new Point(((Ellipse) aShape).getFocus2()),
                    ((Ellipse) aShape).getSemiMajorAxis(),
                    ((Ellipse) aShape).getSemiMinorAxis());
        } else if (aShape.getClass() == Circle.class) {
            copyShape = new Circle(
                    aShape.getColor(),
                    new Point(((Circle) aShape).getFocus1()),
                    ((Circle) aShape).getSemiMajorAxis());
        } else if (aShape.getClass() == Quad.class) {
            copyShape = new Quad(
                    aShape.getColor(),
                    new Point(((Quad) aShape).getPointA()),
                    new Point(((Quad) aShape).getPointB()),
                    new Point(((Quad) aShape).getPointC()),
                    new Point(((Quad) aShape).getPointD()));
        } else {
            throw new IllegalShapeException();
        }
        return copyShape;
    }
}
