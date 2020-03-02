package com.ydz.server.controller;

import com.ydz.model.entity.SysUserEntity;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: pmp
 * @description
 * @author: zzf
 * @create: 2020-03-02 15:25
 **/
public class AbstractController {
    //日志
    protected Logger log = LoggerFactory.getLogger(getClass());
    //获取当前登录用户的详情
    protected SysUserEntity getUser(){
        SysUserEntity user= (SysUserEntity) SecurityUtils.getSubject().getPrincipal();
        return user;
    }
    protected Long getUserId(){
        return getUser().getUserId();
    }

    protected String getUserName(){
        return getUser().getUsername();
    }

    protected Long getDeptId(){
        return getUser().getDeptId();
    }
}
