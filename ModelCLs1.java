package com.model;

public class ModelCLs1 {
	private String id1;
	private String pass;
	public ModelCLs1(String id1, String pass) {
		
		this.id1 = id1;
		this.pass = pass;
	}
	public int VerifyDetails(){
	if(id1.equals("rayban") && pass.equals("rayban"))
			{
		     return 0;
			}
	else
	{
		return 1;
	}
	}
	

}
