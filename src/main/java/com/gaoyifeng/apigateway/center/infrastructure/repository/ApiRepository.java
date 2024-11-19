package com.gaoyifeng.apigateway.center.infrastructure.repository;

import com.gaoyifeng.apigateway.center.domain.model.ApiData;
import com.gaoyifeng.apigateway.center.domain.repository.IApiRepository;
import com.gaoyifeng.apigateway.center.infrastructure.dao.IHttpStatementDao;
import com.gaoyifeng.apigateway.center.infrastructure.po.HttpStatement;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoyifeng
 * @Classname ApiRepository
 * @Description TODO
 * @Date 2024/11/19 19:22
 * @Created by gaoyifeng
 */
@Repository
public class ApiRepository implements IApiRepository {

    @Resource
    private IHttpStatementDao httpStatementDao;

    @Override
    public List<ApiData> queryHttpStatementList() {
        List<HttpStatement> httpStatements = httpStatementDao.queryHttpStatementList();
        List<ApiData> apiDataList = new ArrayList<>(httpStatements.size());
        for (HttpStatement httpStatement : httpStatements) {
            ApiData apiData = new ApiData();
            apiData.setApplication(httpStatement.getApplication());
            apiData.setInterfaceName(httpStatement.getInterfaceName());
            apiData.setMethodName(httpStatement.getMethodName());
            apiData.setParameterType(httpStatement.getParameterType());
            apiData.setUri(httpStatement.getUri());
            apiData.setHttpCommandType(httpStatement.getHttpCommandType());
            apiData.setAuth(httpStatement.getAuth());
            apiDataList.add(apiData);
        }
        return apiDataList;
    }



}
