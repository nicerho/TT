package sp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Link2 {
	public static void main(String[] args) {
		List<ArrayList<String>> list = new ArrayList<>();
		list.add(new ArrayList<String>(Arrays.asList("A조","김경민","배유미","김승균")));
		list.add(new ArrayList<String>(Arrays.asList("B조","이철의","장진호","홍사라")));
		list.add(new ArrayList<String>(Arrays.asList("C조","박병준","전정호","이경선")));
		list.add(new ArrayList<String>(Arrays.asList("D조","최현제","서강인","염무원")));
		System.out.println(list);
	}
}
