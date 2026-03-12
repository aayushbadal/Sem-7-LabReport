// 4. Write a java program to initialize and display sum of each row of jagged array.

package Lab1;

public class Q4 {
    public static void main(String[] args) {

        int[][] jarr = new int[3][];
        jarr[0] = new int[]{1, 2, 3};
        jarr[1] = new int[]{4, 5};
        jarr[2] = new int[]{6, 7, 8, 9};

        int[] sum = new int[3];
        
        for (int i = 0; i < jarr.length; i++) {
            sum[i] = 0; 
            for (int j = 0; j < jarr[i].length; j++) {
                sum[i] += jarr[i][j];
            }
        }

        System.out.println("The Sum of each row of jagged array is:");
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Row " + i + " Sum = " + sum[i]);
        }
    }
}