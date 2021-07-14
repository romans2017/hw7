package ua.goit.graphic;

abstract public class Shape {

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

    abstract public void move(int shiftX, int shiftY);

    @Override
    abstract public Shape clone() throws CloneNotSupportedException;
}
