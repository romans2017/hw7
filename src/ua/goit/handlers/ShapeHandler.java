package ua.goit.handlers;

import ua.goit.graphic.*;


public class ShapeHandler {

    public Shape copy(Shape aShape) throws CloneNotSupportedException {
        return aShape.clone();
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
            for (int i = 0; i < points.length; i++) {
                points[i].shift(shiftX, shiftY);
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
