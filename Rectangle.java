class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return this.length * this.breadth;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (this.length + this.breadth);
    }

    @Override
    void display() {
        System.out.println("This is a Rectangle with color " + super.color+"\n");
    }
}