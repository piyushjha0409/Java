import java.util.Scanner;

public class Functions2 {
    public static void main(String[] args) {
        Check();
    }

    //function for checking the prime or not
    static void Check(){
      
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scn.nextInt();
        boolean flag = true;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
        scn.close();

    }
}
