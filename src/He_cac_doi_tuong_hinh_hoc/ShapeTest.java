package He_cac_doi_tuong_hinh_hoc;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);


        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        circle = new Circle(3, "indigo", false);
        System.out.println(circle);


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3,4);
        System.out.println(rectangle);

        rectangle = new Rectangle(3,4,"black",true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.5);
        System.out.println(square);

        square = new Square(3.5,"yellow",true);
        System.out.println(square);


    }
}




