package com.example.bean;

/**
 * 用户实体类
 *
 * @author pc
 * @since 2020/8/8
 */
public class User {
    /**
     * id 用户id
     * username 用户名
     * password 密码
     * collect 收藏商品id
     * jvaluse 京享值
     * credit 信用
     */
    private int id;
    private String username;
    private String password;
    private int collect;
    private int jvalues;
    private int credit;

    public User() {
        super();
    }

    public User(int id, String username, String password, int collect, int jvalues, int credit) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.collect = collect;
        this.jvalues = jvalues;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCollect() {
        return collect;
    }

    public void setCollect(int collect) {
        this.collect = collect;
    }

    public int getJvalues() {
        return jvalues;
    }

    public void setJvalues(int jvalues) {
        this.jvalues = jvalues;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
