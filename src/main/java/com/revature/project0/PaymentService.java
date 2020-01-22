package com.revature.project0;
import java.util.Scanner;
public class PaymentService {
	Scanner scan = new Scanner(System.in);
	PaymentDAOPostgres pay = new PaymentDAOPostgres();
	public void createPayment()
	{
		System.out.println("how much payment you want to make");
		double p = scan.nextDouble();
		Payment pa = new Payment(p);
			pay.createPayment(pa);
	}
}
