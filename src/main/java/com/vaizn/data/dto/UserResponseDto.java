package com.vaizn.data.dto;

import java.io.Serializable;
import java.util.List;

import com.vaizn.data.busi.dal.entity.User;

public class UserResponseDto implements Serializable {

	private static final long serialVersionUID = 7577579425123908657L;

	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
