package com.Panashe.restaurant.management;

public class UpdateProduct {
    private  int product_id;
    private String name;
    private int price;
    private String category;

    public UpdateProduct() {
    }

    public UpdateProduct(int product_id, String name, int price, String category) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public UpdateProduct(int product_id, int price) {
        this.product_id = product_id;
        this.price = price;
    }


    public UpdateProduct(int product_id,String name, String category) {
        this.product_id= product_id;
        this.name = name;
        this.category = category;
    }

    public UpdateProduct(int product_id,String name, int price) {
        this.product_id= product_id;
        this.name = name;
        this.price = price;
    }

    public UpdateProduct(int price, String category) {
        this.price = price;
        this.category = category;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
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
        return "UpdateProduct{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
