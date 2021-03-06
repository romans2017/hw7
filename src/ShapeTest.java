import ua.goit.graphic.*;
import ua.goit.handlers.*;

public class ShapeTest {
    private final static ShapeHandler handler = new ShapeHandler();

    public static void main(String[] args) {
        try {
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
            System.out.println(straight3.equals(straight1));
            handler.draw(straight3);
            handler.getType(straight3);

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
            handler.draw(curve3);
            handler.getType(curve3);

            //broken line
            System.out.println();
            BrokenLine brokenLine1 = new BrokenLine(new Point[]{new Point(1, 2), new Point(2, 3), new Point(4, 8)});
            System.out.println(brokenLine1);
            BrokenLine brokenLine2 = new BrokenLine(new Point[]{new Point(1, 2), new Point(2, 3), new Point(4, 8), new Point(4, 12)});
            System.out.println(brokenLine2);
            Shape brokenLine3 = handler.copy(brokenLine1);
            System.out.println(brokenLine3);
            System.out.println(brokenLine3.equals(brokenLine1));
            handler.move(brokenLine3, 1, 0);
            System.out.println(brokenLine3);
            System.out.println(brokenLine3.equals(brokenLine1));
            handler.draw(brokenLine3);
            handler.getType(brokenLine3);

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
            handler.draw(ellipse3);
            handler.getType(ellipse3);

            //circle
            System.out.println();
            Circle circle1 = new Circle(Colors.Yellow, new Point(1, 2), 5);
            System.out.println(circle1);
            Circle circle2 = new Circle(new Point(1, 5), 20);
            System.out.println(circle2);
            Shape circle3 = handler.copy(circle2);
            System.out.println(circle3);
            System.out.println(circle3.equals(circle2));
            handler.move(circle3, 0, 0);
            System.out.println(circle3);
            System.out.println(circle3.equals(circle2));
            handler.draw(circle3);
            handler.getType(circle3);

            //quad
            System.out.println();
            Quad quad1 = new Quad(new Point(1, 2), new Point(2, 3), new Point(3, 4), new Point(4, 5));
            System.out.println(quad1);
            Quad quad2 = new Quad(Colors.Orange, new Point(1, 2), new Point(2, 3), new Point(3, 4), new Point(4, 5));
            System.out.println(quad2);
            Shape quad3 = handler.copy(quad1);
            System.out.println(quad1);
            System.out.println(quad3.equals(quad1));
            handler.move(quad3, 5, 0);
            System.out.println(quad3);
            System.out.println(quad3.equals(quad1));
            handler.draw(quad3);
            handler.getType(quad3);

            //fill
            System.out.println();
            handler.fill(circle2, Colors.Blue);
            handler.fill(ellipse2, Colors.Orange);

            //exception
            handler.fill(brokenLine2, Colors.Green);

        } catch (IllegalArgumentException | IllegalShapeException | CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
