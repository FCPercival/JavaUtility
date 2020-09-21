package me.packageotty.sort;

import com.sun.istack.internal.NotNull;
import sun.security.util.Length;

import java.util.Arrays;

public class Sort {
    /**
     * Standard sort
     * <ul>
     * <li> Sorts the string array elements.
     * </ul>
     *
     * @param input - *Type* array to be sorted
     * @param decreasing - False sort number increasing, True number decreasing
     */

    public static void sort(@NotNull Integer[] input,@NotNull boolean decreasing){

        if(decreasing){
            for (int i = 0; i < input.length-1; i++) {
                for (int j = 0; j < i+1; j++) {
                    if (input[i] < input[j]) {
                        int temp = 0;
                        temp = input[j];
                        input[j] = input[i];
                        input[i] = temp;
                    }

                }
            }
        }else {
            Arrays.sort(input);
        }

    }


    public void sort(@NotNull Float[] input,@NotNull boolean decreasing){
        if(decreasing){
            for (int i = 0; i < input.length-1; i++) {
                for (int j = 0; j < i+1; j++) {
                    if (input[i] < input[j]) {
                        float temp = 0;
                        temp = input[j];
                        input[j] = input[i];
                        input[i] = temp;
                    }

                }
            }
        }else {
            Arrays.sort(input);
        }

    }
    public void sort(@NotNull Double[] input,@NotNull boolean decreasing){
        if(decreasing){
            for (int i = 0; i < input.length-1; i++) {
                for (int j = 0; j < i+1; j++) {
                    if (input[i] < input[j]) {
                        double temp = 0;
                        temp = input[j];
                        input[j] = input[i];
                        input[i] = temp;
                    }

                }
            }
        }else {
            Arrays.sort(input);
        }

    }
    public void sort(@NotNull Short[] input,@NotNull boolean decreasing){
        if(decreasing){
            for (int i = 0; i < input.length-1; i++) {
                for (int j = 0; j < i+1; j++) {
                    if (input[i] < input[j]) {
                        short temp = 0;
                        temp = input[j];
                        input[j] = input[i];
                        input[i] = temp;
                    }

                }
            }
        }else {
            Arrays.sort(input);
        }

    }
    public void sort(@NotNull Long[] input,@NotNull boolean decreasing){
        if(decreasing){
            for (int i = 0; i < input.length-1; i++) {
                for (int j = 0; j < i+1; j++) {
                    if (input[i] < input[j]) {
                        Long temp = 0L;
                        temp = input[j];
                        input[j] = input[i];
                        input[i] = temp;
                    }

                }
            }
        }else {
            Arrays.sort(input);
        }

    }


    public static void main(String[] args) {
        Integer[] input = {12, 2211, 1, 3, 11111
                , 2222, 3235, 65435, 12};
        sort(input, false);
        for(int s : input) {
            System.out.println(s);
        }
    }
}
