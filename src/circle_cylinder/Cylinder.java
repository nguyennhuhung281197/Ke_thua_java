package circle_cylinder ;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height , double radius , String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAreaCylinder(){
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    @Override
    public String toString() {
        return "Cylinder {" +
                "height = " + height +
                '}'  + super.toString() ;
    }
}
