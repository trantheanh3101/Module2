package Lesson6_Inheritance.Point;

public class MovablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new  float[]{xSpeed,ySpeed};
    }

    public MovablePoint move(){
        float newX = getX() + xSpeed;
        setX(newX);
        float newY = getY() + ySpeed;
        setY(newY);
        return this; // return this:  đơn giản là một câu lệnh trả về đối tượng hiện tại
    }

    @Override
    public String toString() {
        return "MovablePoint { " + " (x,y),speed=(xs,ys) = (" + getX() + " , " + getY() + ")" + "(" + xSpeed + " , " + ySpeed + ") }";
    }
}
