package com.master.collections.list;

import java.util.List;
import java.util.Objects;

public class Pojos {

    private String FirstName;

    private String lastName;

    private long phoneNumber;

    private String message;

    private String message_type;

    private List<String> lisofNames;

    public Pojos()
    {
        
    }

    public Pojos(String FirstName, String lastName, long phoneNumber,String message,String message_type) {
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.message_type = message_type;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMessage_type() {
        return message_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getLisofNames() {
        return lisofNames;
    }

    public void setLisofNames(List<String> lisofNames) {
        this.lisofNames = lisofNames;
    }

    public long getPhoneNumber() { return phoneNumber;}

    public void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getMessage() { return message; }

    public void setMessage(String message) {
        this.message = message;
    }
}
