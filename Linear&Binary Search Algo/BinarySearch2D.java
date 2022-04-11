public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {4,5,6,7,8,9},
            {3,4,5,6,7,8,9}
        };
    }

    static int[] search(int[][] matrix, int target){
         int r = 0;
         int c = matrix.length - 1;

         while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--; //eleminating the column
            }
         }
         return new int[]{-1,-1}; //return the variable without assigning to the variable 
    }
}
