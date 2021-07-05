package com.master.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraylistShuffle {

    private static List<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {

        //call methods
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER AN ARRAY OF NUMBERS");
        int numofValues = scan.nextInt();

        Integer[] arrayofNumbers = new Integer[numofValues];
                System.out.println("ENTER VALUES NOW!!!");

        for (int i=0; i<numofValues; i++)
        {
            arrayofNumbers[i] = scan.nextInt();
        }

        //call shuffle method..
        System.out.println("BEFORE SHUFFLING...: " + arrayofNumbers.toString());

        shuffle(arrayofNumbers);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void shuffle(Integer[] array)
    {
        for (Integer value: array)
        {
            numbers.add(value);
        }

        Collections.shuffle(numbers);

        System.out.println("SHUFFLED ARRAY: " + numbers);



    }




}
