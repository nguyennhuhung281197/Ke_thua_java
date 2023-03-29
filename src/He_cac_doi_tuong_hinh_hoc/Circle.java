package He_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAreaCircle() {
        return radius * radius * Math.PI;
    }

    public double getPerimeterCircle() {
        return (radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
