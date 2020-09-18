package com.congzhou.model;
import java.io.Serializable;

public class MessageStore implements Serializable{
    private String message;

    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }
}
