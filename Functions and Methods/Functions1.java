import java.util.Scanner;

public class Functions1 {
    public static void main(String[] args) {
       
        sum();
    }

    static void sum(){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = scn.nextInt();
        System.out.println("Enter the number 2");
        int num2 = scn.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
        scn.close();

    }
}
