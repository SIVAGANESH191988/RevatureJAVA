package com.Instagram.service;

import com.Instagram.dao.InstagramDao;
import com.Instagram.dao.InstagramDaoInterface;
import com.Instagram.entity.User;

public class InstagramService implements InstagramServiceInterface {

	@Override
	public int createProfileService(User u) {
		InstagramDaoInterface Ida=new InstagramDao();
		
		int i=Ida.createProfileDao(u);
		return i;
	}

}
