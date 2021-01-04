package com.swcodingschool.oop;

public class QuizStaticGuest {
	public int guestID;
	public int guestMoney;
	public int guestCount;
	public int storeMoney;
	
	public static int sirialNum = 100;
	static int getserialNum() {
		return serialNum;
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
	
	QuizStaticGuest Guest1 = new QuizStaticGuest("철수", 10000);
	QuizStaticGuest Guest2 = new QuizStaticGuest("영희", 20000);
	
	
	
	
	
}
