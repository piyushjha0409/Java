import java.util.*;

public class Input {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // array of objects
    String[] arr = new String[5];

    // taking the input
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.next();
    }

    // printing the array
    System.out.print(Arrays.toString(arr));

    scn.close();
  }
}
