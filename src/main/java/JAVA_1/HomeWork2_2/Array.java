package JAVA_1.HomeWork2_2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] array3x3 = new int[3][3];

        System.out.println(Arrays.deepToString(array3x3));

        for (int i = 0; i < array3x3.length; i++) {
            for (int j = 0; j < array3x3[i].length; j++) {
                array3x3[i][j] = i * 3 + j + 1;
            }
        }

        System.out.println(Arrays.deepToString(array3x3));

        int[][] array2x5 = new int[2][5];

        boolean isEqual = Arrays.deepEquals(array3x3, array2x5);

        System.out.println("Результат сравнения массивов: " + isEqual);
    }
}
