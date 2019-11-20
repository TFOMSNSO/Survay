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
@Table(name="SURVAY_CLINIC_SEC_25")
@NamedQuery(name="SurvayClinicSec25.findAll", query="SELECT s FROM SurvayClinicSec25 s")
public class SurvayClinicSec25 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private Integer idSurvayClinicSec25;
	private SurvayClinicSecondlevel survayClinicSecondlevel;
	@Column(name="question25_1",length=50)
	private String question25_1_clinic;
	@Column(name="question25_2",length=50)
	private String question25_2_clinic;
	@Column(name="question25_3",length=50)
	private String question25_3_clinic;
	@Column(name="question25_4",length=50)
	private String question25_4_clinic;
	@Column(name="question25_5",length=50)
	private String question25_5_clinic;
	@Column(name="question25_6",length=50)
	private String question25_6_clinic;
	@Column(name="question25_7",length=50)
	private String question25_7_clinic;
	@Column(name="question25_8",length=50)
	private String question25_8_clinic;
	@Column(name="question25_9",length=50)
	private String question25_9_clinic;
	@Column(name="question25_10",length=50)
	private String question25_10_clinic;
	@Column(name="question25_11",length=50)
	private String question25_11_clinic;

	public SurvayClinicSec25() {
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
	@Column(name="ID_SURVAY_CLINIC_SEC_25")
	public Integer getIdSurvayClinicSec25() {
		return idSurvayClinicSec25;
	}

	public void setIdSurvayClinicSec25(Integer idSurvayClinicSec25) {
		this.idSurvayClinicSec25 = idSurvayClinicSec25;
	}



	public String getQuestion25_1_clinic() {
		return question25_1_clinic;
	}



	public void setQuestion25_1_clinic(String question25_1_clinic) {
		this.question25_1_clinic = question25_1_clinic;
	}



	public String getQuestion25_2_clinic() {
		return question25_2_clinic;
	}



	public void setQuestion25_2_clinic(String question25_2_clinic) {
		this.question25_2_clinic = question25_2_clinic;
	}



	public String getQuestion25_3_clinic() {
		return question25_3_clinic;
	}



	public void setQuestion25_3_clinic(String question25_3_clinic) {
		this.question25_3_clinic = question25_3_clinic;
	}



	public String getQuestion25_4_clinic() {
		return question25_4_clinic;
	}



	public void setQuestion25_4_clinic(String question25_4_clinic) {
		this.question25_4_clinic = question25_4_clinic;
	}



	public String getQuestion25_5_clinic() {
		return question25_5_clinic;
	}



	public void setQuestion25_5_clinic(String question25_5_clinic) {
		this.question25_5_clinic = question25_5_clinic;
	}



	public String getQuestion25_6_clinic() {
		return question25_6_clinic;
	}



	public void setQuestion25_6_clinic(String question25_6_clinic) {
		this.question25_6_clinic = question25_6_clinic;
	}



	public String getQuestion25_7_clinic() {
		return question25_7_clinic;
	}



	public void setQuestion25_7_clinic(String question25_7_clinic) {
		this.question25_7_clinic = question25_7_clinic;
	}



	public String getQuestion25_8_clinic() {
		return question25_8_clinic;
	}



	public void setQuestion25_8_clinic(String question25_8_clinic) {
		this.question25_8_clinic = question25_8_clinic;
	}



	public String getQuestion25_9_clinic() {
		return question25_9_clinic;
	}



	public void setQuestion25_9_clinic(String question25_9_clinic) {
		this.question25_9_clinic = question25_9_clinic;
	}



	public String getQuestion25_10_clinic() {
		return question25_10_clinic;
	}



	public void setQuestion25_10_clinic(String question25_10_clinic) {
		this.question25_10_clinic = question25_10_clinic;
	}



	public String getQuestion25_11_clinic() {
		return question25_11_clinic;
	}



	public void setQuestion25_11_clinic(String question25_11_clinic) {
		this.question25_11_clinic = question25_11_clinic;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SurvayClinicSec25 [idSurvayClinicSec25=");
		builder.append(idSurvayClinicSec25);
		//builder.append(", survayClinicSecondlevel=");
		//builder.append(survayClinicSecondlevel);
		builder.append(", question25_1_clinic=");
		builder.append(question25_1_clinic);
		builder.append(", question25_2_clinic=");
		builder.append(question25_2_clinic);
		builder.append(", question25_3_clinic=");
		builder.append(question25_3_clinic);
		builder.append(", question25_4_clinic=");
		builder.append(question25_4_clinic);
		builder.append(", question25_5_clinic=");
		builder.append(question25_5_clinic);
		builder.append(", question25_6_clinic=");
		builder.append(question25_6_clinic);
		builder.append(", question25_7_clinic=");
		builder.append(question25_7_clinic);
		builder.append(", question25_8_clinic=");
		builder.append(question25_8_clinic);
		builder.append(", question25_9_clinic=");
		builder.append(question25_9_clinic);
		builder.append(", question25_10_clinic=");
		builder.append(question25_10_clinic);
		builder.append(", question25_11_clinic=");
		builder.append(question25_11_clinic);
		builder.append("]");
		return builder.toString();
	}




}