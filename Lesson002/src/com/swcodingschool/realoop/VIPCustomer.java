package com.swcodingschool.realoop;

public class VIPCustomer extends Customer {
	protected int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 동작...");
	}
	public int getAgentID() {
		return agentID;
	}
	
}
