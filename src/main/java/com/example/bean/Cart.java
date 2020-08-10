package com.example.bean;

/**
 * The type Cart.
 *
 * @author pc
 */
public class Cart {
    /**
     * The Id.
     */
    int id;
    /**
     * The Product id.
     */
    int productId;
    /**
     * The Product num.
     */
    int productNum;


    /**
     * Instantiates a new Cart.
     *
     * @param id         the id
     * @param productId  the product id
     * @param productNum the product num
     */
    public Cart(int id, int productId,int productNum) {
        this.id = id;
        this.productId = productId;
        this.productNum=productNum;
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
     * Gets product id.
     *
     * @return the product id
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets product id.
     *
     * @param productId the product id
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * Gets product num.
     *
     * @return the product num
     */
    public int getProductNum() {
        return productNum;
    }

    /**
     * Sets product num.
     *
     * @param productNum the product num
     */
    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }
}
