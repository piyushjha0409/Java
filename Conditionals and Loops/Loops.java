import java.util.Scanner;
/**
 * Loops
 * 
 */
public class Loops {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        //printing the hello world 10 times 
        // for(int num = 1; num<n; num++){
        //     System.out.println(num);
        // }

        //doing the while loop
        // while(n<100){  
        //   System.out.println(n);
        //   n += 1;
        // }

        //do while loop
        do{
           System.out.println(n);
           n += 1;
        }while(n <= 10);

        input.close();
    }
}
