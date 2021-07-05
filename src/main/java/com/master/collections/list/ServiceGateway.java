package com.master.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceGateway {

   private static  Pojos po = new Pojos();

   private static List<Pojos> listofPojo = new ArrayList<>();

    public static void main(String[] args) throws SMSException {

      //collect the parameters and save it on class
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER NO OF SMS YOU WANT TO SEND!!");
        int NoOfSMS = scan.nextInt();

        for (int i =0; i < NoOfSMS; i++) {
            System.out.println("ENTER NAME");

            po.setFirstName(scan.next());

            System.out.println("ENTER LAST NAME");

            po.setLastName(scan.next());

            System.out.println("ENTER YOUR PHONE NO");

            po.setPhoneNumber(scan.nextLong());

            System.out.println("ENTER YOUR MESSAGE");

            po.setMessage(scan.next());

            System.out.println("ENTER MESSAGE TYPE");
            po.setMessage_type(scan.next());

            listofPojo.add(po);
        }
          //listofPojo.add(po);
        //pass the object to service class.
       SMS_Service sms = new SMS_Service();

        System.out.println(sms.sendMultiSMS(listofPojo));


    }
}
