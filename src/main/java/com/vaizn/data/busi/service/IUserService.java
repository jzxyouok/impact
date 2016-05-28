package com.vaizn.data.busi.service;

import java.util.List;

import com.vaizn.data.busi.dal.entity.User;

public interface IUserService {

	/**
	 * 根据当前用户所在的经、纬度获取五公里范围内所有用户信息<br>
	 * @param lng 经度<br>
	 * @param lat 纬度
	 * @return
	 */
	List<User> getNearbyUser(double lng, double lat);
}
