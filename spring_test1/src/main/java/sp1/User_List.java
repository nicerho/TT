package sp1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class User_List {
	Connection conn;
	PreparedStatement ps;

	public User_List() {
		try {
			conn = DBConfig.dbinfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 1. 검색어 입력시 db의 값과 동일할 경우 2. 검색어 입력시 db의 값과 동일한 내용 없을 경우
	 */
	public List<ArrayList<String>> listData() {
		List<ArrayList<String>> member2 = new ArrayList<>();
		try {
			String sql = "select * from member2 order by mno desc";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			DTO_user du = new DTO_user(); // DTO setter, getter 로 배열생성
			while (rs.next()) {
				du.setMno(rs.getString("mno"));
				du.setMid(rs.getString("mid"));
				du.setMpass(rs.getString("mpass"));
				du.setMemail(rs.getString("memail"));
				du.setMtel(rs.getString("mtel"));
				du.setMarea(rs.getString("marea"));
				du.setMinter(rs.getString("minter"));
				du.setMage(rs.getString("mage"));
				du.setMdate(rs.getString("mdate"));
				member2.add(du.db_data());
			}
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return member2;
	}

	public int total_member() throws Exception {
		String sql2 = "";
		// 전체 가입자 수 카운팅
		sql2 = "select count(*) as cnt from member2 ";
		ps = conn.prepareStatement(sql2);
		ResultSet rs2 = ps.executeQuery();
		rs2.next();
		int total = Integer.parseInt(rs2.getString("cnt"));
		return total;
	}

	// 검색어가 있을 경우의 메서드 위는 없을경우
	public List<ArrayList<String>> listData(String a, String b) {
		List<ArrayList<String>> member2 = new ArrayList<>();
		String sql = "";

		try {

			if (b.equals("id")) { // id로 검색
				sql = "select * from member2 where mid=? order by mno desc";
				ps = conn.prepareStatement(sql);
				ps.setString(1, a);
			} else if (b.equals("tel")) { // 전번으로 검색
				sql = "select * from member2 where mtel like ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, "%" + a);
			}
			ResultSet rs = ps.executeQuery();
			DTO_user du = new DTO_user(); // DTO setter, getter 로 배열생성
			while (rs.next()) {
				du.setMno(rs.getString("mno"));
				du.setMid(rs.getString("mid"));
				du.setMpass(rs.getString("mpass"));
				du.setMemail(rs.getString("memail"));
				du.setMtel(rs.getString("mtel"));
				du.setMarea(rs.getString("marea"));
				du.setMinter(rs.getString("minter"));
				du.setMage(rs.getString("mage"));
				du.setMdate(rs.getString("mdate"));
				member2.add(du.db_data());
			}
			if (member2.size() == 0) {
				du.setMno("null");
				du.setMid("null");
				du.setMpass("null");
				du.setMemail("null");
				du.setMtel("null");
				du.setMarea("null");
				du.setMinter("null");
				du.setMage("null");
				du.setMdate("null");
				member2.add(du.db_data());
			}
			ps.close();
			rs.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return member2;
	}
}
