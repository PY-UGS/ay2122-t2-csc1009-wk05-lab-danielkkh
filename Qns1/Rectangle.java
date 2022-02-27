public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public Rectangle(){}

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(double width,double height,String color, Boolean filled){
        this.width=width;
        this.height=height;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getArea(){
        area=height*width;
        return area;
    }

    public double getPerimeter(){
        perimeter=(height*2)+(width*2);
        return perimeter;
    }
}
