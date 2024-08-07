package com.example.game.springframework.game;

import org.springframework.stereotype.Component;

public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("down");
	}
	
	public void left() {
		System.out.println("left");
	}
	
	public void right() {
		System.out.println("right");
	}

}
