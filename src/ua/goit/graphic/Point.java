package ua.goit.graphic;

import java.util.Objects;

public class Point extends Shape {
    private int x;
    private int y;

    public Point(Colors color, int x, int y) throws IllegalArgumentException {
        super(color);
        if (x<0 || y<0) {
            throw new IllegalArgumentException("x and y must be non-negative");
        }
        this.type = "Point";
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) throws IllegalArgumentException {
        super();
        if (x<0 || y<0) {
            throw new IllegalArgumentException("x and y must be non-negative");
        }
        this.type = "Point";
        this.x = x;
        this.y = y;
    }

    public Point(Point aPoint) {
        super();
        this.type = "Point";
        this.x = aPoint.x;
        this.y = aPoint.y;
        this.color = aPoint.color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            Point anObj = (Point)obj;
            return (Objects.equals(anObj.x, x)
                    && Objects.equals(anObj.y, y));
        }
        return false;
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color.toString() + '\'' +
                '}';
    }

}
