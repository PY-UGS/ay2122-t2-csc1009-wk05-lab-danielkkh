public class Circle extends GeometricObject {
    private static final double pi = Math.PI;
    private double radius;
    private double diameter;
    private double perimeter;
    
    public Circle(){}

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius,String color,Boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return radius*radius*pi;
    }

    public double getPerimeter(){
        perimeter = pi*diameter;
        return perimeter;
    }

    public double getDiameter(){
        diameter = radius + radius;
        return diameter;
    }

    public void printCircle(){
    }
}
