package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String maker;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return getMaker().equals(that.getMaker());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaker());
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "maker='" + maker + '\'' +
                '}';
    }
}
