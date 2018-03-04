package com.silentdream.service.user.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.silentdream.facade.user.entity.User;

/**
 * @author zhangyd
 * @version V1.0
 * @Description
 * @date 2017年3月10日 下午2:42:45
 * @modify
 * @Review
 * @since JDK ： 1.7
 */
@Repository
public interface LoginMapper {
    List<User> list();

    int count();

    List<User> selectUser();
}
