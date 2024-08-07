package section20_Java_lang_pkg;

enum School
{
	DIV_A("1","SWAPNIL"),
	DIV_B("2","SAHIL"),
	DIV_C("3","SUSHIL"),
	DIV_D("4","SAMEER");

	String rollno,name;
	private School(String roll, String name) {
		// TODO Auto-generated constructor stub
		this.rollno=roll;
		this.name=name;
	}	
	
	public void disp()
	{
		System.out.println("Roll no: "+rollno+"Name: "+name);
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Enum_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s1 = School.DIV_A;
		School s2 = School.DIV_B;
		School s3 = School.DIV_C;
		School s4 = School.DIV_D	;
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());

	}

}
