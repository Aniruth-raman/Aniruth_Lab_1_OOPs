public class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    void display() {
        System.out.println("This is a Circle with color " + super.color+"\n");
    }
}
