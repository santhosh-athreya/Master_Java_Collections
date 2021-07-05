package com.master.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SMS_Service extends Abstract_Service {

    //constant
    private  static  List<String> param = new ArrayList<>();

    public String sendMultiSMS(List<Pojos> users) throws SMSException {

        init(users);

        String message = "";
        Pojos po = null;

        Iterator<Pojos> ite = users.iterator();
        while (ite.hasNext())
        {
            po = ite.next();
            message = po.getMessage();
        }

        return  "MESSAGE SENT TO: " + po.getFirstName() + " PHONE NUMBER: " + po.getPhoneNumber()
                + " MESSAGE : " + message;
    }

    @Override
    protected List<String> validateParams(List<Pojos> users) {


        //Iterate the list and vaildate each parameter
        Iterator<Pojos> ite = users.iterator();

        while (ite.hasNext()) {

            Pojos po = ite.next();
            String message = po.getMessage();
            long phoneNumber = po.getPhoneNumber();

            //check if the param is null or not
           if(param.size() == 0)
           {
              if(message == null)
              {
                  param.add(constants.PARAM_MESSAGE + ": message is null");
              }
              else {
                 param = validateMessages(message);
              }
           }

           if(param.size() == 0)
           {
               if (phoneNumber < 0)
               {
                  param.add(constants.PARAM_MESSAGE + ": Phone Number is null!");
               }
               else{
                   param = validatePhoneNumbers(phoneNumber);
               }
           }


        }

        return param;
    }

    //----------------------HELPER METHODS--------------------
    protected List<String> validateMessages(String message) {

        return validateParameters(message,constants.MESSAGE_LEN,
                constants.PARAM_MESSAGE,param);
    }

    protected List<String> validatePhoneNumbers(long number) {

        Long phoneNumber = number;

        System.out.println("String format of PhoneNumber "+ phoneNumber.toString());

        return validateParameters(phoneNumber.toString(),constants.PHONE_LEN,
                constants.PARAM_MESSAGE,param);
    }

    private List<String> validateParameters(String value, int maxlength, String name
            , List<String> param) {

        if ((value == null) || (value.length() == 0)
                || (value.length() > maxlength)) {
            param.add(name + " (" + value + ")");
        }
        return param;
    }



}
