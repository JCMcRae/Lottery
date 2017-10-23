package com.cystech.lottery;

import java.util.Vector;

public class Lottery {

	static Vector<String> contestants = new Vector<String>();
	
	public void add(String name){
		contestants.add(name);
	}
	
	public int size(){
		return contestants.size();
	}
	
	public String choose(){
		String winner;
		int num = ((int) Math.floor(Math.random() * contestants.size()));
		
		winner = contestants.get(num);
		return winner;
	}
}
