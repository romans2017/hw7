package ua.goit.graphic;

import ua.goit.handlers.ShapeToDo;

abstract public class Shape implements ShapeToDo {

    protected String type;
    protected Colors color;

    public String getType() {
        return type;
    }

    public Colors getColor() {
        return color;
    }

    Shape(Colors color) {
        this.color = color;
    }

    public String draw() {
        return type + " is drawn";
    }

    @Override
    abstract public Shape clone() throws CloneNotSupportedException;
}
