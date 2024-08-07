package com.example.game.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.game.springframework.game.GameRunner;


@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
		
		
	//	SuperContraGame game = new SuperContraGame();
		//MarioGame game = new MarioGame();	//tightly coupled
		//PacMan game = new PacMan();
		
		//GameRunner runner1 = new GameRunner(game);
		//runner.run();
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
