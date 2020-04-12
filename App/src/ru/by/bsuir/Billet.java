package ru.by.bsuir;

public class Billet {
    private Product currentProduct;
    private String shape;

    public Billet() {
        shape = "No shape";
        currentProduct = new Product();
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String newShape) {
        shape = newShape;
    }

    public Product getProduct() {
        return currentProduct;
    }

    public void setProduct(Product newProduct) {
        currentProduct = newProduct;
    }
}
