package me.packageotty.sort;

import com.sun.istack.internal.NotNull;

public class Sort {

    public static void sort(@NotNull Integer[] input){
        int inputLenght= input.length;

        for (int i = 0; i < inputLenght; i++) {
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

    public void sort(@NotNull Float[] input){
        int inputLenght= input.length;

        for (int i = 0; i < inputLenght; i++) {
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


    public static void main(String[] args) {
        Integer[] input = {12, 2211, 1, 0, 11111
                , 2222, 3235, 65435};
        sort(input);
//
        for(int s : input) {
            System.out.println(s);
        }

    }
}
