package com.slsefe.volume1.chapter3;

/**
 * Core Java Volume I chapter 3
 * Boolean Type
 * @version 0.1 2021-01-14
 * @author yin bai
 */
public class BooleanType {
    public static void main(String[] args) {
        printFields();
        initBoolean();
        logicOperation();
        transformToString();
        compare();
        isEquals();
    }

    private static void printFields() {
        // 1. field
        System.out.println(Boolean.TYPE);
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
    }

    private static void initBoolean() {
        // 2. constructor
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf("True"));
        System.out.println(Boolean.valueOf("else"));
    }

    private static void logicOperation() {
        // logic operate
        System.out.println(Boolean.logicalAnd(true, false));
        System.out.println(Boolean.logicalOr(true, false));
        System.out.println(Boolean.logicalXor(true, false));
    }

    private static void transformToString() {
        // string to boolean
        boolean b1 = Boolean.getBoolean("True");
        boolean b2 = Boolean.parseBoolean("True");
        boolean b3 = Boolean.parseBoolean("True");
        // boolean to string
        String s = Boolean.toString(b1);
    }

    private static void compare() {
        System.out.println(Boolean.compare(true, true));
        System.out.println(Boolean.compare(true, false));
        System.out.println(Boolean.compare(false, true));
    }

    private static void isEquals() {
        System.out.println(Boolean.TRUE.equals(Boolean.FALSE));
        System.out.println(Boolean.TRUE.equals(Boolean.TRUE));
    }
}
