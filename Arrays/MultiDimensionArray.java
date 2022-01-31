import java.util.Scanner;
public class MultiDimensionArray {
  public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
    //MultiDimesion array
        int[][] arr = new int[3][3]; //The no of the rows are mandatory to be declared not columns

        // int[][] arr2D = {
        //    {1,2,3,4},
        //    {1,3,5,6},
        //    {3,4,5,6}
        // };

      //taking the  user input
      for(int row=0; row<arr.length; row++){
      //for each column in every row we want to take the input
      for(int col=0; col<arr[row].length; col++){

        arr[row][col] = scn.nextInt();
      }
      }

      //Output
      for(int row=0; row<arr.length; row++){
      //for each column in every row we want to take the input
      for(int col=0; col<arr[row].length; col++){

        System.out.println(arr[row][col] + " ");
      }
      System.out.println();
    }
  }

}
