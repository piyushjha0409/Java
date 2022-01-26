import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        //take the user input 
        // Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);
        // input.close();
    
    Scanner input = new Scanner(System.in);
    //typecasting from float to integer
    int num = (int)(451.4654f);
    System.out.println(num);

    //automatic type promotion in expressions
    // int a = 464;
    // byte b = (byte)(a); //464 % 464 = 1
    byte a = 100;
    byte b = 100;
    short s = 1024;
    float f = 54.65f;
    char c = 'p';
    double d = 0.5654;
    double result = (f * b)/(a / b) - (d / s);
    // int d  = (a + b)/c;
    System.out.println(result);
    // System.out.println(b);

    input.close();
    }
}
