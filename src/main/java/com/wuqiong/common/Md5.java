package com.wuqiong.common;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 加密的工具类
 * @author 吴琼
 *
 */
public class Md5 {

	public static String password(String password, String salt) {
		// TODO Auto-generated method stub
		return DigestUtils.md5Hex(password + "::::" +  salt);
	}

	
		
}
