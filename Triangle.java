class Triangle extends Shape {
    double base;
    double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    double calculatePerimeter() {
        double hyp = Math.sqrt(Math.pow(this.base, 2)
                + Math.pow(this.height, 2));
        return this.base + this.height + hyp;
    }

    @Override
    void display() {
        System.out.println("This is a Triangle with color " + super.color+"\n");
    }
}