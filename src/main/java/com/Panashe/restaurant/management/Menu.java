package com.Panashe.restaurant.management;


import jakarta.persistence.*;


@Entity
public class Menu {

    @Id
    @SequenceGenerator(
            name = "bank_id_sequence",
            sequenceName = "bank_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "bank_id_sequence"
    )
    private int productId;
    private String name;
    private  int price;
    private String category;

    public Menu() {
    }

    public Menu(int productId, String name, int price, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Menu(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}


