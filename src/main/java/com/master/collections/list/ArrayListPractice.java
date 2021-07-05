package com.master.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Best class
 */
public class ArrayListPractice {

    private static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER NUMBER OF NAMES TO BE ADDED");
        int limit = scan.nextInt();

        String[] names = new String[limit];

        System.out.println("ENTER NAMES");

        for(int i=0; i< limit; i++)
        {
            names[i] = scan.next();
        }

        addList(names);
        display();

    }

    public static void addList(String[] names)
    {
        for (String name : names)
        {
            list.add(name);
        }

       // SMS_Service sms = new SMS_Service();


    }

    public static void display()
    {
        System.out.println(list);
    }

}
