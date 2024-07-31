package com.swiggy.service;

import com.swiggy.dao.SwiggyDao;
import com.swiggy.dao.swiggyDaoInterface;
import com.swiggy.entity.SwiggyModel;

public class SwiggyService implements swiggyServiceInterface {

	public int login(SwiggyModel se) {
		// TODO Auto-generated method stub
		swiggyDaoInterface sdi=new SwiggyDao();
		int i=sdi.login(se);
		return i;
	}

}
