package com.silentdream.service.user.biz.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.silentdream.facade.user.entity.User;
import com.silentdream.facade.user.service.UserFacade;

@Service("userFacade")
public class LoginServiceImpl implements UserFacade {

	public List<User> list() {
		return null;
	}

	public int count() {
		return 0;
	}

	public void create(User User) {
		// TODO Auto-generated method stub
		
	}

	public User getById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByUserNo(String userNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUserById(long userId) {
		// TODO Auto-generated method stub
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updateUserPwd(Long userId, String newPwd, boolean isTrue) {
		// TODO Auto-generated method stub
		
	}

}
