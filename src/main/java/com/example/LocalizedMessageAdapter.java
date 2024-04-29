package com.example;

public class LocalizedMessageAdapter implements LocalizedMessage {

    private final FrenchLocalizedMessage frenchLocalizedMessage;


    public LocalizedMessageAdapter() {
        this.frenchLocalizedMessage = new FrenchLocalizedMessage();
    }

    @Override
    public void sayHello() {
        frenchLocalizedMessage.sayBonjour();
    }
}
