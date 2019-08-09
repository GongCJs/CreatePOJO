package com.gcjlearn.mapper;

import com.gcjlearn.pojo.Message;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    int deleteByPrimaryKey(@Param("mId") String mId, @Param("uIdFrom") String uIdFrom);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(@Param("mId") String mId, @Param("uIdFrom") String uIdFrom);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}