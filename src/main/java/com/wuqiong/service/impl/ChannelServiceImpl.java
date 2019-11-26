package com.wuqiong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuqiong.dao.ChannelMapper;
import com.wuqiong.entity.Channel;
import com.wuqiong.service.ChannelService;

/**
 * 
 * @author 吴琼
 *
 */

@Service
public class ChannelServiceImpl  implements ChannelService{
	
	@Autowired
	ChannelMapper channelMapper;

	@Override
	public List<Channel> list() {
		// TODO Auto-generated method stub
		return channelMapper.list();
	}

}
