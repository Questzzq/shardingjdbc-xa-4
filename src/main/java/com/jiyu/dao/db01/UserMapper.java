package com.jiyu.dao.db01;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    @Update("update user set name = #{username} where id = #{uid}")
    int updateUserName(String username, String uid);

    @Select("select name from user where id = #{uid}")
    Object selectUserById(String uid);
}
