package exercise;

public class Circle extends Point {
    private int radius;
    private final double PI = Math.PI;

    Circle(Point point, int radius) {
        super(point.getX(), point.getY());
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        return PI * radius * radius;
    }
}
