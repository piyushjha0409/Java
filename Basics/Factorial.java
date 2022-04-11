import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ans = getFact(num);
        System.out.println(ans);
    }

    //function for the factorial (simple method)

    // static int getFact(int num){
    //   int result = 1;
    //   for(int i=1; i<=num; i++){
    //     result = result * i;
    //   }
    //   return result;
    // }

    //function for the factorial by recursion
    static int getFact(int num){
        if(num == 0){
            return 1;
        }
        return num*getFact(num-1);
    }
}
