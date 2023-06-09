package com.iv;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        int areaTotal = calculateArea(23, 19);
//        System.out.println(areaTotal);
//
//        boolean isPrimeResult = isPrime(18);
//        System.out.println(isPrimeResult);

//        int[] numbers = new int[]{1,2,3,4,5};
//        int maxResult = findMax(numbers);
//        System.out.println(maxResult);
//
//        String reversedStringResult = reverseString("racecar");
//        System.out.println(reversedStringResult);

        int[] numbers = new int[]{3,12324,765,23,6,0};
        int[] sortedNumsResult = sortArray(numbers);
        System.out.println(sortedNumsResult);
    }
    public static int calculateArea(int length, int width){
        return length * width;
    }
    public static boolean isPrime(int number){
        boolean isDivisible = false;
        for(int i=2;i<=Math.ceil(number/2);i++){
//            number%2 == 0
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
    public static int findMax(int[] numbers){
        return 0;
    }
    public static String reverseString(String stringToReverse){
        return " ";
    }
    public static int[] sortArray(int[] numbers){
        return new int[]{};
//        Arrays.toString() // This is how to make array's pretty
    }
}