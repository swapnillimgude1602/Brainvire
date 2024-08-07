package section8_PredefinedFunction_Consumer;

import java.util.function.Consumer;

class Movie1{
	String movieName;
	String Actor;
	String Actress;
	String Result;
	public Movie1(String movieName, String actor, String actress, String Result) {
		
		this.movieName = movieName;
		this.Actor = actor;
		this.Actress = actress;
		this.Result=Result;
	}
	
}
public class Consumer_chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Movie1> c1 = m -> System.out.println("Movie:" + m.movieName + " is ready to release");
		Consumer<Movie1> c2 = m -> System.out.println("Movie:" + m.movieName + " is Just Released and " + m.Result);
		Consumer<Movie1> c3 = m -> System.out.println("Movie:" + m.movieName + " iinformation storing into database");
		
		Consumer<Movie1> chaining = c1.andThen(c2).andThen(c3);
		Movie1 m1 = new Movie1("Jawan", "SRk", "Dipika", "Hit");
		Movie1 m2 = new Movie1("Jailer", "Rajnikant", "Mrunal", "Flop");

		chaining.accept(m1);
		System.out.println();
		chaining.accept(m2);



	}

}
