package com.example.myapplication.models;

import java.util.ArrayList;

public class Machine {
    private final static int DISCOUNT = 10;
    private final static int DAYS_TO_DISCOUNT = 4;
    private ArrayList<Drawer> drawers;
    private int select_drawer;

    public Machine(String flavour1, String flavour2, String flavour3, String flavour4) {
        this.drawers = new ArrayList<>();

        this.drawers.add(new Drawer(flavour1));
        this.drawers.add(new Drawer(flavour2));
        this.drawers.add(new Drawer(flavour3));
        this.drawers.add(new Drawer(flavour4));
    }
    public ArrayList<Drawer> getDrawers() {
        return drawers;
    }

    public void setDrawers(ArrayList<Drawer> drawers) {
        this.drawers = drawers;
    }

    public int getSelect_drawer() {
        return select_drawer;
    }

    public void setSelect_drawer(int select_drawer) {
        this.select_drawer = select_drawer;
    }

    public void addProductToDrawer(int i,Product pToAdd) {
        this.drawers.get(i).addProduct(pToAdd);
    }

    public int verifyQuantityAvailable(int i) {
        return this.drawers.get(i).productsQuantity();
    }

    @Override
    public String toString() {
        return "Machine{" +
                "drawers=" + drawers +
                ", select_drawer=" + select_drawer +
                '}';
    }
}
