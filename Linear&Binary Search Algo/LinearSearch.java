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
      int ans = Linear_Search2(arr, 5);
      System.out.println(ans);
      in.close();
    }

    static int Linear_Search(int[] arr, int target){
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

    static int Linear_Search2(int[] arr, int target){
      if(arr.length == 0){
        return 0;
      }

      for (int element : arr) {
        if(element == target){
          return 1;
        }
      }
      return 0;
    }
}
