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
@Table(name="SURVAY_CLINIC_SSL_SEC_3")
public class SCSSLSec3 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private Integer idSurvayClinicSSLSec3;
	private StacionarSecondlevel stacionarsecondlevel;
	
	private String question24_1sec3;
	private String question24_2sec3;
	private String question24_3sec3;
	private String question24_4sec3;
	private String question24_5sec3;
	
	
	
		

	public SCSSLSec3() {
	}

		

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@JsonIgnore
	public StacionarSecondlevel getStacionarsecondlevel() {
		return stacionarsecondlevel;
	}

	@GenericGenerator(name = "genqqq", strategy = "foreign", parameters = @Parameter(name = "property", value = "stacionarsecondlevel"))
	@Id
	@GeneratedValue(generator = "genqqq")
	@Column(name="ID_SCSSL_SEC_3")
	public Integer getIdSurvayClinicSSLSec3() {
		return idSurvayClinicSSLSec3;
	}


	public void setIdSurvayClinicSSLSec3(Integer idSurvayClinicSSLSec3) {
		this.idSurvayClinicSSLSec3 = idSurvayClinicSSLSec3;
	}



	public String getQuestion24_1sec3() {
		return question24_1sec3;
	}



	public void setQuestion24_1sec3(String question24_1sec3) {
		this.question24_1sec3 = question24_1sec3;
	}



	public String getQuestion24_2sec3() {
		return question24_2sec3;
	}



	public void setQuestion24_2sec3(String question24_2sec3) {
		this.question24_2sec3 = question24_2sec3;
	}



	public String getQuestion24_3sec3() {
		return question24_3sec3;
	}



	public void setQuestion24_3sec3(String question24_3sec3) {
		this.question24_3sec3 = question24_3sec3;
	}



	public String getQuestion24_4sec3() {
		return question24_4sec3;
	}



	public void setQuestion24_4sec3(String question24_4sec3) {
		this.question24_4sec3 = question24_4sec3;
	}



	public String getQuestion24_5sec3() {
		return question24_5sec3;
	}



	public void setQuestion24_5sec3(String question24_5sec3) {
		this.question24_5sec3 = question24_5sec3;
	}



	public void setStacionarsecondlevel(StacionarSecondlevel stacionarsecondlevel) {
		this.stacionarsecondlevel = stacionarsecondlevel;
	}


		

}