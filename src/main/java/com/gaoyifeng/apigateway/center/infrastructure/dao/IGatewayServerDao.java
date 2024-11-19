package com.gaoyifeng.apigateway.center.infrastructure.dao;

import com.gaoyifeng.apigateway.center.infrastructure.po.GatewayServer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author gaoyifeng
 * @Classname IGatewayServerDao
 * @Description TODO
 * @Date 2024/11/19 20:15
 * @Created by gaoyifeng
 */
@Mapper
public interface IGatewayServerDao {

    List<GatewayServer> queryGatewayServerList();

}
