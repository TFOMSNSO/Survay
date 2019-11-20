package nsk.tfoms.survay.pojo;

import java.util.ArrayList;
import java.util.List;


public class ParamOnePart {
	
	
	private String datestart;
	private String dateend;
	
	private String lpu;
	
	private String onefoms;
	private String onesimaz;
	private String oneingos;
	private String onerosno;
	
	private String ans1;
	private String ans2;
	private String ans3;
	private String ans4;
	private String ans5;
	
	private String plus_twolevel;
	private String plus_onlytwolevel;
	private String kids;
	private String adult;
	
	private List<String> mas;
	
	
	public String getKids() {
		return kids;
	}
	public String getAdult() {
		return adult;
	}
	public String getOnefoms() {
		return onefoms;
	}
	public void setOnefoms(String onefoms) {
		this.onefoms = onefoms;
	}
	public String getOnesimaz() {
		return onesimaz;
	}
	public void setOnesimaz(String onesimaz) {
		this.onesimaz = onesimaz;
	}
	public String getOneingos() {
		return oneingos;
	}
	public void setOneingos(String oneingos) {
		this.oneingos = oneingos;
	}
	public String getOnerosno() {
		return onerosno;
	}
	
	public String getDatestart() {
		return datestart;
	}
	public void setDatestart(String datestart) {
		this.datestart = datestart;
	}
	public String getDateend() {
		return dateend;
	}
	public void setDateend(String dateend) {
		this.dateend = dateend;
	}
	public void setOnerosno(String onerosno) {
		this.onerosno = onerosno;
	}
	
	public String getLpu() {
		return lpu;
	}
	public void setLpu(String lpu) {
		this.lpu = lpu;
	}
	public String getAns1() {
		return ans1;
	}
	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}
	public String getAns2() {
		return ans2;
	}
	
	public String setKids(String kids) {
		return this.kids = kids;
	}
	public String setAdult(String adult) {
		return this.adult = adult;
	}
	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}
	public String getAns3() {
		return ans3;
	}
	public void setAns3(String ans3) {
		this.ans3 = ans3;
	}
	public String getAns4() {
		return ans4;
	}
	public void setAns4(String ans4) {
		this.ans4 = ans4;
	}
	public String getAns5() {
		return ans5;
	}
	public void setAns5(String ans5) {
		this.ans5 = ans5;
	}
	
	public List<String> getMas() {
		mas = new ArrayList<String>();
		if(getAns1().equals("true")){mas.add("Удовлетворен(а)");}
		if(getAns2().equals("true")){mas.add("Скорее удовлетворен(а), чем не удовлетворен(а)");}
		if(getAns3().equals("true")){mas.add("Скорее не удовлетворен(а), чем удовлетворен(а)");}
		if(getAns4().equals("true")){mas.add("Не удовлетворен(а)");}
		if(getAns5().equals("true")){mas.add("Затрудняюсь ответить");}
		return mas;
	}
	public void setMas(List<String> mas) {
		this.mas = mas;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParamOnePart [datestart=");
		builder.append(datestart);
		builder.append(", dateend=");
		builder.append(dateend);
		builder.append(", lpu=");
		builder.append(lpu);
		builder.append(", onefoms=");
		builder.append(onefoms);
		builder.append(", onesimaz=");
		builder.append(onesimaz);
		builder.append(", oneingos=");
		builder.append(oneingos);
		builder.append(", onerosno=");
		builder.append(onerosno);
		builder.append(", ans1=");
		builder.append(ans1);
		builder.append(", ans2=");
		builder.append(ans2);
		builder.append(", ans3=");
		builder.append(ans3);
		builder.append(", ans4=");
		builder.append(ans4);
		builder.append(", ans5=");
		builder.append(ans5);
		builder.append(", mas=");
		builder.append(mas);
		builder.append("]");
		return builder.toString();
	}
	public String getPlus_twolevel() {
		return plus_twolevel;
	}
	public void setPlus_twolevel(String plus_twolevel) {
		this.plus_twolevel = plus_twolevel;
	}
	
	public String getPlus_onlytwolevel() {
		return plus_onlytwolevel;
	}
	public void setPlus_onlytwolevel(String plus_onlytwolevel) {
		this.plus_onlytwolevel = plus_onlytwolevel;
	}
}
