package sp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Link1 {
	public static void main(String[] args) {
		new db().abc();
	}
}

class db {
	public void abc() {
		String member[][] = { { "ㅎㄱㄷ", "슼", "45" }, { "ㅇㅅㅅ", "ㅇㅈ", "45" }, { "ㄱㄱㅊ", "킅", "22" }};
		List<String[]> list = new ArrayList<>(Arrays.asList(member));
		for(int x=0;x<list.size();x++) {
			System.out.println(list.get(x)[0]);
		}
		List<Integer[]> al = new ArrayList<>();
		List<ArrayList<Integer>> al2 = new ArrayList<>();
		Integer a[] = {1,2,3,4};
		al.add(a);
		List<Integer> tlist = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		al2.add((ArrayList<Integer>) tlist);
		ArrayList<Integer>[] al3 = new ArrayList[100];
		al3[0]=new ArrayList<>();
		al3[0].add(1);
		System.out.println(al3[0]);
		System.out.println(al3[0].get(0));
		
		
	}
}