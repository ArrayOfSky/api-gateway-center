package com.gaoyifeng.apigateway.center.domain.manager.service;

import com.gaoyifeng.apigateway.center.application.IConfigManageService;
import com.gaoyifeng.apigateway.center.domain.manager.model.vo.GatewayServerDetailVO;
import com.gaoyifeng.apigateway.center.domain.manager.model.vo.GatewayServerVO;
import com.gaoyifeng.apigateway.center.domain.manager.respository.IConfigManageRepository;
import com.gaoyifeng.apigateway.center.infrastructure.commom.Constants;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gaoyifeng
 * @Classname ConfigManageService
 * @Description TODO
 * @Date 2024/11/19 21:20
 * @Created by gaoyifeng
 */
@Service
public class ConfigManageService implements IConfigManageService {

    @Resource
    private IConfigManageRepository configManageRepository;

    @Override
    public List<GatewayServerVO> queryGatewayServerList() {
        return configManageRepository.queryGatewayServerList();
    }

    @Override
    public boolean registerGatewayServerNode(String groupId, String gatewayId, String gatewayName, String gatewayAddress) {
        GatewayServerDetailVO gatewayServerDetailVO = configManageRepository.queryGatewayServerDetail(gatewayId, gatewayAddress);
        if (null == gatewayServerDetailVO) {
            try {
                return configManageRepository.registerGatewayServerNode(groupId, gatewayId, gatewayName, gatewayAddress, Constants.GatewayStatus.Available);
            } catch (DuplicateKeyException e) {
                return configManageRepository.updateGatewayStatus(gatewayId, gatewayAddress, Constants.GatewayStatus.Available);
            }
        } else {
            return configManageRepository.updateGatewayStatus(gatewayId, gatewayAddress, Constants.GatewayStatus.Available);
        }
    }
}
