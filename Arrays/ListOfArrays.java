import java.util.*;
// import java.util.Scanner;
// import java.util.ArrayList;

public class ListOfArrays {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       //declaring the Array List
      ArrayList<Integer> list = new ArrayList<Integer>(); //This is the arrayList named as list

      //For multiDimensional Array
      ArrayList<ArrayList<Integer>> train = new ArrayList<ArrayList<Integer>>();  //This is the arrayList named as train

      //list creation , taking the input
      for(int i=0; i<7; i++){
       list.add(in.nextInt());
      }

      //Output:
      for(int i=0; i<7; i++){
       System.out.println(list.get(i));
      }

     in.close();        
    }
}
