import  java.util.*;
public class Dog {

    String name;
    int age;
    String breed;
    String color;

    //constructor declaration of the class
    public Dog(String name,String breed, int age, String color){
      this.name = name;
      this.breed = breed;
      this.age = age;
      this.color = color;
    }

    //method1:
    public String getName(){
     return name;
    }

    //method2:
    public String getBreed(){
        return breed;
    }
    
    //method3:
    public int getAge(){
        return age;
    }
    
    //method4:
    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return ("Hi my name is " + this.getName() + " My breed , age and color are "+ this.getBreed() + ", " + this.getAge() + "and" + this.getColor());
    }
    public static void main(String[] args) {
       
        Dog Tuffy = new Dog("tuffy", "pappilion", 5, "white");  //Details provided
        System.out.println(Tuffy.toString());

    }
}
