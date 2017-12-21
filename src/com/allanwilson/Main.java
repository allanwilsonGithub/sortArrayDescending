package com.allanwilson;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many number will you enter?\r");
        int numberOfInts = scanner.nextInt();
        System.out.println("Enter your numbers...");
        int[] integers = getIntegers(numberOfInts);
        String[] newArray = new String[]{};
        System.out.println("Total integers: " + integers.length);
        System.out.println("Unordered: " + Arrays.toString(integers));
        int[] orderedIntegers = orderIntegers(integers);
        System.out.println("Ordered: " + Arrays.toString(orderedIntegers));
    }

    public static int[] getIntegers (int numberOfInts){
        int[] newInts = new int[numberOfInts];
        for (int i=0; i<numberOfInts; i++){
            newInts[i] = scanner.nextInt();
        }
        return newInts;
    }

    public static int[] orderIntegers(int[] unorderedArray){
        int[] orderedArray = new int[unorderedArray.length];
        if (unorderedArray.length%2 == 0){
            System.out.println("Array is even...");
            //split whole array into pairs
            int numberOfPairs = unorderedArray.length/2;
            System.out.println("Number of pairs: " + numberOfPairs);
            //for each pair put the highest number first
            for (int i=0; i<numberOfPairs;i++){
                System.out.println("Pair: " + i);
                //how the hell do I get 1+2 3+4 5+6 etc...?
            }
            //set a 'changed' flag
            //if no changed flag sorting is done
        } else {
            System.out.println("Array is odd...");
        }

        return orderedArray;
    }
}