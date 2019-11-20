package nsk.tfoms.survay.entity.secondlevel.Clinic;

import java.io.Serializable;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;


/**
 * The persistent class for the SURVAY_CLINIC_SEC_1 database table.
 * 
 */
@Entity
@Table(name="Question_many_clinic")
public class QuestionManyClinic implements Serializable {
	private static final long serialVersionUID = 1L;

	

	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="ID_question_many_clinic")
	private Integer idQuestionManyClinic;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SURVAY_CLINIC_SECONDLEVEL_ID", referencedColumnName="GENERAL_ID")
    @JsonIgnore
	private SurvayClinicSecondlevel survayClinicSecondlevel;
	
	@Column(name="question2_clinic",length=300)
	private String question2_clinic;
	
	@Column(name="question6_1_clinic",length=300)
	private String question6_1_clinic;
	
	@Column(name="question6_2_clinic",length=300)
	private String question6_2_clinic;
	
	@Column(name="question24_clinic",length=300)
	private String question24_clinic;
	
	@Column(name="question26_clinic",length=300)
	private String question26_clinic;
	
	@Column(name="question28_clinic",length=300)
	private String question28_clinic;
	
	@Column(name="question29_clinic",length=300)
	private String question29_clinic;
	
	@Column(name="question31_clinic",length=300)
	private String question31_clinic;
	
	@Column(name="question32_clinic",length=300)
	private String question32_clinic;
	
	

	public QuestionManyClinic() {
	}



	
	public SurvayClinicSecondlevel getSurvayClinicSecondlevel() {
		return this.survayClinicSecondlevel;
	}

	public void setSurvayClinicSecondlevel(SurvayClinicSecondlevel survayClinicSecondlevel) {
		this.survayClinicSecondlevel = survayClinicSecondlevel;
	}


	public Integer getIdQuestionManyClinic() {
		return idQuestionManyClinic;
	}



	public void setIdQuestionManyClinic(Integer idQuestionManyClinic) {
		this.idQuestionManyClinic = idQuestionManyClinic;
	}




	public String getQuestion2_clinic() {
		return question2_clinic;
	}




	public void setQuestion2_clinic(String question2_clinic) {
		this.question2_clinic = question2_clinic;
	}




	public String getQuestion24_clinic() {
		return question24_clinic;
	}




	public void setQuestion24_clinic(String question24_clinic) {
		this.question24_clinic = question24_clinic;
	}




	public String getQuestion26_clinic() {
		return question26_clinic;
	}




	public void setQuestion26_clinic(String question26_clinic) {
		this.question26_clinic = question26_clinic;
	}




	public String getQuestion28_clinic() {
		return question28_clinic;
	}




	public void setQuestion28_clinic(String question28_clinic) {
		this.question28_clinic = question28_clinic;
	}




	public String getQuestion29_clinic() {
		return question29_clinic;
	}




	public void setQuestion29_clinic(String question29_clinic) {
		this.question29_clinic = question29_clinic;
	}




	public String getQuestion31_clinic() {
		return question31_clinic;
	}




	public void setQuestion31_clinic(String question31_clinic) {
		this.question31_clinic = question31_clinic;
	}




	public String getQuestion32_clinic() {
		return question32_clinic;
	}




	public void setQuestion32_clinic(String question32_clinic) {
		this.question32_clinic = question32_clinic;
	}




	public String getQuestion6_1_clinic() {
		return question6_1_clinic;
	}




	public void setQuestion6_1_clinic(String question6_1_clinic) {
		this.question6_1_clinic = question6_1_clinic;
	}




	public String getQuestion6_2_clinic() {
		return question6_2_clinic;
	}




	public void setQuestion6_2_clinic(String question6_2_clinic) {
		this.question6_2_clinic = question6_2_clinic;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QuestionManyClinic [idQuestionManyClinic=");
		builder.append(idQuestionManyClinic);
		//builder.append(", survayClinicSecondlevel=");
		//builder.append(survayClinicSecondlevel);
		builder.append(", question2_clinic=");
		builder.append(question2_clinic);
		builder.append(", question6_1_clinic=");
		builder.append(question6_1_clinic);
		builder.append(", question6_2_clinic=");
		builder.append(question6_2_clinic);
		builder.append(", question24_clinic=");
		builder.append(question24_clinic);
		builder.append(", question26_clinic=");
		builder.append(question26_clinic);
		builder.append(", question28_clinic=");
		builder.append(question28_clinic);
		builder.append(", question29_clinic=");
		builder.append(question29_clinic);
		builder.append(", question31_clinic=");
		builder.append(question31_clinic);
		builder.append(", question32_clinic=");
		builder.append(question32_clinic);
		builder.append("]");
		return builder.toString();
	}


	



	
	
}