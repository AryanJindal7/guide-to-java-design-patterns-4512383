package com.example;

public class StoreItem

{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    public StoreItem(StoreItemBuilder storeItemBuilder) {
        this.name = storeItemBuilder.name;
        this.price = storeItemBuilder.price;
        this.shortDescription = storeItemBuilder.shortDescription;
        this.longDescription = storeItemBuilder.longDescription;
        this.stockAvailable = storeItemBuilder.stockAvailable;
        this.packagingType = storeItemBuilder.packagingType;
        if (name == null || price == null) {
            throw new IllegalArgumentException("Name and price must not be null");
        }
    }

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }
    static class StoreItemBuilder{
        private final String name;
        private final Double price;
        private  String shortDescription;
        private  String longDescription;
        private  Integer stockAvailable;
        private  String packagingType;

        StoreItemBuilder(String name,Double price)
        {
            this.name=name;
            this.price=price;
        }

        public void shortDescription(String  shortDescription){
            this.shortDescription=shortDescription;
        }
        public void longDescription(String  longDescription){
            this.longDescription=longDescription;
        }
        public void stockAvailable(Integer  stockAvailable){
            this.stockAvailable=stockAvailable;
        }
        public void packagingType(String  packagingType){
            this.packagingType=packagingType;
        }

        StoreItemBuilder build()
        {
            return this;
        }
    }
}
