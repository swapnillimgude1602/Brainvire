package Pratice_Programs;

public class P124_ClearStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append(12);
		sb.append(12);
		sb.append(12);
		sb.append(12);
		System.out.println("before"+sb);
		sb.delete(0, sb.length());
		System.out.println("After:"+sb);
	}

}
