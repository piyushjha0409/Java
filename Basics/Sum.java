import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Float num1 = input.nextFloat();
        Float num2 = input.nextFloat();

        Float sum = num1 + num2;

        System.out.println("The Sum is = "+ sum);
        input.close();
    }
}
