package circle_cylinder;

public class CircleMain {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(3);
        circle.setColor("Black");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(4);
        cylinder.setColor("red");
        cylinder.setHeight(3);

        System.out.println(cylinder);
    }
}
