package com.gaoyifeng.apigateway.center.interfaces;

import com.gaoyifeng.apigateway.center.application.IApiService;
import com.gaoyifeng.apigateway.center.domain.model.ApiData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gaoyifeng
 * @Classname ApiGatewayController
 * @Description TODO
 * @Date 2024/11/19 19:41
 * @Created by gaoyifeng
 */
@RestController
@RequestMapping("/api")
public class ApiGatewayController {

    private Logger logger = LoggerFactory.getLogger(ApiGatewayController.class);

    @Resource
    private IApiService apiService;

    @GetMapping(value = "list", produces = "application/json;charset=utf-8")
    public List<ApiData> getAnswerMap(){
        return apiService.queryHttpStatementList();
    }

}
