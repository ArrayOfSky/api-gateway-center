package com.gaoyifeng.apigateway.center.infrastructure.repository;

import com.gaoyifeng.apigateway.center.domain.manager.model.GatewayServerDetailVO;
import com.gaoyifeng.apigateway.center.domain.manager.model.GatewayServerVO;
import com.gaoyifeng.apigateway.center.domain.manager.respository.IConfigManageRepository;
import com.gaoyifeng.apigateway.center.infrastructure.dao.IGatewayServerDao;
import com.gaoyifeng.apigateway.center.infrastructure.dao.IGatewayServerDetailDao;
import com.gaoyifeng.apigateway.center.infrastructure.po.GatewayServer;
import com.gaoyifeng.apigateway.center.infrastructure.po.GatewayServerDetail;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoyifeng
 * @Classname ConfigManageRepository
 * @Description TODO
 * @Date 2024/11/19 20:14
 * @Created by gaoyifeng
 */
@Repository
public class ConfigManageRepository implements IConfigManageRepository {

    @Resource
    private IGatewayServerDao gatewayServerDao;

    @Resource
    IGatewayServerDetailDao gatewayServerDetailDao;

    @Override
    public List<GatewayServerVO> queryGatewayServerList() {
        List<GatewayServer> gatewayServers = gatewayServerDao.queryGatewayServerList();
        List<GatewayServerVO> gatewayServerVOList = new ArrayList<>(gatewayServers.size());
        for (GatewayServer gatewayServer : gatewayServers) {
            GatewayServerVO gatewayServerVO = new GatewayServerVO();
            gatewayServerVO.setGroupId(gatewayServer.getGroupId());
            gatewayServerVO.setGroupName(gatewayServer.getGroupName());
            gatewayServerVOList.add(gatewayServerVO);
        }
        return gatewayServerVOList;
    }

    @Override
    public boolean registerGatewayServerNode(String groupId, String gatewayId, String gatewayName, String gatewayAddress, Integer status) {
        GatewayServerDetail gatewayServerDetail = new GatewayServerDetail();
        gatewayServerDetail.setGroupId(groupId);
        gatewayServerDetail.setGatewayId(gatewayId);
        gatewayServerDetail.setGatewayName(gatewayName);
        gatewayServerDetail.setGatewayAddress(gatewayAddress);
        gatewayServerDetail.setStatus(status);
        gatewayServerDetailDao.insert(gatewayServerDetail);
        return true;
    }

    @Override
    public GatewayServerDetailVO queryGatewayServerDetail(String gatewayId, String gatewayAddress) {
        GatewayServerDetail req = new GatewayServerDetail();
        req.setGatewayId(gatewayId);
        req.setGatewayAddress(gatewayAddress);
        GatewayServerDetail gatewayServerDetail = gatewayServerDetailDao.queryGatewayServerDetail(req);
        if (null == gatewayServerDetail) {
            return null;
        }
        GatewayServerDetailVO gatewayServerDetailVO = new GatewayServerDetailVO();
        gatewayServerDetailVO.setGatewayId(gatewayServerDetail.getGatewayId());
        gatewayServerDetailVO.setGatewayName(gatewayServerDetail.getGatewayName());
        gatewayServerDetailVO.setGatewayAddress(gatewayServerDetail.getGatewayAddress());
        gatewayServerDetailVO.setStatus(gatewayServerDetail.getStatus());
        return gatewayServerDetailVO;
    }

    @Override
    public boolean updateGatewayStatus(String gatewayId, String gatewayAddress, Integer available) {
        GatewayServerDetail gatewayServerDetail = new GatewayServerDetail();
        gatewayServerDetail.setGatewayId(gatewayId);
        gatewayServerDetail.setGatewayAddress(gatewayAddress);
        gatewayServerDetail.setStatus(available);
        return gatewayServerDetailDao.updateGatewayStatus(gatewayServerDetail);
    }

}
