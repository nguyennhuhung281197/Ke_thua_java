package triangle;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {

        Shape shape =new Shape();
        System.out.println("Area Shape = " + shape.getArea());
        System.out.println("Perimeter Shape = " + shape.getPerimeter());


        Triangle triangle = new Triangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size 1");
        triangle.setSize1(sc.nextDouble());

        System.out.println("enter size 2");
        triangle.setSize2(sc.nextDouble());

        System.out.println("Enter size 3 ");
//        triangle.setSize3(Double.parseDouble(sc.nextLine()));
        triangle.setSize3(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter color");
        triangle.setColor(sc.nextLine());
        System.out.println(triangle);

        System.out.println("Area Triangle = " + triangle.getAreaTriangle());
        System.out.println("Perimeter Triangle = " + triangle.getPerimeterTriangle());


    }
}
