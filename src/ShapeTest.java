import ua.goit.graphic.*;
import ua.goit.handlers.*;

public class ShapeTest {
    private final static ShapeHandler handler = new ShapeHandler();

    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            //point
            Point point1 = new Point(1, 2);
            System.out.println(point1);
            Point point2 = new Point(Colors.Red, 1, 5);
            System.out.println(point2);
            Shape point3 = handler.copy(point1);
            System.out.println(point3);
            System.out.println(point3.equals(point1));
            handler.move(point3, -1, 2);
            System.out.println(point3);
            System.out.println(point3.equals(point1));

            //straight
            System.out.println();
            Straight straight1 = new Straight(new Point(1, 2), new Point(2, 3));
            System.out.println(straight1);
            Straight straight2 = new Straight(Colors.Blue, new Point(1, 2), new Point(2, 8));
            System.out.println(straight2);
            Shape straight3 = handler.copy(straight1);
            System.out.println(straight3);
            System.out.println(straight3.equals(straight1));
            handler.move(straight3, -1, 10);
            System.out.println(straight3);
            System.out.println(straight1);
            System.out.println(straight3.equals(straight1));

            //curve
            System.out.println();
            Curve curve1 = new Curve(new Point(1, 2), new Point(2, 3), new Point(3, 4), new Point(4, 5));
            System.out.println(curve1);
            Curve curve2 = new Curve(Colors.Pink, new Point(1, 2), new Point(2, 3), new Point(3, 4), new Point(4, 5));
            System.out.println(curve2);
            Shape curve3 = handler.copy(curve1);
            System.out.println(curve3);
            System.out.println(curve3.equals(curve1));
            handler.move(curve3, 5, 10);
            System.out.println(curve3);
            System.out.println(curve3.equals(curve1));

            //broken line
            System.out.println();
            BrokenLine brokenLine1 = new BrokenLine(new Point[]{new Point(1, 2), new Point(2, 3), new Point(4, 8)});
            System.out.println(brokenLine1);
            BrokenLine brokenLine2 = new BrokenLine(new Point[]{new Point(1, 2), new Point(2, 3), new Point(4, 8), new Point(4, 12)});
            System.out.println(brokenLine2);
            Shape brokenLine3 = handler.copy(brokenLine1);
            System.out.println(brokenLine3);
            System.out.println(brokenLine3.equals(brokenLine1));
            handler.move(brokenLine3, 0, 0);
            System.out.println(brokenLine3);
            System.out.println(brokenLine3.equals(brokenLine1));

            //ellipse
            System.out.println();
            Ellipse ellipse1 = new Ellipse(Colors.Yellow, new Point(1, 2), new Point(2, 3), 4, 5);
            System.out.println(ellipse1);
            Ellipse ellipse2 = new Ellipse(new Point(1, 5), new Point(2, 3), 10, 20);
            System.out.println(ellipse2);
            Shape ellipse3 = handler.copy(ellipse1);
            System.out.println(ellipse3);
            System.out.println(ellipse3.equals(ellipse1));
            handler.move(ellipse3, 1, 10);
            System.out.println(ellipse3);
            System.out.println(ellipse3.equals(ellipse1));

            //circle
            System.out.println();
            Circle circle1 = new Circle(Colors.Yellow, new Point(1, 2), 5);
            System.out.println(circle1);
            Circle circle2 = new Circle(new Point(1, 5), 20);
            System.out.println(circle2);
            Shape circle3 = handler.copy(circle2);
            System.out.println(circle3);
            System.out.println(circle3.equals(circle2));
            handler.move(circle3, -1, 10);
            System.out.println(circle3);
            System.out.println(circle3.equals(circle1));

            //quad
            System.out.println();
            Quad quad1 = new Quad(new Point(1, 2), new Point(2, 3), new Point(3, 4), new Point(4, 5));
            System.out.println(quad1);
            Quad quad2 = new Quad(Colors.Orange, new Point(1, 2), new Point(2, 3), new Point(3, 4), new Point(4, 5));
            System.out.println(quad2);
            Shape quad3 = handler.copy(quad1);
            System.out.println(quad1);
            System.out.println(quad3.equals(quad1));
            handler.move(quad3, 2, 8);
            System.out.println(quad3);
            System.out.println(quad3.equals(quad1));

            //fill
            System.out.println();
            System.out.println(ellipse1.fill(Colors.Green));
            System.out.println(circle2.fill(Colors.Green));
            System.out.println(((Quad) quad3).fill(Colors.Green));

        } catch (IllegalArgumentException | IllegalShapeException e) {
            e.printStackTrace();
        }
    }
}
