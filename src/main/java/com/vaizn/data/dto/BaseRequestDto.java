package com.vaizn.data.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaizn.data.busi.components.PropertiesConfig;

public class BaseRequestDto implements Serializable {

	private static final long serialVersionUID = 1250458072909621887L;

	@Autowired
	private PropertiesConfig properties;
	
	public String dbAdapter;

	public String getDbAdapter() {
		this.dbAdapter = properties.getDbAdapter();
		return dbAdapter;
	}
}
