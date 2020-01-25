package org.umerfarooq.math_simplifi.Arithmetic;

import org.jetbrains.annotations.NotNull;

public class Addition {

    public static int sum(@NotNull int number1,@NotNull int number2){
        return number1+number2;
    }

    public static float sum(@NotNull float number1,@NotNull float number2){
        return number1+number2;
    }

    public static double sum(@NotNull double number1,@NotNull double number2){
        return number1+number2;
    }

    public static long sum(@NotNull long number1,@NotNull long number2){
        return number1+number2;
    }

    public static int selfSumArray(@NotNull int[] array){
        int sum = 0;
        for (int number:array) {
            sum += number;
        }
        return sum;
    }

    public static float selfSumArray(@NotNull float[] array){
        float sum = 0;
        for (float number:array) {
            sum += number;
        }
        return sum;
    }

    public double selfSumArray(@NotNull double[] array){
        int sum = 0;
        for (double number:array) {
            sum += number;
        }
        return sum;
    }

    public static long selfSumArray(@NotNull long[] array){
        long sum = 0;
        for (long number:array) {
            sum += number;
        }
        return sum;
    }
}
