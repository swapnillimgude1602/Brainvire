package Pratice_Programs;

public class P61_Check_arr_givenValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1, 2, 3, 4, 5};
	    int searchEle = 3;
	    boolean found = false;

	    for (int n : num) {
	      if (n == searchEle) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(searchEle + " is found.");
	    else
	      System.out.println(searchEle + " is not found.");
	  }

	}
