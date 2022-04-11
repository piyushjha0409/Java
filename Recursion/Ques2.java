import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
         int[] arr = {1,4,8,-3,22,6};
         int n = arr.length;

         //printing the minimum number 
         System.out.println(miniNo(arr, n));
         //printing the maximum number 
         System.out.println(maxNo(arr, n));
    }
    static int miniNo(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }
        return Math.min(arr[n-1], miniNo(arr, n-1));

   }
   //function for finding the max number
   static int maxNo(int[] arr, int n){
       if(n == 1){
           //if in case there is only one element in the array then it will max and min 
           return arr[0];
       }
       return Math.max(arr[n-1], maxNo(arr, n-1));
   }
}
