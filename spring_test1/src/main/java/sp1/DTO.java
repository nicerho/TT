package sp1;

import java.util.ArrayList;
import java.util.List;

//DTO(setter,getter)
//setter,getter getter를 통해 1차원 배열로 데이터 삽입
public class DTO {
	private String userid = "";
	private String mail = "";

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	public List<String> dataBase(){
		List<String> list = new ArrayList<>();
		list.add(getUserid());
		list.add(getMail());
		return list;
	}
}
