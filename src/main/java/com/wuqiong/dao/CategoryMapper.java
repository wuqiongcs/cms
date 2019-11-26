package com.wuqiong.dao;

import java.util.List;

import com.wuqiong.entity.Category;
/**
 * 
 * @author 吴琼
 *
 */
public interface CategoryMapper {

	/**
	 * 获取分类
	 * @param chnId
	 * @return
	 */
	List<Category> listByChannelId(int chnId);
	

}
