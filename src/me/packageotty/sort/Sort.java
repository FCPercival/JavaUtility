package me.packageotty.sort;

import com.sun.istack.internal.NotNull;
import sun.security.util.Length;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Shadotty
 * @author FPercival
 * @GitHub https://github.com/Shadotty
 * @GitHub https://github.com/FCPercival
 */

public class Sort {
    /**
     * Standard sort
     * <ul>
     * <li> Sorts the string array elements.
     * </ul>
     *
     * @param input - *Type* array to be sorted
     * @param decreasing - False sort number increasing, True number decreasing
     *! Decreasing not optimized
     */

    public static void sort(@NotNull Integer[] input,@NotNull boolean decreasing){

        if(decreasing){
            Arrays.sort(input);
            for (int i=0; i< input.length;i++){
                for (int j = 0; j < i+1; j++) {
                    int temp = 0;
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }
        }else {
            Arrays.sort(input);
        }

    }
    public static void sort(@NotNull int[] input,@NotNull boolean decreasing){

        if(decreasing){
            Arrays.sort(input);
            for (int i=0; i< input.length;i++){
                for (int j = 0; j < i+1; j++) {
                    int temp = 0;
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }
        }else {
            Arrays.sort(input);
        }

    }


    public void sort(@NotNull Float[] input,@NotNull boolean decreasing){
        if(decreasing){
            Arrays.sort(input);
            for (int i=0; i< input.length;i++){
                for (int j = 0; j < i+1; j++) {
                    float temp = 0;
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }
        }else {
            Arrays.sort(input);
        }

    }
    public void sort(@NotNull Double[] input,@NotNull boolean decreasing){
        if(decreasing){
            Arrays.sort(input);
            for (int i=0; i< input.length;i++){
                for (int j = 0; j < i+1; j++) {
                    double temp = 0;
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }
        }else {
            Arrays.sort(input);
        }

    }
    public void sort(@NotNull Short[] input,@NotNull boolean decreasing){
        if(decreasing){
            Arrays.sort(input);
            for (int i=0; i< input.length;i++){
                for (int j = 0; j < i+1; j++) {
                    short temp = 0;
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }
        }else {
            Arrays.sort(input);
        }

    }
    public void sort(@NotNull Long[] input,@NotNull boolean decreasing){
        if(decreasing){
            Arrays.sort(input);
            for (int i=0; i< input.length;i++){
                for (int j = 0; j < i+1; j++) {
                    long temp = 0;
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }
        }else {
            Arrays.sort(input);
        }

    }
    private final static int SEED = 1;
    private final static int ARRAY_LIMIT = 5000000;
    private final static int RND_LOW = 0;
    private final static int RND_HIGH = 9999999;

    private static int[] createRandomArray(int limit, int low, int high) {
        return new Random(SEED).ints(limit, low, high).toArray();
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] input = createRandomArray(ARRAY_LIMIT, RND_LOW, RND_HIGH);
        //Integer[] input = {12, 2211, 1, 3, 11111
        //        , 2222, 3235, 65435, 2154, 54511};
        sort(input, false);
        //for(int s : input) {
        //    System.out.println(s);
        //}
        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");
    }
}
