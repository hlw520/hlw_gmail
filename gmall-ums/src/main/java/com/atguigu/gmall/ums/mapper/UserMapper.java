package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author hlw
 * @email 2923374585@qq.com
 * @date 2021-07-29 19:24:58
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
