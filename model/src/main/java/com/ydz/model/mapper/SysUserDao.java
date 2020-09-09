package com.ydz.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ydz.model.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

//系统用户
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
	
	//查询用户的所有权限
	List<String> queryAllPerms(Long userId);
	
	//查询用户的所有权限
	List<Long> queryAllMenuId(Long userId);

	//根据用户id获取部门数据Id列表 ~ 数据权限
	Set<Long> queryDeptIdsByUserId(Long userId);

	SysUserEntity selectByUserName(@Param("userName") String userName);
}