import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // taking the input of the three numbers
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();
        int max = n;
        // Driver code
        if (p > max) {
            max = p;
        }
        if (q > max) {
            max = q;
        }
        System.out.println("The largest number among these 3 is = "+ max);
        in.close();

    }
}
