package com.example.bean;

/**
 * The type Store.
 * @author pc
 */
public class Store {
    /**
     * The Id.
     */
    int id;
    /**
     * The Desc.
     */
    String desc;

    /**
     * Instantiates a new Store.
     *
     * @param id   the id
     * @param desc the desc
     */
    public Store(int id, String desc) {
        this.id = id;
        this.desc = desc;
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
}
