package triangle;

public class Triangle extends Shape{

    private String color;

    public Triangle() {
    }

    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(double size1, double size2, double size3, String color) {
        super(size1, size2, size3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAreaTriangle(){
        return (size1 * size2) / 2;
    }
    public double getPerimeterTriangle(){
        return size1 + size2 + size3;
    }
    public void setTriangle(float size1 , float size2 , short size3, String color){
        super.size1 = size1;
        super.size2 = size2;
        super.size3 = size3;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                ", size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                '}';
    }
}
