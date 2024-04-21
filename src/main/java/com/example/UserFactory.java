package com.example;

import java.util.HashMap;
import java.util.function.Supplier;

class UserFactory {

    private static final HashMap<String, Supplier<UserInterfaceFactory>> hm=new HashMap<>();

    static{
        hm.put("Red",RedUserInterfaceFactory::new);
        hm.put("Blue",BlueUserInterfaceFactory::new);

    }

    public static UserInterfaceFactory getInterface(String color)
    {
        if(hm.containsKey(color))
            return hm.get(color).get();
        else
            throw new IllegalArgumentException("Invalid color");
    }

}
