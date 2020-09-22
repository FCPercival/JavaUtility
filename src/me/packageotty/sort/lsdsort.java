package me.packageotty.sort;

import com.sun.istack.internal.NotNull;

/**
 * @author Shadotty
 * @author FPercival
 * @GitHub https://github.com/Shadotty
 * @GitHub https://github.com/FCPercival
 */

//!BETA
//!Funziona solo sort con string di pari lenght di caratteri

    //!fare test velocità lsd sort e sort di java. Per errore ^ magari evitare lsd

public class lsdsort {
    /**
     * Least Significant Digit sort
     * <ul>
     * <li> Sorts the string array elements, using LSD sort method.
     * <li> Suitable when the length of the strings to be sorted are <b>equal</b>.
     * <li> The strings are sorted according to the order of characters from right to left
     * </ul>
     *
     * @param input - String array to be sorted
     * @param w - Length of the strings in the array
     */

    public static void sort(@NotNull String[] input,@NotNull int w) {
        String[] aux = new String[input.length];
        //ascii chars
        int R = 256;
        int n = input.length;

        for(int d = w-1; d >= 0; d--) {

            int[] count = new int[R+1];
            //update the frequency at i+1 index
            for(int i=0; i<n; i++) {
                count[input[i].charAt(d) + 1] ++;
            }

            //transform the frequency into indices
            for(int r=0; r< R; r++) {
                count[r+1] += count[r];
            }

            //redistribute
            for(int i=0; i<n; i++) {
                aux[count[input[i].charAt(d)]++] = input[i];
            }

            for(int i=0; i<n; i++) {
                input[i] = aux[i];
            }
        }
    }


    public static void main(String[] args) {
        String[] input = {"4PGC938", "2IYE230", "3CIO720", "1ICK750", "1OHV845"
                ,"4JZY524", "1ICK750", "3CIO720", "1OHV845", "1OHV845", "2RLA629"
                ,"2RLA629", "3ATW723" };
        sort(input, 7);
        for(String s : input) {
            System.out.println(s);
        }
    }
}
