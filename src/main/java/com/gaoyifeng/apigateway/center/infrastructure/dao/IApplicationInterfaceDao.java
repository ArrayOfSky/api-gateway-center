package com.gaoyifeng.apigateway.center.infrastructure.dao;

import com.gaoyifeng.apigateway.center.infrastructure.po.ApplicationInterface;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gaoyifeng
 * @Classname IApplicationInterfaceDao
 * @Description TODO
 * @Date 2024/11/19 21:40
 * @Created by gaoyifeng
 */
@Mapper
public interface IApplicationInterfaceDao {

    void insert(ApplicationInterface applicationInterface);

}
