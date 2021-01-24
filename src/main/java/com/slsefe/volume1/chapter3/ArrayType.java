package com.slsefe.volume1.chapter3;

import java.util.Arrays;

/**
 * Core Java Volume I chapter 3
 * Array Type
 * @version 0.1 2021-01-24
 * @author yin bai
 * 数组是一种用来存储同一类型数据的集合，可以通过下标访问数组中的每一个值。
 * 在声明数组变量时，需要指出数组类型和变量名称
 */
public class ArrayType {
    public static void main(String[] args) {
        arrayInit();
        arrayCopy();
        arraySort();
        arrayBinarySearch();
        multiDimArray();
    }

    public static void arrayInit() {
        // 创建数组时，可以指定也可以不指定初始值。
        // 如果不指定初始值，会根据数组的类型使用默认值。
        System.out.println(Arrays.toString(new int[10]));  // 数字数组默认值为0
        System.out.println(Arrays.toString(new boolean[10]));  // boolean数组默认值为false
        System.out.println(Arrays.toString(new String[10]));  // 对象数组默认值为null

        // 一旦创建了数组，就不能再改变它的大小，只能够改变其中的元素值。
        // 如果经常需要在运行过程中扩展数组的大小，应该使用数组列表ArrayList

        // 创建数组时指定初始值的简化写法
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        System.out.println(Arrays.toString(smallPrimes));

        // for each循环，for each的适用对象为数组或者实现了Iterator接口的类对象(如ArrayList)
        for (int element : smallPrimes)
            System.out.print(element + ",");
        System.out.print("\n");
    }

    public static void arrayCopy() {
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};

        // 将一个数组变量拷贝给另一个数组变量，两个变量引用同一个数组
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12;  // now smallPrimes[5] is also 12
        System.out.println(Arrays.equals(smallPrimes, luckyNumbers));  // true

        // 使用数组的拷贝方法，会创建一个新的数组
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        copiedLuckyNumbers[5] = 13;
        System.out.println(Arrays.equals(copiedLuckyNumbers, luckyNumbers)); // false

        // 使用数组的拷贝方法可以用来增加数组的大小
        // 数值型元素默认值为0，bool型数组默认值为false；新数组长度小于原有长度，则只拷贝最前面的数据元素
        luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
        System.out.println(Arrays.toString(luckyNumbers));
    }

    public static void arraySort() {
        int[] intArray = {3, -1, 9, 0, 23};
        System.out.println("original array = " + Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println("sorted array = " + Arrays.toString(intArray));
    }

    public static void arrayBinarySearch() {
        // 对有序数组使用二分查找搜索值，如果查找成功返回在数组中的下标，
        // 否则返回负数r，-r-1是为保持原有数组有序搜索值应该被插入的位置
        int[] orderedArray = {-42, 0, 42};
        System.out.println(Arrays.binarySearch(orderedArray, -43));  // -1
        System.out.println(Arrays.binarySearch(orderedArray, -42));  // 0
        System.out.println(Arrays.binarySearch(orderedArray, -41));  // -2
        System.out.println(Arrays.binarySearch(orderedArray, 0));  // 1
        System.out.println(Arrays.binarySearch(orderedArray, 1));  // -3
        System.out.println(Arrays.binarySearch(orderedArray, 42));  // 2
        System.out.println(Arrays.binarySearch(orderedArray, 43));  // -4
    }
    public static void multiDimArray() {
        // 只指定维度，默认值初始化
        int NYEARS = 10, NRATES = 6;
        double[][] balances = new double[NYEARS][NRATES];

        // 使用值初始化
        int[][] magicSquare = {
            {1, 4, 9, 16},
            {4, 8, 17, 33},
            {9, 17, 34, 67},
            {16, 33, 67, 134}
        };

        // 遍历二维数组
        for (int[] row : magicSquare)
            for (int value : row)
                System.out.print(value + ",");
        System.out.println("\n");

        // 打印二维数组
        System.out.println(Arrays.deepToString(magicSquare));
    }
}
