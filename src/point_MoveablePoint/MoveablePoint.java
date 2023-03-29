package point_MoveablePoint;

public class MoveablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }
    public void setSpeed (float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint move() {
        super.x += xSpeed;
        super.y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + super.toString() +
                " Speed = " + xSpeed + " , " + ySpeed + '}';
    }


}
