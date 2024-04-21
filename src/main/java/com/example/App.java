package com.example;

public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("Red");
        UserInterface mountainUserInterface = createUserInterface("Blue");
//        UserInterfaceFactory userInterface=UserFactory.getInterface("Red");
        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        var userInterfaceFactory=UserFactory.getInterface(color);
        var button=userInterfaceFactory.createButton();
        var scrollBar=userInterfaceFactory.createScrollBar();

    return new UserInterface(button,scrollBar);
    }

}

