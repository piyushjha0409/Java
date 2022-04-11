import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
       
    // String name1 = "Piyush Jha";
    // String name2 = "Piyush Jha";

    // System.out.println(name1.charAt(0));

    // System.out.println(name1 == name2);
    // System.out.println(name1.equals(name2));
   //  System.out.println(56);
   //  Integer num = new Integer(56);
   //  System.out.println(num.toString());
    // System.out.println(num);

    //string builder in java
   //  float c = 426.4534f;
   //  System.out.printf("The value is %.3f\n", c);

   //  System.out.printf("Pie is %.3f", Math.PI);

   //  System.out.println('a' + 'b');
   //  System.out.println("a" + "b");
   // System.out.println("Piyush" + new ArrayList<>());

   // String str = new String("Pimyush");
   // System.out.println(str.substring(2));

   // String first_name = "Piysuh";
   // String last_name = "Jha";
   // System.out.println(first_name.concat(last_name));
   // System.out.println(first_name.indexOf('u'));

   // String series = "";
   // for (int i = 0; i < 26; i++) {
   //     char ch = (char)('a' + i);
   //    //  System.out.println(ch);
   //    series = series + ch;
   // }
   // System.out.println(series);

   //string builder (This is the more otimized way for strings)
   // StringBuilder builder = new StringBuilder();
   // for (int i = 0; i < 26; i++) {
   //    char ch = (char) ('a' + i);
   //    builder.append(ch);
   // }
   // System.out.println(builder.toString());

   String name = "Piyush Jha";
   System.out.println(Arrays.toString(name.toCharArray()));
   } 

}
