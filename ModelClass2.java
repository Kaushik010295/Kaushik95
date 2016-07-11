package com.model3;

public class ModelClass2 {
	private String id1;
	private String pass;
	public ModelClass2(String id1, String pass) {
		
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
