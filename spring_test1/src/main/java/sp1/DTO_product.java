package sp1;

import java.util.ArrayList;

public class DTO_product {
private String pidx;
private String pcode;
private String pname;
private String pmoney;
private String pimage;
private String psale;
private String puse;
public String getPidx() {
	return pidx;
}
public void setPidx(String pidx) {
	this.pidx = pidx;
}
public String getPcode() {
	return pcode;
}
public void setPcode(String pcode) {
	this.pcode = pcode;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPmoney() {
	return pmoney;
}
public void setPmoney(String pmoney) {
	this.pmoney = pmoney;
}
public String getPimage() {
	return pimage;
}
public void setPimage(String pimage) {
	this.pimage = pimage;
}
public String getPsale() {
	return psale;
}
public void setPsale(String psale) {
	this.psale = psale;
}
public String getPuse() {
	return puse;
}
public void setPuse(String puse) {
	this.puse = puse;
}
public ArrayList<String> db_data(){
	ArrayList<String> list = new ArrayList<>();
	list.add(getPidx()); // autoincrement
	list.add(getPcode()); // id 
	list.add(getPname()); // mail
	list.add(getPmoney());// tel
	list.add(getPimage());
	list.add(getPsale());// age
	list.add(getPuse()); // date
	return list;
}
}
