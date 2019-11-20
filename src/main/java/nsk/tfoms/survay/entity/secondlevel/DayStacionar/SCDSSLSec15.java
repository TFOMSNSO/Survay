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
@Table(name="SURVAY_CLINIC__DSSL_SEC_15")
public class SCDSSLSec15 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private Integer idSCDSSLSec15;
	private DayStacionarSecondlevel daystacionarsecondlevel;
	
	@Column(name="question15_1",length=100)
	private String question15_1_clinic;
	
	@Column(name="question15_2",length=100)
	private String question15_2_clinic;
	
	@Column(name="question15_3",length=100)
	private String question15_3_clinic;
	
	@Column(name="question15_4",length=100)
	private String question15_4_clinic;

	@Column(name="question15_5",length=100)
	private String question15_5_clinic;
	
	@Column(name="question15_6",length=100)
	private String question15_6_clinic;
	
	@Column(name="question15_7",length=100)
	private String question15_7_clinic;
	
	@Column(name="question15_8",length=100)
	private String question15_8_clinic;
	
	@Column(name="question15_9",length=100)
	private String question15_9_clinic;
	
	@Column(name="question15_10",length=100)
	private String question15_10_clinic;
	
	@Column(name="question15_11",length=100)
	private String question15_11_clinic;
	
	public SCDSSLSec15() {
	}

	

	public void setIdSCDSSLSec15(Integer idSCDSSLSec15) {
		this.idSCDSSLSec15 = idSCDSSLSec15;
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
	

	@GenericGenerator(name = "genw", strategy = "foreign", parameters = @Parameter(name = "property", value = "daystacionarsecondlevel"))
	@Id
	@GeneratedValue(generator = "genw")
	@Column(name="ID_SURVAY_CLINIC__DSSL_SEC_15")
	public Integer getIdSCDSSLSec15() {
		return idSCDSSLSec15;
	}



	public String getQuestion15_1_clinic() {
		return question15_1_clinic;
	}



	public void setQuestion15_1_clinic(String question15_1_clinic) {
		this.question15_1_clinic = question15_1_clinic;
	}



	public String getQuestion15_2_clinic() {
		return question15_2_clinic;
	}



	public void setQuestion15_2_clinic(String question15_2_clinic) {
		this.question15_2_clinic = question15_2_clinic;
	}



	public String getQuestion15_3_clinic() {
		return question15_3_clinic;
	}



	public void setQuestion15_3_clinic(String question15_3_clinic) {
		this.question15_3_clinic = question15_3_clinic;
	}



	public String getQuestion15_4_clinic() {
		return question15_4_clinic;
	}



	public void setQuestion15_4_clinic(String question15_4_clinic) {
		this.question15_4_clinic = question15_4_clinic;
	}



	public String getQuestion15_5_clinic() {
		return question15_5_clinic;
	}



	public void setQuestion15_5_clinic(String question15_5_clinic) {
		this.question15_5_clinic = question15_5_clinic;
	}



	public String getQuestion15_6_clinic() {
		return question15_6_clinic;
	}



	public void setQuestion15_6_clinic(String question15_6_clinic) {
		this.question15_6_clinic = question15_6_clinic;
	}



	public String getQuestion15_7_clinic() {
		return question15_7_clinic;
	}



	public void setQuestion15_7_clinic(String question15_7_clinic) {
		this.question15_7_clinic = question15_7_clinic;
	}



	public String getQuestion15_8_clinic() {
		return question15_8_clinic;
	}



	public void setQuestion15_8_clinic(String question15_8_clinic) {
		this.question15_8_clinic = question15_8_clinic;
	}



	public String getQuestion15_9_clinic() {
		return question15_9_clinic;
	}



	public void setQuestion15_9_clinic(String question15_9_clinic) {
		this.question15_9_clinic = question15_9_clinic;
	}



	public String getQuestion15_10_clinic() {
		return question15_10_clinic;
	}



	public void setQuestion15_10_clinic(String question15_10_clinic) {
		this.question15_10_clinic = question15_10_clinic;
	}



	public String getQuestion15_11_clinic() {
		return question15_11_clinic;
	}



	public void setQuestion15_11_clinic(String question15_11_clinic) {
		this.question15_11_clinic = question15_11_clinic;
	}




}