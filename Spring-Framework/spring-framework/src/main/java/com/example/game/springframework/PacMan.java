package com.example.game.springframework;

import com.example.game.springframework.game.GamingConsole;

public class PacMan implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Pacman up");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Pacman down");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Pacman left");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Pacman right");

	}

}
