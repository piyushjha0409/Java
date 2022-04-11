public class Practice1 {
    public static void main(String[] args) {
        String str = "jehaj";
        
        System.out.println(checkPalindrome(str));
    }

    static boolean checkPalindrome(String str){
       char start = str.charAt(0);
       char end = str.charAt(str.length()-1);
      while(start!=end){
          return false;
       }
       return true;
    }
}
