package section8_PredefinedFunction_Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
class Movie{
	String movieName;
	String Actor;
	String Actress;
	public Movie(String movieName, String actor, String actress) {
		
		this.movieName = movieName;
		this.Actor = actor;
		this.Actress = actress;
	}
	
}

public class Display_Movieinfo {
	
	public static void populateDetails(ArrayList<Movie> list) {

		list.add(new Movie("Dabang1","Salman Khan","Sonal kapur"));
		list.add(new Movie("Dabang2","Salman Khan","Sonal kapur"));
		list.add(new Movie("Dabang3","Salman Khan","Sonal kapur"));
		list.add(new Movie("Dabang4","Salman Khan","Sonal kapur"));
		list.add(new Movie("Dabang5","Salman Khan","Sonal kapur"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie> al = new ArrayList<Movie>();
		populateDetails(al);
		
		Consumer<Movie> c = m -> {
			System.out.println("Movie name: "+m.movieName);
			System.out.println("Movie Actor: "+m.Actor);
			System.out.println("Movie Actress: "+m.Actress);
		};

		for(Movie m : al)
		{
			c.accept(m);
			System.out.println();
		}
	}

}