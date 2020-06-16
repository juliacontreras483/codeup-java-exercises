package shapes;


public class Square extends Rectangle {
    public double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return 4 * side;
    }

    @Override
    public double getPerimeter() {
        return side * side;
    }
}
