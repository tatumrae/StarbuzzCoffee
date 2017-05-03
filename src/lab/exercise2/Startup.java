package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        circle = new RedShapeDecorator(circle);
        System.out.println("\nCircle with red border");
        circle.draw();
        
        rectangle = new RedShapeDecorator(rectangle);
        System.out.println("\nRectangle with red border");
        rectangle.draw();
        
    }
}
