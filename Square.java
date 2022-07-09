public class Square extends Rectangle {
    Square(String color, double side) {
        super(color, side, side);
    }

    @Override
    void display() {
        System.out.println("This is a Square with color " + super.color+"\n");
    }
}
