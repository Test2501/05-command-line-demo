package com.springboot.demo.mycoolapp.entities;

public class Greeting {
    long id;
    String content;

    public Greeting() {
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
