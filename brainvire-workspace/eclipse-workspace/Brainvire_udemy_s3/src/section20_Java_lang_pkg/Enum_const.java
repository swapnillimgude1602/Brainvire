package section20_Java_lang_pkg;

enum Dept1
{
	CS,
	IT,
	MECH,
	AUTOMOBILE
;
	private Dept1()	//invoke for every member
	{
		System.out.println(this.name()); 
	}
	
	public void Display()
	{
		System.out.println("name "+this.name()+" "+"Ordinal "+this.ordinal());
	}
}
public class Enum_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept1 d = Dept1.IT;	//It will call all the members enum 
		d.Display();
	}

}
