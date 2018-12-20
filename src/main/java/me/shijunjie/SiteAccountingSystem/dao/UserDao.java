package me.shijunjie.SiteAccountingSystem.dao;

import me.shijunjie.SiteAccountingSystem.entity.TUser;

public interface UserDao {
	public TUser selectUser(String userName, String passWord);
}
