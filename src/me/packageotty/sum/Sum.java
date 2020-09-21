package me.packageotty.sum;

import com.sun.istack.internal.NotNull;

public class Sum {

    /**
     * This is a class which is used to sum two type of variables
     *
     * @param a First addend
     * @param b Second addend
     * @author Shadotty, FCPercival, Valentino
     */

    public byte sum(@NotNull byte a, @NotNull byte b) {
        return (byte) (a + b);
    }

    public short sum(@NotNull short a, @NotNull short b) {
        return (short) (a + b);
    }

    public int sum(@NotNull int a, @NotNull int b) {
        return a + b;
    }

    public long sum(@NotNull long a, @NotNull long b) {
        return a + b;
    }

    public float sum(@NotNull float a, @NotNull float b) {
        return a + b;
    }

    public double sum(@NotNull double a, @NotNull double b) {
        return a + b;
    }
}
