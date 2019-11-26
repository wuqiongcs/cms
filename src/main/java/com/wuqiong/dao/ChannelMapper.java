package com.wuqiong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wuqiong.entity.Channel;
/**
 * 
 * @author 吴琼
 *
 */
public interface ChannelMapper {

	@Select("SELECT * FROM cms_channel ORDER BY id")
	public List<Channel> list();

}
