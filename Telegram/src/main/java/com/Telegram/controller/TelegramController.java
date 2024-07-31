package com.Telegram.controller;

import java.util.Scanner;

import com.Telegram.entity.User;
import com.Telegram.service.TelegramService;
import com.Telegram.service.TelegramServiceInterface;



public class TelegramController implements TelegramControllerInterface {

	public void CreateProfile() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		User u =new User();
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setAddress(address);
		
		
	TelegramServiceInterface Tc=new TelegramService();
	int i=Tc.createProfileService(u);
	
	}
	}


