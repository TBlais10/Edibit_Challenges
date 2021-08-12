package com.company;

public class ArrayOfMultiples {

    public static int[] arrayOfMultiples(int num, int length) {

        int[] array = new int[length];
        array[0] += num;

        for (int i = 1; i < array.length; i++){
            array[i] += array[i - 1] + num;
        }

        return array;

    }

}
