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
        int[] orderedArray = new int[workingArray.length];
        //for each pair put the highest number first
        int keepLooping = 0;
        while (keepLooping < 2) {
            for (int i = 0; i < workingArray.length-1; i++) {
                int firstPosition = workingArray[i];
                int secondPosition = workingArray[(i + 1)];
                if (firstPosition < secondPosition) {
                    workingArray[(i)] = secondPosition;
                    workingArray[(i + 1)] = firstPosition;
                    System.out.println("Working... " + Arrays.toString(workingArray));
                    keepLooping = 0;
                } else {
                    keepLooping +=1;
                }
                System.out.println("KLin = " + keepLooping + " i = " + i);
            }
            System.out.println("KL = " + keepLooping);
        }

        return workingArray;
    }
}