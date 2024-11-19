package com.gaoyifeng.apigateway.center.infrastructure.dao;

import com.gaoyifeng.apigateway.center.infrastructure.po.HttpStatement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author gaoyifeng
 * @Classname IHttpStatementDao
 * @Description TODO
 * @Date 2024/11/19 19:22
 * @Created by gaoyifeng
 */
@Mapper
public interface IHttpStatementDao {

    List<HttpStatement> queryHttpStatementList();

}
