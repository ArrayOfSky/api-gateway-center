package com.gaoyifeng.apigateway.center.domain.register.service;

import com.gaoyifeng.apigateway.center.application.IRegisterManageService;
import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationInterfaceMethodVO;
import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationInterfaceVO;
import com.gaoyifeng.apigateway.center.domain.register.model.vo.ApplicationSystemVO;
import com.gaoyifeng.apigateway.center.domain.register.repository.IRegisterManageRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gaoyifeng
 * @Classname RegisterManageService
 * @Description TODO
 * @Date 2024/11/19 21:49
 * @Created by gaoyifeng
 */
@Service
public class RegisterManageService implements IRegisterManageService {


    @Resource
    private IRegisterManageRepository registerManageRepository;

    @Override
    public void registerApplication(ApplicationSystemVO applicationSystemVO) {
        registerManageRepository.registerApplication(applicationSystemVO);
    }

    @Override
    public void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO) {
        registerManageRepository.registerApplicationInterface(applicationInterfaceVO);
    }

    @Override
    public void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceMethodVO) {
        registerManageRepository.registerApplicationInterfaceMethod(applicationInterfaceMethodVO);
    }

}
