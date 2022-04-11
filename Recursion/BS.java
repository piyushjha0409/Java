//This is the binary search with recurssion 
public class BS {
    public static void main(String[] args) {
       
        int[] arr = {1,22,33,42,90};
        int target = 90;
        int start = 0;
        int end = arr.length-1;
        System.out.println(Search(arr, target, start, end));

    }

    static int Search(int[] arr, int target, int start , int end){
        if(start>end){
          return -1; //we have not found the answer
        }
        int m = start + (end - start)/2;
        if(arr[m] == target){
           return m;
        }

        if(target < arr[m]){
           return Search(arr, target, start, m-1);
        }

        return Search(arr, target, m+1, end);
    }
}
