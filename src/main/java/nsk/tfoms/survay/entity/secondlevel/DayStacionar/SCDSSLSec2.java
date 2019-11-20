package nsk.tfoms.survay.entity.secondlevel.DayStacionar;

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
@Table(name="SURVAY_CLINIC_DSSL_SEC_2")
public class SCDSSLSec2 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private Integer idSurvayClinicDSSLSec2;
	private DayStacionarSecondlevel daystacionarsecondlevel;
	
	@Column(name="question7",length=300)
	private String question7sec2;
	
	@Column(name="question10_1",length=300)
	private String question10_1sec2;
	
	@Column(name="question10_2",length=300)
	private String question10_2sec2;
	
	@Column(name="question10_3",length=300)
	private String question10_3sec2;
	
	@Column(name="question10_4",length=300)
	private String question10_4sec2;
	
	@Column(name="question10_5",length=300)
	private String question10_5sec2;
	
	@Column(name="question10_6",length=300)
	private String question10_6sec2;
	
	@Column(name="question10_7",length=300)
	private String question10_7sec2;
	
	@Column(name="question10_8",length=300)
	private String question10_8sec2;
	
	@Column(name="question10_9",length=300)
	private String question10_9sec2;
	
	@Column(name="question10_10",length=300)
	private String question10_10sec2;
	
	@Column(name="question10_11",length=300)
	private String question10_11sec2;
	
	@Column(name="question10_12",length=300)
	private String question10_12sec2;
	
	@Column(name="question10_13",length=300)
	private String question10_13sec2;
	
	@Column(name="question10_14",length=300)
	private String question10_14sec2;
	
	@Column(name="question12",length=300)
	private String question12sec2;
		

	public SCDSSLSec2() {
	}

	public void setIdSurvayClinicDSSLSec2(Integer idSurvayClinicDSSLSec2) {
		this.idSurvayClinicDSSLSec2 = idSurvayClinicDSSLSec2;
	}

	public void setDaystacionarsecondlevel(DayStacionarSecondlevel daystacionarsecondlevel) {
		this.daystacionarsecondlevel = daystacionarsecondlevel;
	}
	

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@JsonIgnore
	public DayStacionarSecondlevel getDaystacionarsecondlevel() {
		return daystacionarsecondlevel;
	}

	@GenericGenerator(name = "genq", strategy = "foreign", parameters = @Parameter(name = "property", value = "daystacionarsecondlevel"))
	@Id
	@GeneratedValue(generator = "genq")
	@Column(name="ID_SURVAY_CLINIC_DSSL_SEC_2")
	public Integer getIdSurvayClinicDSSLSec2() {
		return idSurvayClinicDSSLSec2;
	}

	public String getQuestion7sec2() {
		return question7sec2;
	}

	public void setQuestion7sec2(String question7sec2) {
		this.question7sec2 = question7sec2;
	}

	public String getQuestion10_1sec2() {
		return question10_1sec2;
	}

	public void setQuestion10_1sec2(String question10_1sec2) {
		this.question10_1sec2 = question10_1sec2;
	}

	public String getQuestion10_2sec2() {
		return question10_2sec2;
	}

	public void setQuestion10_2sec2(String question10_2sec2) {
		this.question10_2sec2 = question10_2sec2;
	}

	public String getQuestion10_3sec2() {
		return question10_3sec2;
	}

	public void setQuestion10_3sec2(String question10_3sec2) {
		this.question10_3sec2 = question10_3sec2;
	}

	public String getQuestion10_4sec2() {
		return question10_4sec2;
	}

	public void setQuestion10_4sec2(String question10_4sec2) {
		this.question10_4sec2 = question10_4sec2;
	}

	public String getQuestion10_5sec2() {
		return question10_5sec2;
	}

	public void setQuestion10_5sec2(String question10_5sec2) {
		this.question10_5sec2 = question10_5sec2;
	}

	public String getQuestion10_6sec2() {
		return question10_6sec2;
	}

	public void setQuestion10_6sec2(String question10_6sec2) {
		this.question10_6sec2 = question10_6sec2;
	}

	public String getQuestion10_7sec2() {
		return question10_7sec2;
	}

	public void setQuestion10_7sec2(String question10_7sec2) {
		this.question10_7sec2 = question10_7sec2;
	}

	public String getQuestion10_8sec2() {
		return question10_8sec2;
	}

	public void setQuestion10_8sec2(String question10_8sec2) {
		this.question10_8sec2 = question10_8sec2;
	}

	public String getQuestion10_9sec2() {
		return question10_9sec2;
	}

	public void setQuestion10_9sec2(String question10_9sec2) {
		this.question10_9sec2 = question10_9sec2;
	}

	public String getQuestion10_10sec2() {
		return question10_10sec2;
	}

	public void setQuestion10_10sec2(String question10_10sec2) {
		this.question10_10sec2 = question10_10sec2;
	}

	public String getQuestion10_11sec2() {
		return question10_11sec2;
	}

	public void setQuestion10_11sec2(String question10_11sec2) {
		this.question10_11sec2 = question10_11sec2;
	}

	public String getQuestion10_12sec2() {
		return question10_12sec2;
	}

	public void setQuestion10_12sec2(String question10_12sec2) {
		this.question10_12sec2 = question10_12sec2;
	}

	public String getQuestion10_13sec2() {
		return question10_13sec2;
	}

	public void setQuestion10_13sec2(String question10_13sec2) {
		this.question10_13sec2 = question10_13sec2;
	}

	public String getQuestion10_14sec2() {
		return question10_14sec2;
	}

	public void setQuestion10_14sec2(String question10_14sec2) {
		this.question10_14sec2 = question10_14sec2;
	}

	public String getQuestion12sec2() {
		return question12sec2;
	}

	public void setQuestion12sec2(String question12sec2) {
		this.question12sec2 = question12sec2;
	}

	

}