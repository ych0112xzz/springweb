package com.gtja.finance.mybatis;

import org.apache.ibatis.annotations.Select;

public interface GetUserInfo {

    @Select("select * from [user] where id =#{id}" )
    public User getUser(int id);
}
