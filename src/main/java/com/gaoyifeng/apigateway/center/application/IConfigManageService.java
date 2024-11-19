package com.gaoyifeng.apigateway.center.application;

import com.gaoyifeng.apigateway.center.domain.manager.model.vo.GatewayServerVO;

import java.util.List;

/**
 * @author gaoyifeng
 * @Classname IConfigManageService
 * @Description TODO
 * @Date 2024/11/19 21:19
 * @Created by gaoyifeng
 */
public interface IConfigManageService {

    List<GatewayServerVO> queryGatewayServerList();

    boolean registerGatewayServerNode(String groupId, String gatewayId, String gatewayName, String gatewayAddress);


}
