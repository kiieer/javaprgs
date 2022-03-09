package com.revature.java.store2;
import java.text.DecimalFormat;

public class Customer {
	
	/* Kiersten Christlieb, 03/02/2022 
	 * "Dominos" 
	 */
	
	private static final DecimalFormat df = new DecimalFormat("0.00"); // this is a class that formats numbers.
	private String name;
	private double purchaseAmt;
	private double prevPurchaseAmts;
	private double taxRate;
	public final int storeID = 4162;
	public static String location = "Cornelia, Georgia";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPurchaseAmt() {
		return purchaseAmt;
	}

	public void setPurchaseAmt(double purchaseAmt) {
		this.purchaseAmt = purchaseAmt;
	}


	public double getPrevPurchaseAmts() {
		return prevPurchaseAmts;
	}

	public void setPrevPurchaseAmts(double prevPurchaseAmts, double purchaseAmt) {
		this.prevPurchaseAmts = prevPurchaseAmts;
	}

	public Customer() {
	}
	
	public Customer(String name, double purchaseAmt, double prevPurchaseAmts, double taxRate) {
		super();
		this.name = name;
		this.purchaseAmt = purchaseAmt;
		this.prevPurchaseAmts = prevPurchaseAmts;
		this.taxRate = taxRate;
	}



	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double calculateTotal(double prevPurchaseAmts, double purchaseAmt) {
		double collective = purchaseAmt + prevPurchaseAmts;
		double roundCollective = Math.round(collective*100.0)/100.0;
		return roundCollective;
		
	}
	
	public double calculateTotal(double prevPurchaseAmts, double purchaseAmt, double taxRate) {
		double collective = ((purchaseAmt * (taxRate / 100)));
		double taxCollective = Math.round(collective*100.0)/100.0;
		return taxCollective;
	}
	
	@Override
	public String toString() {
		return "STORE " + storeID + " (" + location + ") | Customer [name = " + name + ", today's purchase amount = $" + df.format(purchaseAmt) + ". Sales taxes: $" + df.format(calculateTotal(prevPurchaseAmts, purchaseAmt, taxRate)) + ". Previous CLV: " + df.format(prevPurchaseAmts) + ". New CLV: $"+ df.format(calculateTotal(prevPurchaseAmts, purchaseAmt)) + "]";
		
	}
}
	


