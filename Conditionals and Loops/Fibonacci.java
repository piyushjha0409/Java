import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //print the fibonacci series
       /*Logic :
       first term;
       second term;
       third term = first + second;
       */
       int n = input.nextInt();
       int first = 1;
       int second = 2;

       System.out.println(first);
       System.out.println(second);

       for(int i=0; i<n; i++){
           int third = first + second;
           System.out.println(third);
           first = second;
           second = third;
       }
       input.close();

    }
}
