package com.company;

import java.util.Arrays;

public class PerfectSquarePatch {

    public static int[][] squarePatch(int n) {

        int[][] squareArr = new int[n][n];

        if (n == 0) {
            System.out.println("[]");
        }

//        //for in loop method
//        for (int[] row : squareArr){
//            Arrays.fill(row, n);
//            System.out.println(Arrays.deepToString(squareArr));
//
//        }


//        //standard for loop method
        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[i].length; j++) {
                squareArr[i][j] = n;

                if (squareArr[i].length != squareArr[i].length + 1) {
                    System.out.println(Arrays.deepToString(squareArr));

                }
            }

        }

        return squareArr;

    }

}
