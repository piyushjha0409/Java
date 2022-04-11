import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        checkPrime(num);
    }

    //function for checking the prime number
     static void checkPrime(int num){

        boolean flag = true;
        for(int i=2; i<num; i++){
            if(num%i == 0){
               flag = false;
               break;
            }
        }
        if(flag){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}
