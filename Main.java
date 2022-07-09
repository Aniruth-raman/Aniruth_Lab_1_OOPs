public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("Blue");
        System.out.println("Area - " + shape.calculateArea());
        System.out.println("Perimeter - " + shape.calculatePerimeter());
        shape.display();

        Rectangle rectangle = new Rectangle("Green", 4, 5);
        System.out.println("Area - " + rectangle.calculateArea());
        System.out.println("Perimeter - " + rectangle.calculatePerimeter());
        rectangle.display();

        Square square = new Square("Yellow", 5);
        System.out.println("Area - " + square.calculateArea());
        System.out.println("Perimeter - " + square.calculatePerimeter());
        square.display();

        Circle circle = new Circle("Purple", 7);
        System.out.println("Area - " + circle.calculateArea());
        System.out.println("Perimeter - " + circle.calculatePerimeter());
        circle.display();

        Triangle triangle = new Triangle("Red", 4, 5);
        System.out.println("Area - " + triangle.calculateArea());
        System.out.println("Perimeter - " + triangle.calculatePerimeter());
        triangle.display();
    }
}
