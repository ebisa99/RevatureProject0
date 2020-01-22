package com.revature.project0;
import java.util.Scanner;
public class OfferSevice {
	OfferDAOPostgres offer = new OfferDAOPostgres();
	Scanner scan = new Scanner(System.in);
	public void createOffer()
	{
		System.out.println("enter the your offer");
		double off = scan.nextDouble();
		Offer of = new Offer(off);
		offer.createOffer(of);
	}
}
