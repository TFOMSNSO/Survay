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
@Table(name="Survay_Clinic_SSL_SEC1")
public class SCSSLSec1 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idSCSSLSec1;
	
	
	private String questionS5sec1;
	
	private String questionS9_1sec1;
	private String questionS9_2sec1;
	private String questionS9_3sec1;
	private String questionS9_4sec1;
	private String questionS9_5sec1;
	private String questionS9_6sec1;
	private String questionS9_7sec1;
	private String questionS9_8sec1;
	private String questionS9_9sec1;
	private String questionS9_10sec1;
	private String questionS9_11sec1;
	private String questionS9_12sec1;
	private String questionS9_13sec1;
	private String questionS9_14sec1;
	private String questionS9_15sec1;
	private String questionS9_16sec1;
	private String questionS9_17sec1;
	private String questionS9_18sec1;
	private String questionS9_19sec1;
	
	private String questionS11sec1;
	
	
	
	

	private StacionarSecondlevel stacionarsecondlevel;

	public SCSSLSec1() {
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@JsonIgnore
	public StacionarSecondlevel getStacionarsecondlevel() {
		return stacionarsecondlevel;
	}

	public void setStacionarsecondlevel(StacionarSecondlevel stacionarsecondlevel) {
		this.stacionarsecondlevel = stacionarsecondlevel;
	}

	
	@GenericGenerator(name = "gens", strategy = "foreign", parameters = @Parameter(name = "property", value = "stacionarsecondlevel"))
	@Id
	@GeneratedValue(generator = "gens")
	@Column(name="ID_SCSSLSEC_1")
	public Integer getIdSCSSLSec1() {
		return idSCSSLSec1;
	}

	public void setIdSCSSLSec1(Integer idSCSSLSec1) {
		this.idSCSSLSec1 = idSCSSLSec1;
	}

	public String getQuestionS5sec1() {
		return questionS5sec1;
	}

	public void setQuestionS5sec1(String questionS5sec1) {
		this.questionS5sec1 = questionS5sec1;
	}

	public String getQuestionS9_1sec1() {
		return questionS9_1sec1;
	}

	public void setQuestionS9_1sec1(String questionS9_1sec1) {
		this.questionS9_1sec1 = questionS9_1sec1;
	}

	public String getQuestionS9_2sec1() {
		return questionS9_2sec1;
	}

	public void setQuestionS9_2sec1(String questionS9_2sec1) {
		this.questionS9_2sec1 = questionS9_2sec1;
	}

	public String getQuestionS9_3sec1() {
		return questionS9_3sec1;
	}

	public void setQuestionS9_3sec1(String questionS9_3sec1) {
		this.questionS9_3sec1 = questionS9_3sec1;
	}

	public String getQuestionS9_4sec1() {
		return questionS9_4sec1;
	}

	public void setQuestionS9_4sec1(String questionS9_4sec1) {
		this.questionS9_4sec1 = questionS9_4sec1;
	}

	public String getQuestionS9_5sec1() {
		return questionS9_5sec1;
	}

	public void setQuestionS9_5sec1(String questionS9_5sec1) {
		this.questionS9_5sec1 = questionS9_5sec1;
	}

	public String getQuestionS9_6sec1() {
		return questionS9_6sec1;
	}

	public void setQuestionS9_6sec1(String questionS9_6sec1) {
		this.questionS9_6sec1 = questionS9_6sec1;
	}

	public String getQuestionS9_7sec1() {
		return questionS9_7sec1;
	}

	public void setQuestionS9_7sec1(String questionS9_7sec1) {
		this.questionS9_7sec1 = questionS9_7sec1;
	}

	public String getQuestionS9_8sec1() {
		return questionS9_8sec1;
	}

	public void setQuestionS9_8sec1(String questionS9_8sec1) {
		this.questionS9_8sec1 = questionS9_8sec1;
	}

	public String getQuestionS9_9sec1() {
		return questionS9_9sec1;
	}

	public void setQuestionS9_9sec1(String questionS9_9sec1) {
		this.questionS9_9sec1 = questionS9_9sec1;
	}

	public String getQuestionS9_10sec1() {
		return questionS9_10sec1;
	}

	public void setQuestionS9_10sec1(String questionS9_10sec1) {
		this.questionS9_10sec1 = questionS9_10sec1;
	}

	public String getQuestionS9_11sec1() {
		return questionS9_11sec1;
	}

	public void setQuestionS9_11sec1(String questionS9_11sec1) {
		this.questionS9_11sec1 = questionS9_11sec1;
	}

	public String getQuestionS9_12sec1() {
		return questionS9_12sec1;
	}

	public void setQuestionS9_12sec1(String questionS9_12sec1) {
		this.questionS9_12sec1 = questionS9_12sec1;
	}

	public String getQuestionS9_13sec1() {
		return questionS9_13sec1;
	}

	public void setQuestionS9_13sec1(String questionS9_13sec1) {
		this.questionS9_13sec1 = questionS9_13sec1;
	}

	public String getQuestionS9_14sec1() {
		return questionS9_14sec1;
	}

	public void setQuestionS9_14sec1(String questionS9_14sec1) {
		this.questionS9_14sec1 = questionS9_14sec1;
	}

	public String getQuestionS9_15sec1() {
		return questionS9_15sec1;
	}

	public void setQuestionS9_15sec1(String questionS9_15sec1) {
		this.questionS9_15sec1 = questionS9_15sec1;
	}

	public String getQuestionS9_16sec1() {
		return questionS9_16sec1;
	}

	public void setQuestionS9_16sec1(String questionS9_16sec1) {
		this.questionS9_16sec1 = questionS9_16sec1;
	}

	public String getQuestionS9_17sec1() {
		return questionS9_17sec1;
	}

	public void setQuestionS9_17sec1(String questionS9_17sec1) {
		this.questionS9_17sec1 = questionS9_17sec1;
	}

	public String getQuestionS9_18sec1() {
		return questionS9_18sec1;
	}

	public void setQuestionS9_18sec1(String questionS9_18sec1) {
		this.questionS9_18sec1 = questionS9_18sec1;
	}

	public String getQuestionS9_19sec1() {
		return questionS9_19sec1;
	}

	public void setQuestionS9_19sec1(String questionS9_19sec1) {
		this.questionS9_19sec1 = questionS9_19sec1;
	}

	public String getQuestionS11sec1() {
		return questionS11sec1;
	}

	public void setQuestionS11sec1(String questionS11sec1) {
		this.questionS11sec1 = questionS11sec1;
	}



	
}