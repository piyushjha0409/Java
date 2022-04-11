public class Main {
    //Recursion means a function that calls itself
    public static void main(String[] args) {
      print(1);
    }
    static void print(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
