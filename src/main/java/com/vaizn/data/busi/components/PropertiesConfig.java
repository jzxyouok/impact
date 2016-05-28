package com.vaizn.data.busi.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("propertiesConfig")
public class PropertiesConfig {

	@Value("${jdbc.database}")
	private String dbAdapter;

	public String getDbAdapter() {
		return dbAdapter;
	}
}
