public class Ellipse extends Shape {

    public Ellipse(double dim1,double dim2){
        super(dim1,dim2);
    }
    
    public double area(){
        return super.PI*super.dim1*super.dim2;
    }
}