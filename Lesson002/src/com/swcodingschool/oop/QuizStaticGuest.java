package com.swcodingschool.oop;

public class QuizStaticGuest {
	public int guestID;
	public int guestMoney;
	public int guestCount;
	public int storeMoney;
	
	public static int sirialNum = 100;
	public static int getserialNum() {
		return sirialNum;
	}
	

	public QuizStaticGuest(int guestID, int guestMoney) {
		this.guestID = sirialNum++;
		this.guestMoney = guestMoney;
	}
	
	public void takeStore(QuizStaticStore store) {
		store.take(1000);
		this.guestMoney -= 1000;
	}//end of takeStore()
	
	public void takeOffStore(QuizStaticStore store) {
		store.takeOffStore();
	}
	
	
	
	
}
