package com.silentdream.service.user.biz;

import java.util.List;

import com.silentdream.facade.user.entity.User;

public interface ILoginService {

	List<User> list();

	int count();

}
