package com.kodilla.good.patterns.food.delivery;

public class Product {
    private String productId;
    private int productCategory;

    public Product(String productId, int productCategory) {
        this.productId = productId;
        this.productCategory = productCategory;
    }

    public String getProductId() {
        return productId;
    }

    public int getProductCategory() {
        return productCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productCategory != product.productCategory) return false;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        int result = productId.hashCode();
        result = 31 * result + productCategory;
        return result;
    }
}
