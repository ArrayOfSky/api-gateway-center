package com.gaoyifeng.apigateway.center.domain.manager.respository;

import com.gaoyifeng.apigateway.center.domain.manager.model.vo.GatewayServerDetailVO;
import com.gaoyifeng.apigateway.center.domain.manager.model.vo.GatewayServerVO;

import java.util.List;

/**
 * @author gaoyifeng
 * @Classname IConfigManageRepository
 * @Description TODO 网关配置仓储服务
 * @Date 2024/11/19 20:11
 * @Created by gaoyifeng
 */
public interface IConfigManageRepository {

    List<GatewayServerVO> queryGatewayServerList();

    boolean registerGatewayServerNode(String groupId, String gatewayId, String gatewayName, String gatewayAddress, Integer available);

    GatewayServerDetailVO queryGatewayServerDetail(String gatewayId, String gatewayAddress);

    boolean updateGatewayStatus(String gatewayId, String gatewayAddress, Integer available);

}
