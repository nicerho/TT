package sp1;

import java.util.ArrayList;
import java.util.List;

//DAO
public class Array_Link3 {
	public static void main(String[] args) {
		new box().datacall();
		;
	}
}

class box {
	DTO dto = new DTO(); // getter setter

	// DB 연결 및 배열화 메서드
	public List<ArrayList<String>> list() {
		List<ArrayList<String>> list = new ArrayList<>();
		String data[][] = new String[][] { { "hong", "hong@nate.com" }, { "lee", "lee@asd.com" } };
		int x = 0;

		// 반복문으로 값 이관
		while (x < data.length) {
			dto.setUserid(data[x][0]);
			dto.setMail(data[x][1]);
			// dto에 1차원 배열 메서드 호출 2차원 배열로삽입
			list.add((ArrayList<String>) dto.dataBase());
			x++;
		}
		return list; // 2차원 배열 반환
	}

	public void datacall() {
		List<ArrayList<String>> select = list();
		System.out.println(select);
	}
}