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
@Table(name="SURVAY_CLINIC_SEC_2")
@NamedQuery(name="SurvayClinicSec2.findAll", query="SELECT s FROM SurvayClinicSec2 s")
public class SurvayClinicSec2 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private Integer idSurvayClinicSec2;
	private SurvayClinicSecondlevel survayClinicSecondlevel;
	@Column(name="question12_clinic",length=100)
	private String question12_clinic;
	@Column(name="question22_clinic",length=100)
	private String question22_clinic;
	@Column(name="question20_1_clinic",length=100)
	private String question20_1_clinic;
	@Column(name="question20_2_clinic",length=100)
	private String question20_2_clinic;
	@Column(name="question20_3_clinic",length=100)
	private String question20_3_clinic;
	@Column(name="question20_4_clinic",length=100)
	private String question20_4_clinic;
	@Column(name="question20_5_clinic",length=100)
	private String question20_5_clinic;
	@Column(name="question20_6_clinic",length=100)
	private String question20_6_clinic;
	@Column(name="question20_7_clinic",length=100)
	private String question20_7_clinic;
	@Column(name="question20_8_clinic",length=100)
	private String question20_8_clinic;
	@Column(name="question20_9_clinic",length=100)
	private String question20_9_clinic;
	@Column(name="question20_10_clinic",length=100)
	private String question20_10_clinic;
	@Column(name="question20_11_clinic",length=100)
	private String question20_11_clinic;
	@Column(name="question20_12_clinic",length=100)
	private String question20_12_clinic;
	@Column(name="question20_13_clinic",length=100)
	private String question20_13_clinic;
	@Column(name="question20_14_clinic",length=100)
	private String question20_14_clinic;
	@Column(name="question20_15_clinic",length=100)
	private String question20_15_clinic;
	@Column(name="question20_16_clinic",length=100)
	private String question20_16_clinic;
	@Column(name="question20_17_clinic",length=100)
	private String question20_17_clinic;
	

	public SurvayClinicSec2() {
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
	@Column(name="ID_SURVAY_CLINIC_SEC_2")
	public Integer getIdSurvayClinicSec2() {
		return idSurvayClinicSec2;
	}

	public void setIdSurvayClinicSec2(Integer idSurvayClinicSec2) {
		this.idSurvayClinicSec2 = idSurvayClinicSec2;
	}



	public String getQuestion12_clinic() {
		return question12_clinic;
	}



	public void setQuestion12_clinic(String question12_clinic) {
		this.question12_clinic = question12_clinic;
	}



	public String getQuestion22_clinic() {
		return question22_clinic;
	}



	public void setQuestion22_clinic(String question22_clinic) {
		this.question22_clinic = question22_clinic;
	}



	public String getQuestion20_1_clinic() {
		return question20_1_clinic;
	}



	public void setQuestion20_1_clinic(String question20_1_clinic) {
		this.question20_1_clinic = question20_1_clinic;
	}



	public String getQuestion20_2_clinic() {
		return question20_2_clinic;
	}



	public void setQuestion20_2_clinic(String question20_2_clinic) {
		this.question20_2_clinic = question20_2_clinic;
	}



	public String getQuestion20_3_clinic() {
		return question20_3_clinic;
	}



	public void setQuestion20_3_clinic(String question20_3_clinic) {
		this.question20_3_clinic = question20_3_clinic;
	}



	public String getQuestion20_4_clinic() {
		return question20_4_clinic;
	}



	public void setQuestion20_4_clinic(String question20_4_clinic) {
		this.question20_4_clinic = question20_4_clinic;
	}



	public String getQuestion20_5_clinic() {
		return question20_5_clinic;
	}



	public void setQuestion20_5_clinic(String question20_5_clinic) {
		this.question20_5_clinic = question20_5_clinic;
	}



	public String getQuestion20_6_clinic() {
		return question20_6_clinic;
	}



	public void setQuestion20_6_clinic(String question20_6_clinic) {
		this.question20_6_clinic = question20_6_clinic;
	}



	public String getQuestion20_7_clinic() {
		return question20_7_clinic;
	}



	public void setQuestion20_7_clinic(String question20_7_clinic) {
		this.question20_7_clinic = question20_7_clinic;
	}



	public String getQuestion20_8_clinic() {
		return question20_8_clinic;
	}



	public void setQuestion20_8_clinic(String question20_8_clinic) {
		this.question20_8_clinic = question20_8_clinic;
	}



	public String getQuestion20_9_clinic() {
		return question20_9_clinic;
	}



	public void setQuestion20_9_clinic(String question20_9_clinic) {
		this.question20_9_clinic = question20_9_clinic;
	}



	public String getQuestion20_10_clinic() {
		return question20_10_clinic;
	}



	public void setQuestion20_10_clinic(String question20_10_clinic) {
		this.question20_10_clinic = question20_10_clinic;
	}



	public String getQuestion20_11_clinic() {
		return question20_11_clinic;
	}



	public void setQuestion20_11_clinic(String question20_11_clinic) {
		this.question20_11_clinic = question20_11_clinic;
	}



	public String getQuestion20_12_clinic() {
		return question20_12_clinic;
	}



	public void setQuestion20_12_clinic(String question20_12_clinic) {
		this.question20_12_clinic = question20_12_clinic;
	}



	public String getQuestion20_13_clinic() {
		return question20_13_clinic;
	}



	public void setQuestion20_13_clinic(String question20_13_clinic) {
		this.question20_13_clinic = question20_13_clinic;
	}



	public String getQuestion20_14_clinic() {
		return question20_14_clinic;
	}



	public void setQuestion20_14_clinic(String question20_14_clinic) {
		this.question20_14_clinic = question20_14_clinic;
	}



	public String getQuestion20_15_clinic() {
		return question20_15_clinic;
	}



	public void setQuestion20_15_clinic(String question20_15_clinic) {
		this.question20_15_clinic = question20_15_clinic;
	}



	public String getQuestion20_16_clinic() {
		return question20_16_clinic;
	}



	public void setQuestion20_16_clinic(String question20_16_clinic) {
		this.question20_16_clinic = question20_16_clinic;
	}



	public String getQuestion20_17_clinic() {
		return question20_17_clinic;
	}



	public void setQuestion20_17_clinic(String question20_17_clinic) {
		this.question20_17_clinic = question20_17_clinic;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SurvayClinicSec2 [idSurvayClinicSec2=");
		builder.append(idSurvayClinicSec2);
		//builder.append(", survayClinicSecondlevel=");
		//builder.append(survayClinicSecondlevel);
		builder.append(", question12_clinic=");
		builder.append(question12_clinic);
		builder.append(", question22_clinic=");
		builder.append(question22_clinic);
		builder.append(", question20_1_clinic=");
		builder.append(question20_1_clinic);
		builder.append(", question20_2_clinic=");
		builder.append(question20_2_clinic);
		builder.append(", question20_3_clinic=");
		builder.append(question20_3_clinic);
		builder.append(", question20_4_clinic=");
		builder.append(question20_4_clinic);
		builder.append(", question20_5_clinic=");
		builder.append(question20_5_clinic);
		builder.append(", question20_6_clinic=");
		builder.append(question20_6_clinic);
		builder.append(", question20_7_clinic=");
		builder.append(question20_7_clinic);
		builder.append(", question20_8_clinic=");
		builder.append(question20_8_clinic);
		builder.append(", question20_9_clinic=");
		builder.append(question20_9_clinic);
		builder.append(", question20_10_clinic=");
		builder.append(question20_10_clinic);
		builder.append(", question20_11_clinic=");
		builder.append(question20_11_clinic);
		builder.append(", question20_12_clinic=");
		builder.append(question20_12_clinic);
		builder.append(", question20_13_clinic=");
		builder.append(question20_13_clinic);
		builder.append(", question20_14_clinic=");
		builder.append(question20_14_clinic);
		builder.append(", question20_15_clinic=");
		builder.append(question20_15_clinic);
		builder.append(", question20_16_clinic=");
		builder.append(question20_16_clinic);
		builder.append(", question20_17_clinic=");
		builder.append(question20_17_clinic);
		builder.append("]");
		return builder.toString();
	}

	

}