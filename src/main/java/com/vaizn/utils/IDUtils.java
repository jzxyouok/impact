package com.vaizn.utils;

import java.util.UUID;

public class IDUtils {

	/**
	 * 获取32位随机数
	 * @return
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
