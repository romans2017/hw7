package ua.goit.graphic;

abstract public class Line extends Shape {
    Line(Colors color) {
        super(color);
        this.type = "Line";
    }

    Line() {
        super();
        this.type = "Line";
    }
}
