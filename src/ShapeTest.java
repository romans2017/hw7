import ua.goit.graphic.*;
import ua.goit.handlers.*;

public class ShapeTest {
    private static ShapeHandler handler = new ShapeHandler();

    public static void main(String[] args) throws IllegalShapeException {
        //point
        Point point1 = new Point(1,2);
        System.out.println(point1);
        Point point2 = new Point(Colors.Red,1,5);
        System.out.println(point2);
        Shape point3 = handler.copy(point1);
        System.out.println(point3);
        System.out.println(point3.equals(point1));

        //straight
        Straight straight1 = new Straight(new Point(1,2), new Point(2,3));
        System.out.println(straight1);
        Straight straight2 = new Straight(Colors.Blue, new Point(1,2), new Point(2,8));
        System.out.println(straight2);
        Shape straight3 = handler.copy(straight1);
        System.out.println(straight3);
        System.out.println(straight3.equals(straight1));

        //curve
        Curve curve1 = new Curve(new Point(1,2), new Point(2,3), new Point(3,4), new Point(4,5));
        System.out.println(curve1);
        Curve curve2 = new Curve(Colors.Pink, new Point(1,2), new Point(2,3), new Point(3,4), new Point(4,5));
        System.out.println(curve2);
        Shape curve3 = handler.copy(curve1);
        System.out.println(curve3);
        System.out.println(curve3.equals(curve1));

        //broken line
        BrokenLine brokenLine1 = new BrokenLine(new Point[]{new Point(1,2), new Point(2,3), new Point(4,8)});
        System.out.println(brokenLine1);
        BrokenLine brokenLine2 = new BrokenLine(new Point[]{new Point(1,2), new Point(2,3), new Point(4,8), new Point(4,12)});
        System.out.println(brokenLine2);
        Shape brokenLine3 = handler.copy(brokenLine1);
        System.out.println(brokenLine3);
        System.out.println(brokenLine3.equals(brokenLine1));

        //ellipse
        Ellipse ellipse1 = new Ellipse(Colors.Yellow, new Point(1,2), new Point(2,3), 4,5);
        System.out.println(ellipse1);
        Ellipse ellipse2 = new Ellipse(new Point(1,5), new Point(2,3), 10,20);
        System.out.println(ellipse2);
        Shape ellipse3 = handler.copy(ellipse1);
        System.out.println(ellipse3);
        System.out.println(ellipse3.equals(ellipse1));

        //circle
        Circle circle1 = new Circle(Colors.Yellow, new Point(1,2), 5);
        System.out.println(circle1);
        Circle circle2 = new Circle(new Point(1,5),20);
        System.out.println(circle2);
        Shape circle3 = handler.copy(circle2);
        System.out.println(circle3);
        System.out.println(circle3.equals(circle2));

        //quad
        Quad quad1 = new Quad(new Point(1,2), new Point(2,3), new Point(3,4), new Point(4,5));
        System.out.println(quad1);
        Quad quad2 = new Quad(Colors.Orange, new Point(1,2), new Point(2,3), new Point(3,4), new Point(4,5));
        System.out.println(quad2);
        Shape quad3 = handler.copy(quad1);
        System.out.println(quad1);
        System.out.println(quad3.equals(quad1));

        //fill
        System.out.println();
        System.out.println(ellipse1.fill(Colors.Green));
        System.out.println(circle2.fill(Colors.Green));
        System.out.println(((Quad)quad3).fill(Colors.Green));

        //exceptions
        //System.out.println(handler.copy(new Line())); when Line is non-abstract
        //System.out.println(new Point(-1,1));
        //System.out.println(new Ellipse(new Point(1,5), new Point(2,3), 10,0));
        //System.out.println(new Circle(new Point(1,5),0));
    }
}
