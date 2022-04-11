import java.util.*;
import java.lang.*;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        solve(arr);
    } 

    static void solve(int[] arr){

        //Base case
        if(arr.length < 1){
            return;
        }
         
         int[] temp  = new int[arr.length-1];
         for(int i=0; i<arr.length-1; i++){
             int x = arr[i] + arr[i+1];
             temp[i] = x;
         }
        
        //making a  recurssive call to create a new array 
        solve(temp);

        System.out.println(Arrays.toString(arr));
     }
     
    }
