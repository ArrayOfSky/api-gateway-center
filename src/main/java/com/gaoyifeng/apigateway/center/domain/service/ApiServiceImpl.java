package com.gaoyifeng.apigateway.center.domain.service;

import com.gaoyifeng.apigateway.center.application.IApiService;
import com.gaoyifeng.apigateway.center.domain.model.ApiData;
import com.gaoyifeng.apigateway.center.domain.repository.IApiRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gaoyifeng
 * @Classname ApiServiceImpl
 * @Description TODO
 * @Date 2024/11/19 19:29
 * @Created by gaoyifeng
 */
@Service
public class ApiServiceImpl implements IApiService {

    @Resource
    private IApiRepository apiRepository;

    @Override
    public List<ApiData> queryHttpStatementList() {
        List<ApiData> apiData = apiRepository.queryHttpStatementList();
        return apiData;
    }



}
