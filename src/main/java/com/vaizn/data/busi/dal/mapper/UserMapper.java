package com.vaizn.data.busi.dal.mapper;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

import com.vaizn.data.busi.dal.entity.User;
import com.vaizn.data.dto.UserRequestDto;

public interface UserMapper extends Mapper<User> {
	
	/**
	 * 获取附近五公里范围内的用户信息
	 * @param dto
	 * @return
	 */
	public List<User> getNearbyUser(UserRequestDto dto);
}