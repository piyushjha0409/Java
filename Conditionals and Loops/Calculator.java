import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take the user input until unless user press 'x' or 'X'
         int ans = 0;

         while(true){
        //We have to take the input operator
        System.out.println("Enter the operator:");
        int op = input.next().trim().charAt(0);

        input.close();

        //Driver Code:
        while (true) {
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
        //We have to take the input of the numbers
        System.out.println("Enter the numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(op == '+'){
            ans = num1 + num2;
        }
        if(op == '-'){
            ans = num1 + num2;
        }
        if(op == '*'){
            if(num2 != 0){
                ans = num1 * num2;
            }
        }
        if(op == '/'){
            ans = num1 / num2;
        }
        if(op == '%'){
          ans = num1 % num2; 
        }
    }else if(op == 'X' || op == 'x'){

    }else{

    } 
   
      }
     }
    }
}