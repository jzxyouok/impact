package com.vaizn.data.busi.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vaizn.common.BaseResponse;

@ControllerAdvice
public class BaseController {

	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public BaseResponse handleException(HttpServletRequest request, Exception e) {
		logger.error(e.getMessage());
		return new BaseResponse(1001, "操作失败", e);
	}
}
