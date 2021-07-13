package ua.goit.handlers;

import ua.goit.graphic.*;

public class ShapeHandler {

    public Shape copy(Shape shape) {
        return shape.copy();
    }

    public void move(Shape shape, int shiftX, int shiftY) throws IllegalArgumentException {
        shape.move(shiftX, shiftY);
    }

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public void getType(Shape shape) {
        System.out.println(shape.getType());
    }

    public void fill(Shape shape, Colors color) throws IllegalShapeException {
        if (shape instanceof Fillable) {
            ((Fillable) shape).fill(color);
        } else {
            throw new IllegalShapeException();
        }
    }
}
