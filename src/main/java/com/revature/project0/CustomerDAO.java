package com.revature.project0;

import com.revature.pojo.Customer;

public interface CustomerDAO {
	public void createCustomer(Customer cust);
	public boolean userLogin(String username, String password);
}
