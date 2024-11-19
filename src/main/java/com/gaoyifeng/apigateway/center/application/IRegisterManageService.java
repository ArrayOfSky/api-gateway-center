package com.gaoyifeng.apigateway.center.application;

import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationInterfaceMethodVO;
import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationInterfaceVO;
import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationSystemVO;

/**
 * @author gaoyifeng
 * @Classname IRegisterManageService
 * @Description TODO
 * @Date 2024/11/19 21:48
 * @Created by gaoyifeng
 */
public interface IRegisterManageService {


    void registerApplication(ApplicationSystemVO applicationSystemVO);

    void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO);

    void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceMethodVO);


}
