package me.shijunjie.SiteAccountingSystem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.dao.UserDao;
import me.shijunjie.SiteAccountingSystem.entity.TUser;
import me.shijunjie.SiteAccountingSystem.entity.TUserExample;
import me.shijunjie.SiteAccountingSystem.mapper.TUserMapper;

@Service
public class UserDaoImpl implements UserDao {

	@Autowired
	private TUserMapper tUserMapper;

	public TUser selectUser(String userName, String passWord) {
		TUserExample where = new TUserExample();
		where.createCriteria().andUsernameEqualTo(userName)
		.andUserpwdEqualTo(passWord);
		List<TUser> selectByExample = tUserMapper.selectByExample(where);
		return selectByExample.size() == 0? null : selectByExample.get(0);
	}
}
