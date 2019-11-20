package nsk.tfoms.survay.pojo;

import nsk.tfoms.survay.entity.secondlevel.Clinic.QuestionManyClinic;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSec1;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSec2;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSec25;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSecondlevel;

public class Sender {
	
	private SurvayClinicSecondlevel survay1;
	private SurvayClinicSec1 survay2;
	private SurvayClinicSec2 survay3;
	private SurvayClinicSec25 survay4;
	//private QuestionManyClinic survay5;
	private WrapMany survay5;
	
	public SurvayClinicSecondlevel getSurvay1() {
		return survay1;
	}
	public void setSurvay1(SurvayClinicSecondlevel survay1) {
		this.survay1 = survay1;
	}
	public SurvayClinicSec1 getSurvay2() {
		return survay2;
	}
	public void setSurvay2(SurvayClinicSec1 survay2) {
		this.survay2 = survay2;
	}
	public SurvayClinicSec2 getSurvay3() {
		return survay3;
	}
	public void setSurvay3(SurvayClinicSec2 survay3) {
		this.survay3 = survay3;
	}
	public SurvayClinicSec25 getSurvay4() {
		return survay4;
	}
	public void setSurvay4(SurvayClinicSec25 survay4) {
		this.survay4 = survay4;
	}
	/*
	public QuestionManyClinic getSurvay5() {
		return survay5;
	}
	public void setSurvay5(QuestionManyClinic survay5) {
		this.survay5 = survay5;
	}
	*/
	
	
	
	public WrapMany getSurvay5() {
		return survay5;
	}
	public void setSurvay5(WrapMany survay5) {
		this.survay5 = survay5;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sender [survay1=");
		builder.append(survay1);
		builder.append(", survay2=");
		builder.append(survay2);
		builder.append(", survay3=");
		builder.append(survay3);
		builder.append(", survay4=");
		builder.append(survay4);
		builder.append(", survay5=");
		builder.append(survay5);
		builder.append("]");
		return builder.toString();
	}
	
	

}
