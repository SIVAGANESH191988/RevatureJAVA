package com.Telegram.service;


import com.Telegram.dao.TelegramDao;
import com.Telegram.dao.TelegramDaoInterface;
import com.Telegram.entity.User;

public class TelegramService implements TelegramServiceInterface {

	@Override
	public int createProfileService(User u) {
		// TODO Auto-generated method stub
TelegramDaoInterface Tda=new TelegramDao();
		
		int i=Tda.createProfileDao(u);
		return i;
	}

}
