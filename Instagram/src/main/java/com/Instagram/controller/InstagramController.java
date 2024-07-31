package com.Instagram.controller;

import java.util.Scanner;

import com.Instagram.entity.User;
import com.Instagram.service.InstagramService;
import com.Instagram.service.InstagramServiceInterface;

public class InstagramController implements InstagramControllerInterface {

	@Override
	public void CreateProfile() {
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
		
		
	InstagramServiceInterface Is=new InstagramService();
	int i=Is.createProfileService(u);
	
	}

}
