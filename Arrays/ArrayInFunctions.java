/**
 * ArrayInFunctions
 */
import java.util.Arrays;

public class ArrayInFunctions {
  public static void main(String[] args) {
    int[] nums = { 1, 4, 7, 2, 9 };
    System.out.println(Arrays.toString(nums));

    //calling the function
    change(nums);

    System.out.println(Arrays.toString(nums));
  }

  // making a function
  static void change(int[] arr) {
    arr[0] = 6;
  }
}
