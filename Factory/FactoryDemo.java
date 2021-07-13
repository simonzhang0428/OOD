package Factory;

import Factory.ShapeFactory.Shape;

public class FactoryDemo {
    private static final ShapeFactory sf = new ShapeFactory();
    public static void main(String[] args) {
        Shape square = new ShapeFactory().getShape("squre");
        square.draw();
    }
}
