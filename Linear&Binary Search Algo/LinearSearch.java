import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
      //Linear Search
      Scanner in = new Scanner(System.in);

      //declaring the array , want to make the array of Integers
      int[] arr = new int[5];

      //take the input of the array

      for(int i=0; i<4; i++){
         arr[i] = in.nextInt();
      }

      //function for the linear Search
      // int ans =  LinearSearch(arr,3);
      int ans = LinearSearch2(arr, 5);
      System.out.println(ans);
      in.close();
    }

    static int LinearSearch(int[] arr, int target){
      if(arr.length == 0){
        return -1;
      }
     // traversal array:
     for(int i=0; i<arr.length; i++){
        int element = arr[i];
         if(element == target){
           // System.out.println("The target element found at the index of " + arr[i]);
           return i;
         }
       }
         // if the element is not found in the array then:
         System.out.println("Target element not found :(");
         return -1;
    }

    static boolean LinearSearch2(int[] arr, int target){
      if(arr.length == 0){
        return false;
      }

      for (int element : arr) {
        if(element == target){
          return true;
        }
      }
      return false;
    }
}
