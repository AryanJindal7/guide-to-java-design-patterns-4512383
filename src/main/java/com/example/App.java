package com.example;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var french = new LocalizedMessageAdapter();
        var frenchGreeting = new Greeting(french);
        frenchGreeting.print();
    }

}
