package me.packageotty.sort;

import com.sun.istack.internal.NotNull;

public class Sort {

    public static void sort(@NotNull Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = 0;
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }

    public void sort(@NotNull Float[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    float temp = 0;
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }
}
