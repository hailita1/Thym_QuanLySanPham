package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private double prince;
    private String characteristics;

    public Product() {
    }

    public Product(int id, String name, double prince, String characteristics) {
        this.id = id;
        this.name = name;
        this.prince = prince;
        this.characteristics = characteristics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
