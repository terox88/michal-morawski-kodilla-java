package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }
    @Column(name = "PRODUCT_ID", unique = true)
    @Id
    @GeneratedValue
    @NotNull

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    @Column(name = "PRODUCT_NAME")

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    @OneToMany
            (       targetEntity = Item.class,
                    cascade = CascadeType.ALL,
                    mappedBy = "product",
                    fetch = FetchType.LAZY
            )
    public List<Item> getItems() {
        return items;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }
}
