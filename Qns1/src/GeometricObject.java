import java.util.Date;

public class GeometricObject {
    public String color;
    public Boolean filled;
    public Date dateCreated;

    public GeometricObject(){
    this.color="white";
    this.filled=false;
    this.dateCreated= new Date();
    }

    public GeometricObject(String color, Boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public Boolean isFilled(){
        return filled;
    }

    public void setFilled(Boolean filled){
        this.filled=filled;
    }

    public Date getDateCreateD(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\n" + "color: " + color + " and filled: " + filled;
    }
}