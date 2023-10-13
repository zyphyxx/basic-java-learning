package exercicios.introducaoPOO.rectangle;

public class Rectangle {

    // define fields

    private double width;
    private double height;

    // define getters and setterss

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // define constructors

    public Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // define toString()

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }


    // define methods


    public double area(){
        return getHeight() * getWidth();
    }

    public  double perimeter() {
        return (getWidth() * 2) + (getHeight() * 2);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(getHeight(),2) + Math.pow(getWidth(),2));
    }
}
