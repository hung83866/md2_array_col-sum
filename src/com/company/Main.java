package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        while (1>0){
            int[][] arr = {
                    {1, 2, 4, 9, 6},
                    {-9, -4, 3, 4},
                    {0, 3},
                    {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}
            };
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập cột = ");
            int col = scanner.nextInt();
            System.out.println("Total = " + totalCols(arr, col));
        }
    }

    static int totalCols(int[][] array, int x) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == x) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
