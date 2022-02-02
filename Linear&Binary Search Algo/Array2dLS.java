import java.util.*;
/**
 * 2dArrayLS
 */
public class Array2dLS {

    public static void main(String[] args) {
        int [][] arr = {
            {23,56,7},
            {78,54,23,90},
            {18,12}
        };
        int target = 34;
        int[] ans = Search(arr, target);  //format of returning the value {row, col}
        System.out.println(Arrays.toString(ans));
    }

    //function for the linear search in 2d array:

    static int[] Search(int[][] arr, int target){ 
         for(int row =0; row<arr.length; row++){
             for(int col=0; col<arr[row].length; col++){
                 if(arr[row][col] == target){
                     return new int[]{row, col};
                 }
             }
         }
         return new int[]{-1, -1};
    }
}