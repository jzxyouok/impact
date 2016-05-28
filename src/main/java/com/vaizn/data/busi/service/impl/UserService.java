package com.vaizn.data.busi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaizn.data.busi.dal.entity.User;
import com.vaizn.data.busi.dal.mapper.UserMapper;
import com.vaizn.data.busi.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getNearbyUser(double lng, double lat) {
		
		return userMapper.getNearbyUser(null);
	}
}
