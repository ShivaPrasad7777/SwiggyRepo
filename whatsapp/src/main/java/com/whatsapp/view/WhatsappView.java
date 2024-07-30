package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappContollerInterface;
import com.whatsapp.controller.WhatsappController;

public class WhatsappView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); 
		System.out.println("*******MAIN MENU******");
		System.out.println("Type 1 to login");
		System.out.println("Type 2 to create profile");
		System.out.println("Type 3 to delete profile");
		
		WhatsappContollerInterface wci=new WhatsappController();
		int opt=scan.nextInt();
		
		switch(opt) {
		case 1:
			wci.login();
			break;
		case 2:
			wci.createProfile();
			break;
		case 3:
			wci.createProfile();
			break;
		default: System.out.println("Invalid input");
		}
		
		

	}

}
