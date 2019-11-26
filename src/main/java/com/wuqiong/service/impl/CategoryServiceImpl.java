package com.wuqiong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuqiong.dao.CategoryMapper;
import com.wuqiong.entity.Category;
import com.wuqiong.service.CategoryService;
/**
 * 
 * @author 吴琼
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryMapper categoryMapper;

	@Override
	public List<Category> listByChannelId(int chnId) {
		// TODO Auto-generated method stub
		return categoryMapper.listByChannelId(chnId);
	}

}
