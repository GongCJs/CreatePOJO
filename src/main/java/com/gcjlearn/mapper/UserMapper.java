package com.gcjlearn.mapper;

import com.gcjlearn.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}