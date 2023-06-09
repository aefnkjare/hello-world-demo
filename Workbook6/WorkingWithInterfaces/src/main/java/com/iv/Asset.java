package com.iv;

public abstract class Asset implements Valuable {
    private String name;
    private double value;

    public Asset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
