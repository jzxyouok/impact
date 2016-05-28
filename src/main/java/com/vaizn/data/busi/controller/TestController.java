package com.vaizn.data.busi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaizn.common.BaseResponse;
import com.vaizn.data.busi.dal.entity.User;
import com.vaizn.data.busi.service.IUserService;
import com.vaizn.data.dto.UserRequestDto;

@RestController
public class TestController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(path = "/mytest", method={RequestMethod.POST, RequestMethod.GET})
	public BaseResponse getJson(@RequestBody(required = false) UserRequestDto userRequest) {
		System.out.println("==========================getJson");
		if (null != userRequest)
			System.out.println("----------------"+userRequest.getDbAdapter());
		List<User> users = userService.getNearbyUser(0, 0);
		if (null != users)
			System.out.println("--------------size:"+users.size());
		return new BaseResponse(1000, "操作成功");
	}
}
