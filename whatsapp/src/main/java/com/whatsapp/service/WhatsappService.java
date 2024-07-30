package com.whatsapp.service;

import com.whatsapp.dao.WhatsappDao;
import com.whatsapp.dao.WhatsappInterfaceDao;
import com.whatsapp.model.WhatsappModel;

public class WhatsappService implements WhatsappServiceInterface {

	
	public void login(WhatsappModel wm) {
		// TODO Auto-generated method stub
		if(wm.getName().equals("Shiva") && wm.getPwd().equals("123")) {
			WhatsappInterfaceDao wid=new WhatsappDao();
		}
		
	}

}
