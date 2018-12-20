package me.shijunjie.SiteAccountingSystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.dao.UserDao;
import me.shijunjie.SiteAccountingSystem.entity.TUser;
import me.shijunjie.SiteAccountingSystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public TUser getUser(String userName, String passWord) {
		return userDao.selectUser(userName, passWord);
	}

}
