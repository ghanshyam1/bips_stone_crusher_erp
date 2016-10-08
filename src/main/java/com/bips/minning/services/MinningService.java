package com.bips.minning.services;

import java.util.List;

import com.bips.minning.beans.MinningBean;

public interface MinningService {
public String insertData(int noOfHoles,int feet,float rate,String date)throws Exception;

public List findRecord(String fromdate,String todate);

}
