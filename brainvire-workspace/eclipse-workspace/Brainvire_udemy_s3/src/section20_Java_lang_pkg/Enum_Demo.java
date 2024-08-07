package section20_Java_lang_pkg;

enum Dept{
	CS,
	IT,
	MECH,
	AUTOMOBILE
}
public class Enum_Demo {

	public static void main(String[] args) {
		
		Dept d = Dept.AUTOMOBILE;
		System.out.println("Name "+d.name());
		System.out.println("Ordinal "+d.ordinal());
		System.out.println("Value "+Dept.valueOf("IT"));
		
		Dept list[]=Dept.values();
		for(Dept x: list)
		{
			System.out.println(x);
		}
 		System.out.println("");
	}

}
