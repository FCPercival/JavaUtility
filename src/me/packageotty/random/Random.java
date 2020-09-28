package me.packageotty.random;

import com.sun.istack.internal.NotNull;

/**
 * @author Shadotty
 * @author FPercival
 * @GitHub https://github.com/Shadotty
 * @GitHub https://github.com/FCPercival
 */
public class Random {

    public static void random(@NotNull Integer[] input){
        for (int i = 0; i < input.length; i++) {
            input[i]= Math.toIntExact(Math.round(Math.random()));
        }

    }

    public static void random(@NotNull Integer[] input,@NotNull int start,@NotNull int end){

        for (int i = start ; i < end; i++) {
            input[i]= Math.toIntExact(Math.round(Math.random()));
        }


    }
    public static void random(@NotNull Integer[] input,@NotNull int lenght){

        for (int i = 0 ; i < lenght; i++) {
            input[i]= Math.toIntExact(Math.round(Math.random()));
            
        }


    }


}
