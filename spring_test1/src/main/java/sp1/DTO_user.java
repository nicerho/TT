package sp1;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DTO_user {
	String mno, mid, mpass, memail, mtel, marea, minter, mage, mdate;

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpass() {
		return mpass;
	}

	public void setMpass(String mpass) {
		this.mpass = mpass;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMtel() {
		return mtel;
	}

	public void setMtel(String mtel) {
		this.mtel = mtel;
	}

	public String getMarea() {
		return marea;
	}

	public void setMarea(String marea) {
		this.marea = marea;
	}

	public String getMinter() {
		return minter;
	}

	public void setMinter(String minter) {
		this.minter = minter;
	}

	public String getMage() {
		return mage;
	}

	public void setMage(String mage) {
		this.mage = mage;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	//DB 자료로 1차원 컬렉션 생성
	public ArrayList<String> db_data(){
		ArrayList<String> list = new ArrayList<>();
		list.add(getMno()); //
		list.add(getMid()); // i
		list.add(getMemail()); // ma
		list.add(getMtel());// tel
		list.add(getMage());// age
		list.add(getMdate()); // date
		return list;
	}
}
