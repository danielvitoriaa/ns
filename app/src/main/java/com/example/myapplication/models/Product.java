package com.example.myapplication.models;

public class Product {
    private final static String DATE_FORMAT = "yyyy/MM/dd";
    private String barCode;
    private String name;
    private double price;
    private String expirationDate;
    
    public Product(String barCode, String name, double price, String expirationDate) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
