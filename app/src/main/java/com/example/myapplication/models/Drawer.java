package com.example.myapplication.models;

import java.util.ArrayList;

public class Drawer {
    private final static int POSITIONS_LIMIT = 2;
    private String flavour;
    private ArrayList<Product> produtos;
    private int quantityAvailable;
    public Drawer(String flavour) {
        this.flavour = flavour;
        this.produtos = new ArrayList<>();
        this.quantityAvailable = 0;
    }
    public Drawer(String flavour, ArrayList<Product> produtos, int quantityAvailable) {
        this.flavour = flavour;
        this.produtos = produtos;
        this.quantityAvailable = quantityAvailable;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public ArrayList<Product> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Product> produtos) {
        this.produtos = produtos;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public int productsQuantity() {
        return produtos.size();
    }

    public boolean addProduct(Product newProduct) {
        if (this.produtos.size() < POSITIONS_LIMIT) {
            this.produtos.add(newProduct);
            return true;
        }
        return false;
    }

    public Product getFirstProduct() {
        Product p1 = this.produtos.get(0);
        return p1;
    }

    public boolean downloadProduct() {
        if( ! this.isEmpty()){
            this.produtos.remove(0);
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(this.produtos.size() == 0){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(this.produtos.size() == POSITIONS_LIMIT){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Drawer{" +
                "flavour='" + flavour + '\'' +
                ", produtos=" + produtos +
                ", quantityAvailable=" + quantityAvailable +
                '}';
    }
}
