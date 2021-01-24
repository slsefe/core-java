package com.slsefe.volume1.chapter3;

/**
 * Core Java Volume I chapter 3
 * Integer Type
 * @version 0.1 2021-01-24
 * @author yin bai
*/
public class IntegerType {
    /**
     * byte  1bytes 8bits  -128,127
     * short 2bytes 16bits -32768,32767
     * int   4bytes 32bits -2147483648,2147483647
     * long  8bytes 64bits -2^63, 2^63-1
     */
    public static void main(String[] args) {
        printFields();
        initInteger();
        printInstanceFields();
        compareTwoIntegers();
        toOtherType();
    }

    private static void printFields() {
        System.out.println("integer fields");
        System.out.println(Integer.TYPE);  //int
        System.out.println(Integer.BYTES);  //4 bytes
        System.out.println(Integer.MIN_VALUE);  //-2147483648
        System.out.println(Integer.MAX_VALUE);  //2147483647
        System.out.println(Integer.SIZE);  //32 bits
    }

    private static void initInteger() {
        System.out.println("integer init");
        // init with init
        int i = 42;
        int j = 43;
        System.out.println("i1 = " + i);
        System.out.println("i2 = " + j);

        // init with string
        int i3 = Integer.parseInt("42");
        int i4 = Integer.parseInt("-42");
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
    }

    private static void printInstanceFields() {
        System.out.println("integer instance fields");
        System.out.println(Integer.hashCode(11));  // 11
        System.out.println(Integer.bitCount(11));  // 3
        System.out.println(Integer.highestOneBit(11));  // 8
        System.out.println(Integer.lowestOneBit(11));  // 1
    }

    private static void compareTwoIntegers() {
        System.out.println("compare two integers");
        int num1 = 10, num2 = -10;
        System.out.println(Integer.compare(num1, num2));  // 1
        System.out.println(Integer.compareUnsigned(num1, num2));  // -1
        System.out.println(Integer.divideUnsigned(num1, num2));  // 0
        System.out.println(Integer.max(num1, num2));  // 10
        System.out.println(Integer.min(num1, num2));  // -10
        System.out.println(Integer.sum(num1, num2));  // 0
    }

    private static void toOtherType() {
        System.out.println("integer types transform");
        // int, short, byte, long
        final int integer =0x0123_4567;
        System.out.println("integer = " + integer);
        System.out.println("(short)integer = " + (short) integer);
        System.out.println("(byte)integer = " + (byte) integer);
        System.out.println("(long)integer = " + (long) integer);
    }
}
