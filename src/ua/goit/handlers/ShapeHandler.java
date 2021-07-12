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

    public void move(Shape aShape, int shiftX, int shiftY) throws IllegalArgumentException, IllegalShapeException {
        if (aShape.getClass() == Point.class) {
            Point tempObj = (Point) aShape;
            tempObj.shift(shiftX, shiftY);

        } else if (aShape.getClass() == Straight.class) {
            Straight tempObj = (Straight) aShape;
            tempObj.getPointStart().shift(shiftX, shiftY);
            tempObj.getPointEnd().shift(shiftX, shiftY);

        } else if (aShape.getClass() == Curve.class) {
            Curve tempObj = (Curve) aShape;
            tempObj.getPointStart().shift(shiftX, shiftY);
            tempObj.getPointEnd().shift(shiftX, shiftY);
            tempObj.getPointAnchor1().shift(shiftX, shiftY);
            tempObj.getPointAnchor2().shift(shiftX, shiftY);

        } else if (aShape.getClass() == BrokenLine.class) {
            BrokenLine tempObj = (BrokenLine) aShape;
            Point[] points = tempObj.getPoints();
            for (Point point : points) {
                point.shift(shiftX, shiftY);
            }

        } else if (aShape.getClass() == Ellipse.class) {
            Ellipse tempObj = (Ellipse) aShape;
            tempObj.getFocus1().shift(shiftX, shiftY);
            tempObj.getFocus2().shift(shiftX, shiftY);

        } else if (aShape.getClass() == Circle.class) {
            Circle tempObj = (Circle) aShape;
            tempObj.getFocus1().shift(shiftX, shiftY);

        } else if (aShape.getClass() == Quad.class) {
            Quad tempObj = (Quad) aShape;
            tempObj.getPointA().shift(shiftX, shiftY);
            tempObj.getPointB().shift(shiftX, shiftY);
            tempObj.getPointC().shift(shiftX, shiftY);
            tempObj.getPointD().shift(shiftX, shiftY);

        } else {
            throw new IllegalShapeException();
        }
    }
}
