package com.swiggy.controller;

import java.util.Scanner;

import com.swiggy.entity.SwiggyModel;
import com.swiggy.service.SwiggyService;
import com.swiggy.service.swiggyServiceInterface;

public class SwiggyController implements swiggyControllerInterface {
	Scanner scan=new Scanner(System.in);
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Name");
		String name=scan.next();
		System.out.println("Enter your mobile number");
		int mbl=scan.nextInt();
		System.out.println("Enter your mail");
		String mail=scan.next();
		System.out.println("Enter Your Password");
		String pwd=scan.next();
		
		SwiggyModel se=new SwiggyModel();
		se.setName(name);
		se.setMblnum(mbl);
		se.setMail(mail);
		se.setPwd(pwd);
		
		swiggyServiceInterface ssi=new SwiggyService();
		int i=ssi.login(se);
		
		if(i > 0) {
			System.out.println("Account created");
		}
		else {
			System.out.println("Account not created");
		}
		

	}

	public void signUp() {
		// TODO Auto-generated method stub

	}

	public void delete() {
		// TODO Auto-generated method stub

	}

}
