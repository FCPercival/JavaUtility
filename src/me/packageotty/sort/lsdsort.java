package me.packageotty.sort;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Shadotty
 * @author FPercival
 * @GitHub https://github.com/Shadotty
 * @GitHub https://github.com/FCPercival
 */

//!FUNZIONA
//!https://gist.github.com/BBroerse/ad638d38d1869a7a81bd0464c1bdcb6c

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

    private final static int SEED = 1;
    private final static int ARRAY_LIMIT = 1000000;
    private final static int RND_LOW = 0;
    private final static int RND_HIGH = 99999990;

    private static int[] createRandomArray(int limit, int low, int high) {
        return new Random(SEED).ints(limit, low, high).toArray();
    }

    public static void main(String[] args) {
        int[] array = createRandomArray(ARRAY_LIMIT, RND_LOW, RND_HIGH);

        //System.out.println(Arrays.toString(array));


        sort(array);

        //System.out.println(Arrays.toString(array));
    }


    private static final int DEFAULT_RADIX = 10;

    /**
     * Sort array with Radix Least significant digit first
     *
     * @param array sort values inside this array
     */
    public static void sort(int[] array) {
        int maxDigit = getMaxDigit(array);

        int divisor = 1;
        for (int pos = 0; pos < maxDigit; ++pos) {
            List<List<Integer>> buckets = splitToBuckets(array, divisor, DEFAULT_RADIX);
            flattenBuckets(array, buckets);
            divisor *= DEFAULT_RADIX;
        }
    }

    /**
     * Split values into buckets depending on the divisor
     *
     * @param array all values
     * @param divisor sort values depending on this divisor
     * @param radix max amount of numbers in decimal numeral system
     *
     * @return the buckets
     */
    private static List<List<Integer>> splitToBuckets(int[] array, int divisor, int radix) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < radix; ++i) {
            buckets.add(new LinkedList<>());
        }
        for (int num : array) {
            int bucketIndex = Math.abs(num) / divisor % radix;
            buckets.get(bucketIndex).add(num);
        }
        return buckets;
    }

    /**
     * Concat all the buckets in order
     * @param array concat into this array
     * @param buckets the buckets with all the values
     */
    private static void flattenBuckets(int[] array, List<? extends List<Integer>> buckets) {
        int i = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                array[i++] = num;
            }
        }
    }

    /**
     * Get the max amount of digits of any one integer in the array
     *
     * @param array the array with all the values
     *
     * @return an integer with the maxmimum number of digits
     */
    private static int getMaxDigit(int[] array) {
        int max = 0;
        for (int i : array) {
            String number = Integer.toString(i);
            if (number.length() > max) {
                max = number.length();
            }
        }
        return max;
    }
}
