package com.langfundamentals.constructors;

public class CricketPlayer {
	int playerId;
	String playerName;
	String team;
	int matches;
	int runs;
	int centuries;
	CricketPlayer(){
		System.out.println("no arg constructor");
	}
	CricketPlayer(int playerId){
		System.out.println("one arg constructor");
		this.playerId=playerId;
		
	}
	CricketPlayer(CricketPlayer c,String playerName){
		System.out.println("two arg constructor");
		this.playerId=c.playerId;
		this.playerName=playerName;
	}
	CricketPlayer(CricketPlayer c,int matches){
		this.playerId=c.playerId;
		this.playerName=c.playerName;
		this.matches=matches;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		CricketPlayer c=new CricketPlayer();
		c.display();
		CricketPlayer c1=new CricketPlayer(18);
		c1.display();
		CricketPlayer c2=new CricketPlayer(c1,"viratkohli");
		c2.display();
		CricketPlayer c3=new CricketPlayer(c2,678);
		c3.display();
		System.out.println("main method ended");
	}
	void display() {
		System.out.println("Player id is:"+playerId);
		System.out.println("Player name is:"+playerName);
		System.out.println("Player team is:"+team);
		System.out.println("Player matches is:"+matches);
		System.out.println("Player runs is:"+runs);
		System.out.println("Player centuries is:"+centuries);
		System.out.println("---------------------------------------");
		return;
	}

}
