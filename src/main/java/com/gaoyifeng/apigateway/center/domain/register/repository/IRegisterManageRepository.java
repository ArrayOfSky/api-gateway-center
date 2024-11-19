package com.gaoyifeng.apigateway.center.domain.register.repository;

import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationInterfaceMethodVO;
import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationInterfaceVO;
import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationSystemVO;

/**
 * @author gaoyifeng
 * @Classname IRegisterManageRepository
 * @Description TODO
 * @Date 2024/11/19 21:43
 * @Created by gaoyifeng
 */
public interface IRegisterManageRepository {

    void registerApplication(ApplicationSystemVO applicationSystemVO);

    void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO);

    void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceMethodVO);

}
