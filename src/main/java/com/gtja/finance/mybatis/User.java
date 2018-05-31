package com.gtja.finance.mybatis;

public class User {
    int id;
    String userName;
    String corp;

    public User(Integer id, String username, String corp) {
        this.id = id;
        this.userName = username;
        this.corp = corp;
    }

    public User(String userName, String corp) {
        this.userName = userName;
        this.corp = corp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }
}
