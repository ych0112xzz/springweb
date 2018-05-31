package com.gtja.finance.mybatis;

public interface UserOp {
    public User getUser(int id);

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);

    public int getNum();


}
