package Pratice_Programs;

import java.util.ArrayList;

public class P81_AL_sort_CustomOBJ {

	private String customProperty;

	public P81_AL_sort_CustomOBJ(String prop) {
		this.customProperty = prop;
	}

	public String getCustomProperty() {
		return this.customProperty;
	}

	public static void main(String[] args) {

		ArrayList<P81_AL_sort_CustomOBJ> list = new ArrayList<>();
		list.add(new P81_AL_sort_CustomOBJ("x"));
		list.add(new P81_AL_sort_CustomOBJ("A"));
		list.add(new P81_AL_sort_CustomOBJ("g"));
		list.add(new P81_AL_sort_CustomOBJ("h"));
		list.add(new P81_AL_sort_CustomOBJ("l"));

		list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

		for (P81_AL_sort_CustomOBJ obj : list) {
			System.out.println(obj.getCustomProperty());
		}
	}
}
