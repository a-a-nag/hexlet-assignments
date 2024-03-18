package exercise;

public class Cottage implements Home{
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + this.getArea() + " метров";
    }

    @Override
    public int compareTo(Home another) {
        return this.getArea() == another.getArea() ? 0 : this.getArea() > another.getArea() ? 1 : -1;
    }
}
