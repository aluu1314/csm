package com.shenjialong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.shenjialong.entity.Channel;

public interface ChannelMapper {

	@Select("SELECT * FROM cms_channel ORDER BY id")
	public List<Channel> list();

}
