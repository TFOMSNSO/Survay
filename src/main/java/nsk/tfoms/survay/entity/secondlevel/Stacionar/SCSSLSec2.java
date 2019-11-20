package nsk.tfoms.survay.entity.secondlevel.Stacionar;

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
@Table(name="SURVAY_CLINIC_SSL_SEC_2")
public class SCSSLSec2 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private Integer idSurvayClinicSSLSec2;
	private StacionarSecondlevel stacionarsecondlevel;
	
	private String question14_1sec2;
	private String question14_2sec2;
	private String question14_3sec2;
	private String question14_4sec2;
	private String question14_5sec2;
	private String question14_6sec2;
	private String question14_7sec2;
	private String question14_8sec2;
	private String question14_9sec2;
	private String question14_10sec2;
	private String question14_11sec2;
	
	
		

	public SCSSLSec2() {
	}

		

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@JsonIgnore
	public StacionarSecondlevel getStacionarsecondlevel() {
		return stacionarsecondlevel;
	}

	@GenericGenerator(name = "genqq", strategy = "foreign", parameters = @Parameter(name = "property", value = "stacionarsecondlevel"))
	@Id
	@GeneratedValue(generator = "genqq")
	@Column(name="ID_SCSSL_SEC_2")
	public Integer getIdSurvayClinicSSLSec2() {
		return idSurvayClinicSSLSec2;
	}


	public void setIdSurvayClinicSSLSec2(Integer idSurvayClinicSSLSec2) {
		this.idSurvayClinicSSLSec2 = idSurvayClinicSSLSec2;
	}


	public void setStacionarsecondlevel(StacionarSecondlevel stacionarsecondlevel) {
		this.stacionarsecondlevel = stacionarsecondlevel;
	}



	public String getQuestion14_1sec2() {
		return question14_1sec2;
	}



	public void setQuestion14_1sec2(String question14_1sec2) {
		this.question14_1sec2 = question14_1sec2;
	}



	public String getQuestion14_2sec2() {
		return question14_2sec2;
	}



	public void setQuestion14_2sec2(String question14_2sec2) {
		this.question14_2sec2 = question14_2sec2;
	}



	public String getQuestion14_3sec2() {
		return question14_3sec2;
	}



	public void setQuestion14_3sec2(String question14_3sec2) {
		this.question14_3sec2 = question14_3sec2;
	}



	public String getQuestion14_4sec2() {
		return question14_4sec2;
	}



	public void setQuestion14_4sec2(String question14_4sec2) {
		this.question14_4sec2 = question14_4sec2;
	}



	public String getQuestion14_5sec2() {
		return question14_5sec2;
	}



	public void setQuestion14_5sec2(String question14_5sec2) {
		this.question14_5sec2 = question14_5sec2;
	}



	public String getQuestion14_6sec2() {
		return question14_6sec2;
	}



	public void setQuestion14_6sec2(String question14_6sec2) {
		this.question14_6sec2 = question14_6sec2;
	}



	public String getQuestion14_7sec2() {
		return question14_7sec2;
	}



	public void setQuestion14_7sec2(String question14_7sec2) {
		this.question14_7sec2 = question14_7sec2;
	}



	public String getQuestion14_8sec2() {
		return question14_8sec2;
	}



	public void setQuestion14_8sec2(String question14_8sec2) {
		this.question14_8sec2 = question14_8sec2;
	}



	public String getQuestion14_9sec2() {
		return question14_9sec2;
	}



	public void setQuestion14_9sec2(String question14_9sec2) {
		this.question14_9sec2 = question14_9sec2;
	}



	public String getQuestion14_10sec2() {
		return question14_10sec2;
	}



	public void setQuestion14_10sec2(String question14_10sec2) {
		this.question14_10sec2 = question14_10sec2;
	}



	public String getQuestion14_11sec2() {
		return question14_11sec2;
	}



	public void setQuestion14_11sec2(String question14_11sec2) {
		this.question14_11sec2 = question14_11sec2;
	}

	

}