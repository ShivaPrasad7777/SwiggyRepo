package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.model.WhatsappModel;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappContollerInterface {
	Scanner scan=new Scanner(System.in);

	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Name");
		String name=scan.next();
		System.out.println("Enter password");
		String pwd=scan.next();
		
		WhatsappModel wm=new WhatsappModel();
		wm.setName(name);
		wm.setPwd(pwd);
		
		WhatsappServiceInterface wsi=new WhatsappService();
		wsi.login(wm);
		

	}

	public void createProfile() {
		// TODO Auto-generated method stub

	}

	public void deleteprofile() {
		// TODO Auto-generated method stub

	}

}
