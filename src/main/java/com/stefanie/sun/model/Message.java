package com.stefanie.sun.model;

import lombok.Data;

@Data
public class Message {

    private String name ;

    public Message(String name){
        this.name = name;
    }
}
