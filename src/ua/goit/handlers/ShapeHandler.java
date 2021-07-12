package ua.goit.handlers;

import ua.goit.graphic.*;
import java.lang.Object.*;

public class ShapeHandler {

    public Shape copy(Shape aShape) throws CloneNotSupportedException {
        return aShape.clone();
    }

    public void move(Shape aShape, int shiftX, int shiftY)  {

    }
}
