package lab.exercise2;

/**
 *
 * @author Tatum Thomas
 */
public class RedShapeDecorator extends ShapeDecorator{
    
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Border Color: Red");
    }
    
    
    
}
