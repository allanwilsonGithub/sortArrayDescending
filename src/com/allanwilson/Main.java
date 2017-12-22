package com.allanwilson;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers will you enter?\r");
        int numberOfInts = scanner.nextInt();
        if (numberOfInts <2){
            System.out.println("Too small number, bye bye!");
            System.exit(0);
        }
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

    public static int[] orderIntegers(int[] workingArray) {

        int[] previousWorkingArray = new int[workingArray.length];
        for (int i=0; i<workingArray.length; i++){
            previousWorkingArray[i] = workingArray[i];
        }

        boolean keepLooping = true;
        while (keepLooping) {
            for (int i = 0; i < workingArray.length-1; i++) {
                int firstPosition = workingArray[i];
                int secondPosition = workingArray[(i + 1)];
                if (firstPosition < secondPosition) {
                    workingArray[i] = secondPosition;
                    workingArray[(i + 1)] = firstPosition;
                }
            }
            if (Arrays.equals(workingArray, previousWorkingArray)) {
                keepLooping = false;
            } else {
                for (int i=0; i<workingArray.length; i++){
                    previousWorkingArray[i] = workingArray[i];
                }
            }
        }

        return workingArray;
    }
}