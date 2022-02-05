import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
    int[] arr = {98,56,34,17,11,5,2,1};
    int target = 2;
    int ans = binarySearch(arr, target);
    System.out.println(ans);
    }

//function for the binary search
    static int binarySearch(int[] arr, int target){
     int start = 0;
     int last = arr.length -1;

     while(start <= last){
       // int mid = (start+last)/2 ; This may exceed the range
       int mid = start + (last-start) / 2; //this is the mid position of the array

       //wether the sorted array is ascending or the descending:
       if(arr[start]<arr[last]){ //Sorted array is ascending
             if(target<arr[mid]){  //lhs
               last = mid -1;
             }else if(target>arr[mid]){ //rhs
               start = mid +1;
             }else{
               //answer found
               return mid;
             }
         }else{                       //Sorted array is descending
             if(target<arr[mid]){  //rhs
               start = mid+1;
             }else if(target>arr[mid]){ //lhs
               last = mid-1;
             }else{
               //answer found
               return mid;
             }
       }
     }
     return -1; //we didnt found the target element
    }
}
