package com.gaoyifeng.apigateway.center.domain.repository;

import com.gaoyifeng.apigateway.center.domain.model.ApiData;

import java.util.List;

/**
 * @author gaoyifeng
 * @Classname IApiRepository
 * @Description TODO
 * @Date 2024/11/19 19:29
 * @Created by gaoyifeng
 */
public interface IApiRepository {

    List<ApiData> queryHttpStatementList();

}
