package nsk.tfoms.survay.entity.secondlevel.Clinic;

import java.io.Serializable;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * The persistent class for the SURVAY_CLINIC_SEC_1 database table.
 * 
 */
@Entity
@Table(name="SURVAY_CLINIC_SEC_1")
@NamedQuery(name="SurvayClinicSec1.findAll", query="SELECT s FROM SurvayClinicSec1 s")
public class SurvayClinicSec1 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private Integer idSurvayClinicSec1;
	
	private String replacementClinicSecondlevel;
	
	@Column(name="question4_donotattach_clinic",length=30)
	private String question4;
	
	@Column(name="question7_reference information_clinic",length=30)
	private String question7;
	
	@Column(name="question8_1_sectortherapevt_clinic",length=30)
	private String question8_1;
	
	@Column(name="question8_2_doctor_clinic",length=30)
	private String question8_2;
	
	@Column(name="question10_problemdoctor_clinic",length=150)
	private String question10;
	
	@Column(name="question13_problemwithroute_clinic",length=150)
	private String question13;
	
	@Column(name="question14_preventiondoctor_clinic",length=150)
	private String question14;
	
	@Column(name="question15_clinical examination_clinic",length=150)
	private String question15;
	
	@Column(name="question18_my opinion_clinic",length=30)
	private String question18;
	
	@Column(name="question21_ambulance_clinic",length=30)
	private String question21;
	
	@Column(name="question23_my rights_clinic",length=50)
	private String question23;

	private SurvayClinicSecondlevel survayClinicSecondlevel;

	public SurvayClinicSec1() {
	}

	
	@Column(name="REPLACEMENT_CLINIC_SECONDLEVEL",length=30)
	public String getReplacementClinicSecondlevel() {
		return this.replacementClinicSecondlevel;
	}

	public void setReplacementClinicSecondlevel(String replacementClinicSecondlevel) {
		this.replacementClinicSecondlevel = replacementClinicSecondlevel;
	}


	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@JsonIgnore
	public SurvayClinicSecondlevel getSurvayClinicSecondlevel() {
		return this.survayClinicSecondlevel;
	}

	public void setSurvayClinicSecondlevel(SurvayClinicSecondlevel survayClinicSecondlevel) {
		this.survayClinicSecondlevel = survayClinicSecondlevel;
	}



	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "survayClinicSecondlevel"))
	@Id
	@GeneratedValue(generator = "gen")
	@Column(name="ID_SURVAY_CLINIC_SEC_1")
	public Integer getIdSurvayClinicSec1() {
		return idSurvayClinicSec1;
	}



	public void setIdSurvayClinicSec1(Integer idSurvayClinicSec1) {
		this.idSurvayClinicSec1 = idSurvayClinicSec1;
	}



	public String getQuestion4() {
		return question4;
	}



	public void setQuestion4(String question4) {
		this.question4 = question4;
	}


	public String getQuestion7() {
		return question7;
	}


	public void setQuestion7(String question7) {
		this.question7 = question7;
	}


	public String getQuestion8_1() {
		return question8_1;
	}


	public void setQuestion8_1(String question8_1) {
		this.question8_1 = question8_1;
	}


	public String getQuestion8_2() {
		return question8_2;
	}


	public void setQuestion8_2(String question8_2) {
		this.question8_2 = question8_2;
	}


	public String getQuestion10() {
		return question10;
	}


	public void setQuestion10(String question10) {
		this.question10 = question10;
	}


	public String getQuestion13() {
		return question13;
	}


	public void setQuestion13(String question13) {
		this.question13 = question13;
	}


	public String getQuestion14() {
		return question14;
	}


	public void setQuestion14(String question14) {
		this.question14 = question14;
	}


	public String getQuestion15() {
		return question15;
	}


	public void setQuestion15(String question15) {
		this.question15 = question15;
	}


	public String getQuestion18() {
		return question18;
	}


	public void setQuestion18(String question18) {
		this.question18 = question18;
	}


	public String getQuestion21() {
		return question21;
	}


	public void setQuestion21(String question21) {
		this.question21 = question21;
	}


	public String getQuestion23() {
		return question23;
	}


	public void setQuestion23(String question23) {
		this.question23 = question23;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SurvayClinicSec1 [idSurvayClinicSec1=");
		builder.append(idSurvayClinicSec1);
		builder.append(", replacementClinicSecondlevel=");
		builder.append(replacementClinicSecondlevel);
		builder.append(", question4=");
		builder.append(question4);
		builder.append(", question7=");
		builder.append(question7);
		builder.append(", question8_1=");
		builder.append(question8_1);
		builder.append(", question8_2=");
		builder.append(question8_2);
		builder.append(", question10=");
		builder.append(question10);
		builder.append(", question13=");
		builder.append(question13);
		builder.append(", question14=");
		builder.append(question14);
		builder.append(", question15=");
		builder.append(question15);
		builder.append(", question18=");
		builder.append(question18);
		builder.append(", question21=");
		builder.append(question21);
		builder.append(", question23=");
		builder.append(question23);
		//builder.append(", survayClinicSecondlevel=");
		//builder.append(survayClinicSecondlevel);
		builder.append("]");
		return builder.toString();
	}

}