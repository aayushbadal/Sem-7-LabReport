//3. Write a java program to find multiplication of two 3X3 matrix.

package Lab1;
public class Q3 {
    public static void main(String[] args) {
        
        int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = new int [][] {{7,8,9},{1,2,3},{4,5,6}};
        
        
        int[][] mul= new int[3][3];
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        System.out.println("Resultant 3x3 Matrix:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
