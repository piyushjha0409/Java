import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // taking the input of the three numbers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // int max = 0;
        // Driver code
        // if (p > max) {
        //     max = p;
        // }
        // if (q > max) {
        //     max = q;
        // }
        // if(a>b){
        //     max = a;
        // }else{
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }
        int max = Math.max(c, Math.max(a, b));
        System.out.println("The largest number among these 3 is = "+ max);
        in.close();

    }
}
