package com.example;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem(new StoreItem.StoreItemBuilder( "A tasty snack", 7.0).build());


        addToItemRegistry(item1);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }

}
