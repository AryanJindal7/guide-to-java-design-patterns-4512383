package com.example;

import java.util.HashMap;
import java.util.function.Supplier;

public class VendingMachine {

    private static final HashMap<String, Supplier<Snack>> hm=new HashMap<>();

    static{
        hm.put("Drink",Drink::new);
        hm.put("Chips",Chips::new);
        hm.put("ChocolateBar",ChocolateBar::new);
    }

    Snack getSnack(String snackType) {
        if(hm.get(snackType)!=null)
            return hm.get(snackType).get();
        else
            throw new IllegalArgumentException("Invalid Snack");
    }


}
