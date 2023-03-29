package point_MoveablePoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Point point = new Point();
        point.setXY(1, 2);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint.setXY(1,1);
        moveablePoint.setSpeed(3, 4);
        System.out.println(moveablePoint.move());
    }
}
