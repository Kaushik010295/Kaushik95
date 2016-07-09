package com.model;

public class ModelCls {
	
private String user;
private String pass;
public ModelCls(String user, String pass) {
	
	this.user = user;
	this.pass = pass;
}
public int checkData()
{
	if(user.equals("kaushik")&& pass.equals("1234567"))
	{
		return 0;
	}
	else
	{
		return 1;
	}
}
}
