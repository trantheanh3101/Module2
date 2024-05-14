package Lesson6_Inheritance.Point;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
//        return new float[]{x,y};
        float[] getXY = new float[2];
        getXY[0] = x;
        getXY[1] = y;
        return getXY;
    }

    @Override
    public String toString() {
        return "Point2D { " + " (x,y) = (" + x + " , " + y + ") }";
    }
}
