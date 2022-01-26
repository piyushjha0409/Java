import java.util.Scanner;

/**
 * Inputs
 */
public class Inputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int rollNo = input.nextInt();
        // System.out.println("Your Roll no is " + rollNo);
        //  int a = 45_000_000;
        //  System.out.println(a);
        String name = input.nextLine();
        System.out.println(name);
        input.close();
    }
}