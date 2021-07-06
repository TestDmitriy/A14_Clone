package OOP;

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.2);
        Shape s1 = new Circle(5.4);
        Rectangle r1 = new Rectangle(5,9);
        Shape s2 = new Rectangle(7,4);
        Square sq1 = new Square(4);
        Rectangle r2 = new Square(6);
        Shape s3 = new Square(8);

        Shape[] shapes = {c1,s1,r1,s2,sq1,r2,s3};

        for (Shape shape:shapes){
            shape.draw();
            printInfo(shape);
        }
    }
    public static void printInfo(Shape xx){
        System.out.println("Perimeter = "+xx.getPerimeter()+ " Area = "+xx.getArea());

    }
}
