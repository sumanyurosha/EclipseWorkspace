package com.fil.basic;

public class Hotel {
	private String hotelName,hotelAddress;
	Level[] levels = new Level[5];
	private static int levelCount = 0;
	public Hotel(String hotelName, String hotelAddress) {
		
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
	}


	public String getHotelName() {
		return hotelName;
	}


	public String getHotelAddress() {
		return hotelAddress;
	}
	
	public void addLevel(Level l){
		levels[levelCount++] = l;
	}
	

	public static void main(String args[]){
		Hotel hotel = new Hotel("Central Blue Stone", "Sec.29, Gurgaon");
		Level l1 = new Level(1);
		hotel.addLevel(l1);
		Rooms r1 = new SingleBedding(101,2000,1);
		Rooms r2 = new DoubleBedding(104,3000,2);
		Rooms r3 = new DeluxeSuite(109,5000);
		Rooms r4 = new HoneymoonSuite(108,6000);
		l1.addRoom(r1);
		l1.addRoom(r2);
		l1.addRoom(r3);
		l1.addRoom(r4);
		System.out.println(l1.showLevel());
		
	}

}
