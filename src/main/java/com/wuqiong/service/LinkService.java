package com.wuqiong.service;

import com.github.pagehelper.PageInfo;
import com.wuqiong.entity.Link;
/**
 * 
 * @author 吴琼
 *
 */
public interface LinkService {

	 int add(Link link);
	PageInfo list(int page);

}
