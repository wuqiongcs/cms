package com.wuqiong.service;

import com.github.pagehelper.PageInfo;
import com.wuqiong.entity.Collect;
/**
 * 
 * @author 吴琼
 *
 */
public interface CollectService {
	/**
	 * 
	 * @param collect
	 * @return
	 */
	int add(Collect collect);
	/**
	 * 
	 * @param page
	 * @return
	 */
	PageInfo list(int userId,int page);
	/**
	 * 
	 * @param id
	 * @return
	 */
	int delete(int id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Collect get(int id);
	
	/**
	 * 
	 * @param collect
	 * @return
	 */
	int update( Collect collect);

}
