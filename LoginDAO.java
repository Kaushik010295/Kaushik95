package com.niit.Shoppingcart;

public class LoginDAO {
	
	
	
	
	
	public boolean isValidUser(String userID, String password)
	{
		if(userID.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
