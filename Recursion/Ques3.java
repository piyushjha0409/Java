import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(recur_power(n, m));
    }
    static int recur_power(int n, int m){
         if(m == 0){   //base cases
             return 1;
         }
         else{
             return n*recur_power(n, m-1);
         }
    }
}