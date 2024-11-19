package com.gaoyifeng.apigateway.center.application;

import com.gaoyifeng.apigateway.center.domain.model.ApiData;

import java.util.List;

/**
 * @author gaoyifeng
 * @Classname IApiService
 * @Description TODO
 * @Date 2024/11/19 19:33
 * @Created by gaoyifeng
 */
public interface IApiService {

    List<ApiData> queryHttpStatementList();


}
