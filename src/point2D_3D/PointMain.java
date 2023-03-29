package point2D_3D;

import java.util.Arrays;

public class PointMain {
    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        point2D.setXY(2,3);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D();
        point3D.setXYZ(1,2,3);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
