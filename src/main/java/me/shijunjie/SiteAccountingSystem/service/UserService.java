package me.shijunjie.SiteAccountingSystem.service;

import me.shijunjie.SiteAccountingSystem.entity.TUser;

public interface UserService {
	public TUser getUser(String userName, String passWord);
}
