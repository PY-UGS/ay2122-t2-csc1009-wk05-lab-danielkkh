public class Rectangle extends Shape {

    public Rectangle(double dim1,double dim2){
        super(dim1,dim2);
    }

    public double area(){
        return super.dim1*super.dim2;
    }
    
}
