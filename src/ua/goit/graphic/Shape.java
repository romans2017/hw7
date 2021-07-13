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

    Shape() {
        this.color = Colors.Black;
        this.type = "";
    }

    Shape(Colors color) {
        this.color = color;
        this.type = "";
    }

    public String draw() {
        return type + " is drawn";
    }
}
