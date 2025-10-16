import java.util.Scanner;
import java.util.Arrays;

public class IdenticalArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        final int ROWS = 3;
        final int COLS = 3;

        int[][] m1 = new int[ROWS][COLS];
        int[][] m2 = new int[ROWS][COLS];

        
        System.out.print("Masukkan list1: ");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                m1[i][j] = input.nextInt();
            }
        }
        System.out.print("Masukkan list2: ");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                m2[i][j] = input.nextInt();
            }
        }
        
        if (equals(m1, m2)) {
            System.out.println("Dua array ini identik");
        } else {
            
            System.out.println("Dua array ini tidak identik");
        }
        
        input.close();
    }


    public static boolean equals(int[][] m1, int[][] m2) {
       
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }

        
        int[] arr1 = new int[m1.length * m1[0].length];
        int[] arr2 = new int[m2.length * m2[0].length];
        
        int index = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                arr1[index++] = m1[i][j];
            }
        }
        
        index = 0; 
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                arr2[index++] = m2[i][j];
            }
        }

      
        Arrays.sort(arr1);
        Arrays.sort(arr2);

       
        return Arrays.equals(arr1, arr2);
    }
}