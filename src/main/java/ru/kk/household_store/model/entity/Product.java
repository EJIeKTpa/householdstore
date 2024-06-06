package ru.kk.household_store.model.entity;

import java.util.Objects;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;
    private int quantityInStock;
    private static int previous = 0;

    public Product(String nameProduct, double priceProduct, int quantityInStock) {
        previous++;
        idProduct = previous;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.quantityInStock = quantityInStock;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return idProduct == product.idProduct && Double.compare(priceProduct, product.priceProduct) == 0 && quantityInStock == product.quantityInStock && Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, nameProduct, priceProduct, quantityInStock);
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}