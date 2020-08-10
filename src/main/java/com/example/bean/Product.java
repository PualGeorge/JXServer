package com.example.bean;

/**
 * The type Product.
 * @author pc
 */
public class Product {
    /**
     * The Id.
     */
    int id;
    /**
     * The Desc.
     */
    String desc;
    /**
     * The Price.
     */
    String price;
    /**
     * The Size.
     */
    String size;
    /**
     * The Store.
     */
    int store;
    /**
     * The Quantity.
     */
    int quantity;

    /**
     * Instantiates a new Product.
     *
     * @param id       the id
     * @param desc     the desc
     * @param price    the price
     * @param size     the size
     * @param store    the store
     * @param quantity the quantity
     */
    public Product(int id, String desc, String price, String size, int store, int quantity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.size = size;
        this.store = store;
        this.quantity = quantity;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Gets store.
     *
     * @return the store
     */
    public int getStore() {
        return store;
    }

    /**
     * Sets store.
     *
     * @param store the store
     */
    public void setStore(int store) {
        this.store = store;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
