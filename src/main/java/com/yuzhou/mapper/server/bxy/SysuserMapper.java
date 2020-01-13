package com.yuzhou.mapper.server.bxy;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.yuzhou.entity.Sysuser;
@Mapper
public interface SysuserMapper {
    @Select("select * from sysUser where username = #{username} and password= #{userpassword}")
	public Sysuser login(Sysuser u);
	
}
