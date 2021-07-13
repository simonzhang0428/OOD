package Factory;

public class ShapeFactory {
    /**
     * Your object will be instantiated and called as such: ShapeFactory sf = new
     * ShapeFactory(); Shape shape = sf.getShape(shapeType); shape.draw();
     */
    public interface Shape {
        void draw();
    }

    class Rectangle implements Shape {
        // Write your code here
        public void draw() {
            System.out.println(" ----");
            System.out.println("|    |");
            System.out.println(" ----");
        }
    }

    class Square implements Shape {
        // Write your code here
        public void draw() {
            System.out.println(" ----");
            System.out.println("|    |");
            System.out.println("|    |");
            System.out.println(" ----");
        }
    }

    class Triangle implements Shape {
        // Write your code here
        public void draw() {
            System.out.println("  /\\");
            System.out.println(" /  \\");
            System.out.println("/____\\");
        }
    }

    
    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shapeType) {
        // Write your code here
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else {
            return new Rectangle();
        }
    }
    
}

