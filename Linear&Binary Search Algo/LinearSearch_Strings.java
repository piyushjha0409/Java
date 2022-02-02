import java.util.*;

public class LinearSearch_Strings {
    public static void main(String[] args) {
      //Linear Search
      Scanner in = new Scanner(System.in);
      //taking the user input of the name
      System.out.println("Enter the name: ");
      String name = in.next();

      //taking the input of the
      System.out.println("Enter the target letter: ");
      char Key = in.next().charAt(0);
      
      System.out.println(Arrays.toString(name.toCharArray()));
    }

    //function for the Linear Search
    static boolean Search(String name, char Key){

      if(name.length() == 0){
         return false;
        }
    //for each loop:
    for (char ch: name.toCharArray()) {
      if(ch == Key){
        return true;
      }
    }
    return false;
    }
}
