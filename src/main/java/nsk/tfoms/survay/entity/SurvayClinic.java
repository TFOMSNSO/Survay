package nsk.tfoms.survay.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * The persistent class for the SURVAY_CLINIC database table.
 * 
 */
@Entity
@Table(name="SURVAY_CLINIC")
@NamedQuery(name="SurvayClinic.findAll", query="SELECT s FROM SurvayClinic s")
public class SurvayClinic implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String age;

	private String ambulance;

	@Column(name="CLINIC_DOCTOR")
	private String clinicDoctor;


	@Pattern(regexp = "(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}")
	@Column(name="DATA_INPUT")
	private String dataInput=new SimpleDateFormat("dd.MM.yyyy").format(new Date());

	@Pattern(regexp = "(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}")
	@Column(name="DATA_RESP")
	private String dataResp;

	@Column(name="DIAGNOSTIC_TESTS")
	private String diagnosticTests;

	private String equipment;

	@Column(name="FREE_HELP")
	private String freeHelp;
	
	@Column(name="MO")
	private String mo;
	
	@Id
	@GeneratedValue
	private BigDecimal id;

	@Column(name="LABORATORY_RESEARCH")
	private String laboratoryResearch;

	@Column(name="MEDICAL_SPECIALISTS")
	private String medicalSpecialists;

	private String polzovatel;

	@Column(name="QUALITY_AMBULANCE")
	private String qualityAmbulance;

	private String repairs;

	@Column(name="SEE_A_DOCTOR")
	private String seeADoctor;

	private String sex;

	private String therapist;

	@Column(name="WAITING_TIME")
	private String waitingTime;

	@Column(name="WAITING_TIME_2")
	private String waitingTime2;

	public SurvayClinic() {
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAmbulance() {
		return this.ambulance;
	}

	public void setAmbulance(String ambulance) {
		this.ambulance = ambulance;
	}

	public String getClinicDoctor() {
		return this.clinicDoctor;
	}

	public void setClinicDoctor(String clinicDoctor) {
		this.clinicDoctor = clinicDoctor;
	}

	public String getDataInput() {
		return this.dataInput;
	}

	public void setDataInput(String dataInput) {
		this.dataInput = dataInput;
	}

	public String getDataResp() {
		return this.dataResp;
	}

	public void setDataResp(String dataResp) {
		this.dataResp = dataResp;
	}

	public String getDiagnosticTests() {
		return this.diagnosticTests;
	}

	public void setDiagnosticTests(String diagnosticTests) {
		this.diagnosticTests = diagnosticTests;
	}

	public String getEquipment() {
		return this.equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getFreeHelp() {
		return this.freeHelp;
	}

	public void setFreeHelp(String freeHelp) {
		this.freeHelp = freeHelp;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getLaboratoryResearch() {
		return this.laboratoryResearch;
	}

	public void setLaboratoryResearch(String laboratoryResearch) {
		this.laboratoryResearch = laboratoryResearch;
	}

	public String getMedicalSpecialists() {
		return this.medicalSpecialists;
	}

	public void setMedicalSpecialists(String medicalSpecialists) {
		this.medicalSpecialists = medicalSpecialists;
	}

	public String getPolzovatel() {
		return this.polzovatel;
	}

	public void setPolzovatel(String polzovatel) {
		this.polzovatel = polzovatel;
	}

	public String getQualityAmbulance() {
		return this.qualityAmbulance;
	}

	public void setQualityAmbulance(String qualityAmbulance) {
		this.qualityAmbulance = qualityAmbulance;
	}

	public String getRepairs() {
		return this.repairs;
	}

	public void setRepairs(String repairs) {
		this.repairs = repairs;
	}

	public String getSeeADoctor() {
		return this.seeADoctor;
	}

	public void setSeeADoctor(String seeADoctor) {
		this.seeADoctor = seeADoctor;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTherapist() {
		return this.therapist;
	}

	public void setTherapist(String therapist) {
		this.therapist = therapist;
	}

	public String getWaitingTime() {
		return this.waitingTime;
	}

	public void setWaitingTime(String waitingTime) {
		this.waitingTime = waitingTime;
	}

	public String getWaitingTime2() {
		return this.waitingTime2;
	}

	public void setWaitingTime2(String waitingTime2) {
		this.waitingTime2 = waitingTime2;
	}

	public String getMo() {
		return mo;
	}

	public void setMo(String mo) {
		this.mo = mo;
	}
	
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SurvayClinic [age=");
		builder.append(age);
		builder.append(", ambulance=");
		builder.append(ambulance);
		builder.append(", clinicDoctor=");
		builder.append(clinicDoctor);
		builder.append(", dataInput=");
		builder.append(dataInput);
		builder.append(", dataResp=");
		builder.append(dataResp);
		builder.append(", diagnosticTests=");
		builder.append(diagnosticTests);
		builder.append(", equipment=");
		builder.append(equipment);
		builder.append(", freeHelp=");
		builder.append(freeHelp);
		builder.append(", mo=");
		builder.append(mo);
		builder.append(", id=");
		builder.append(id);
		builder.append(", laboratoryResearch=");
		builder.append(laboratoryResearch);
		builder.append(", medicalSpecialists=");
		builder.append(medicalSpecialists);
		builder.append(", polzovatel=");
		builder.append(polzovatel);
		builder.append(", qualityAmbulance=");
		builder.append(qualityAmbulance);
		builder.append(", repairs=");
		builder.append(repairs);
		builder.append(", seeADoctor=");
		builder.append(seeADoctor);
		builder.append(", sex=");
		builder.append(sex);
		builder.append(", therapist=");
		builder.append(therapist);
		builder.append(", waitingTime=");
		builder.append(waitingTime);
		builder.append(", waitingTime2=");
		builder.append(waitingTime2);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	/*
	 * Method considers counts of answers on certain mask  
	 */
	/* public int getCount()
		{
	    	int col = 0;
	    	
	    	if(getClinicDoctor().equals("Удовлетворен(а)") || getClinicDoctor().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getDiagnosticTests().equals("Удовлетворен(а)") || getDiagnosticTests().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getEquipment().equals("Удовлетворен(а)") || getEquipment().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getFreeHelp().equals("Удовлетворен(а)") || getFreeHelp().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getLaboratoryResearch().equals("Удовлетворен(а)") || getLaboratoryResearch().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getMedicalSpecialists().equals("Удовлетворен(а)") || getMedicalSpecialists().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getRepairs().equals("Удовлетворен(а)") || getRepairs().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getSeeADoctor().equals("Удовлетворен(а)") || getSeeADoctor().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getTherapist().equals("Удовлетворен(а)") || getTherapist().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getWaitingTime().equals("Удовлетворен(а)") || getWaitingTime().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	if(getWaitingTime2().equals("Удовлетворен(а)") || getWaitingTime2().equals("Скорее удовлетворен(а), чем не удовлетворен(а)")) col = col +1 ;
	    	
	    	return col;
		}
*/
}
