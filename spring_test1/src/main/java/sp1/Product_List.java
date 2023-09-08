package sp1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Product_List {
	Connection conn;
	PreparedStatement ps;

	public Product_List() {
		try {
			conn = DBConfig.dbinfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<ArrayList<String>> productlist() {
		List<ArrayList<String>> product2 = new ArrayList<>();
		try {
			String sql = "select * from product order by pidx desc";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			DTO_product pd = new DTO_product(); // DTO setter, getter 로 배열생성
			while (rs.next()) {
				pd.setPidx(rs.getString("pidx"));
				pd.setPcode(rs.getString("pcode"));
				pd.setPname(rs.getString("pname"));
				pd.setPmoney(rs.getString("pmoney"));
				pd.setPimage(rs.getString("pimage"));
				pd.setPsale(rs.getString("psale"));
				pd.setPuse(rs.getString("puse"));
				product2.add(pd.db_data());
			}
			conn.close();
			rs.close();
			ps.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return product2;
	}
}
