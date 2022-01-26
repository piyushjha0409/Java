import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* 
        Logic:
        num 1232;
        while(num != 0){
        int rem = num % 10;
        int count = 0;
        if(rem = n) "where n is the desired number for occurence"
        {
         count++;   
        }
        num = num / 10;
        }
        */
        int num = input.nextInt();
        int n = input.nextInt();
        input.close();
        int count = 0;
        
        while(num > 0){
            int rem = num % 10;

            if(rem == n){
              count++;
            }
           num /= 10;
        }
        System.out.println(count);
    }
}
