package Pratice_Programs;

class clas1 {

}

class clas2 {

}

public class P116_Class_Determine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clas1 obj1 = new clas1();
		clas2 obj2 = new clas2(); 
		System.out.println(obj1.getClass()); // class determine
		if (obj2 instanceof clas2) {		// instanceof operator
			System.out.println("obj2 is an object of the class2");
		} else {
			System.out.println("obj2 is not an object of the class2");
		}

	}

}
