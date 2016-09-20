package com.bips.minning.services;

import java.util.ArrayList;
import java.util.List;

import com.bips.minning.DAO.MinningDao;
import com.bips.minning.beans.MinningBean;

public class MinningServiceImpl implements MinningService {

	@Override
	public String insertData(int noOfHoles, int feet, float rate, String date)throws Exception{
		int totalFeet=noOfHoles*feet;
		float totalRS=totalFeet*rate;
		MinningDao md=new MinningDao();
		md.insertDataInDB(noOfHoles,feet,rate,date,totalFeet,totalRS);
		return "record insert successfully";
	}
	public List<MinningBean> findRecord(String fromdate,String todate){
		
		MinningDao md=new MinningDao();
	List<MinningBean> list=	md.findRecord(fromdate,todate);
	  total(fromdate,todate);
		System.out.println(list +"ghanshyam");
		return list;
	}
	
	public List total(String fromdate,String todate){
		
		MinningDao md=new MinningDao();
		List totallist=md.total(fromdate,todate);
		return totallist;
	}
}
