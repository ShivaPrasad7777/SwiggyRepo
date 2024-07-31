package com.swiggy.view;

import java.util.Scanner;

import com.swiggy.controller.SwiggyController;
import com.swiggy.controller.swiggyControllerInterface;

public class swiggyView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("*****Enter your choice*****");
		System.out.println("Type 1 for login");
		System.out.println("Type 2 for signup");
		System.out.println("Type 3 for delete");
		
		swiggyControllerInterface sci=new SwiggyController();
		
		int opt=scan.nextInt();
		switch(opt) {
		case 1:
			sci.login();
			break;
		case 2:
			sci.signUp();
			break;
		case 3:
			sci.delete();
			break;
		default:System.out.println("Invalid choice!!");
		}

	}

}
