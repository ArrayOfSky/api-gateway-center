package com.gaoyifeng.apigateway.center.infrastructure.dao;

import com.gaoyifeng.apigateway.center.infrastructure.po.GatewayServerDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gaoyifeng
 * @Classname IGatewayServerDetailDao
 * @Description TODO
 * @Date 2024/11/19 20:15
 * @Created by gaoyifeng
 */
@Mapper
public interface IGatewayServerDetailDao {

    void insert(GatewayServerDetail gatewayServerDetail);

    GatewayServerDetail queryGatewayServerDetail(GatewayServerDetail gatewayServerDetail);

    boolean updateGatewayStatus(GatewayServerDetail gatewayServerDetail);

}
