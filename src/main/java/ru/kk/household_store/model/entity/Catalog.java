package ru.kk.household_store.model.entity;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Catalog {
    private final long catalogId;
    private String catalogName;
    private List<Product> products;
    public Catalog(String catalogName, List<Product> products) {
        this.catalogId = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
        this.catalogName = catalogName;
        this.products = products;
    }

    public long getCatalogId() {
        return catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogId='" + catalogId + '\'' +
                ", catalogName='" + catalogName + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalog catalog)) return false;
        return Objects.equals(getCatalogId(), catalog.getCatalogId()) && Objects.equals(getCatalogName(), catalog.getCatalogName()) && Objects.equals(getProducts(), catalog.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCatalogId(), getCatalogName(), getProducts());
    }
}