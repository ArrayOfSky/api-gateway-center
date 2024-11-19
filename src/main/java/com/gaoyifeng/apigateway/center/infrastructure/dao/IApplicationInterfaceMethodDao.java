package com.gaoyifeng.apigateway.center.infrastructure.dao;

import com.gaoyifeng.apigateway.center.infrastructure.po.ApplicationInterfaceMethod;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gaoyifeng
 * @Classname IApplicationInterfaceMethodDao
 * @Description TODO
 * @Date 2024/11/19 21:40
 * @Created by gaoyifeng
 */
@Mapper
public interface IApplicationInterfaceMethodDao {

    void insert(ApplicationInterfaceMethod applicationInterfaceMethod);


}
