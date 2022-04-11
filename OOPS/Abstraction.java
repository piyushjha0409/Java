abstract class Shape{
    String color;

    //these are the abstract methods
    abstract double area();
    public abstract String toString();

    //abstract class can have the public constructor
    public Shape(String color){
        System.out.println("Shape constructor called!");
         this.color = color;
    }

    //this is concrete method
    public String getColor(){
         return color;
    }
}
//Inherited from the Shape class
class Circle extends Shape{
 double radius;
 
//constructor of circle class
 public Circle(String color, double radius){
     //calling the shape constructor
    super(color);
    System.out.println("Circle constructor called!");
    this.radius = radius;
 }

 @Override double area(){
     return Math.PI * Math.pow(radius, 2);
 }
 @Override public String toString(){
     return "Circle color is "+ super.getColor() + "and area is : " + area();
 }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        System.out.println(s1.toString());
    }
}
