package nsk.tfoms.survay.pojo;

import java.util.ArrayList;
import java.util.List;


public class ParamTwoPart {
	
	
	private String datebeginslcbreport;

	private String dateendslcbreport;
	private List<String> org;
	private List<String> ans;
	private List<String> ansAaS;
	
	
	public String getDatebeginslcbreport() {
		return datebeginslcbreport;
	}
	public void setDatebeginslcbreport(String datebeginslcbreport) {
		this.datebeginslcbreport = datebeginslcbreport;
	}
	public String getDateendslcbreport() {
		return dateendslcbreport;
	}
	public void setDateendslcbreport(String dateendslcbreport) {
		this.dateendslcbreport = dateendslcbreport;
	}
	public List<String> getOrg() {
		return org;
	}
	public void setOrg(List<String> org) {
		this.org = org;
	}
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	public List<String> getAnsAaS() {
		return ansAaS;
	}
	public void setAnsAaS(List<String> ansAaS) {
		this.ansAaS = ansAaS;
	}
	@Override
	public String toString() {
		return "ParamTwoPart [datebeginslcbreport=" + datebeginslcbreport + ", dateendslcbreport=" + dateendslcbreport
				+ ", org=" + org + ", ans=" + ans + ", ansAaS=" + ansAaS + "]";
	}
		
	
	
		
	
}
