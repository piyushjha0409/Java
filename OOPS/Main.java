/**
 * Parent
 */
//base class
class Parent{
 void show(){
     System.out.println("Parent's Show");
 }
}

//child class
class child extends Parent {
//This method overrides the show of parent 
@Override
void show(){
    System.out.println("Child's Show");
}
}

//Driver class
class Main {
    public static void main(String[] args) {
        //Parents class call
        Parent Obj1 = new Parent();
        Obj1.show();

        //Child class call by runtime polymorphism 
        Parent Obj2 = new child();
        Obj2.show();
    }
}