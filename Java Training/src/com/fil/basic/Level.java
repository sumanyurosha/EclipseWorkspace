package com.fil.basic;

public class Level {
	private int levelno;
	Rooms[] rooms = new Rooms[20];
	private static int roomsCount = 0;
	
	Level(int levelno){
		this.levelno = levelno;
	}
	public void addRoom(Rooms r){
		rooms[roomsCount++] = r;
	}
	public Rooms[] showLevel(){
		return rooms;
	}

}
