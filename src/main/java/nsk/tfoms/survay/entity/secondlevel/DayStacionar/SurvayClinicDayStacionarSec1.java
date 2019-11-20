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
@Table(name="SURVAY_CLINIC_DSSL_SEC1")
public class SurvayClinicDayStacionarSec1 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idSurvayClinicDSSec1;
	
	
	@Column(name="question8_dssl",length=30)
	private String question8sec1;
	
	@Column(name="question11_dssl",length=30)
	private String question11sec1;
	
	@Column(name="question13_dssl",length=30)
	private String question13sec1;
	

	private DayStacionarSecondlevel daystacionarsecondlevel;

	public SurvayClinicDayStacionarSec1() {
	}

	@GenericGenerator(name = "gends", strategy = "foreign", parameters = @Parameter(name = "property", value = "daystacionarsecondlevel"))
	@Id
	@GeneratedValue(generator = "gends")
	@Column(name="ID_SURVAY_CLINIC_DS_SEC_1")
	public Integer getIdSurvayClinicDSSec1() {
		return idSurvayClinicDSSec1;
	}



	public void setIdSurvayClinicDSSec1(Integer idSurvayClinicDSSec1) {
		this.idSurvayClinicDSSec1 = idSurvayClinicDSSec1;
	}



	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@JsonIgnore
	public DayStacionarSecondlevel getDaystacionarsecondlevel() {
		return daystacionarsecondlevel;
	}




	public void setDaystacionarsecondlevel(DayStacionarSecondlevel daystacionarsecondlevel) {
		this.daystacionarsecondlevel = daystacionarsecondlevel;
	}

	public String getQuestion8sec1() {
		return question8sec1;
	}

	public void setQuestion8sec1(String question8sec1) {
		this.question8sec1 = question8sec1;
	}

	public String getQuestion11sec1() {
		return question11sec1;
	}

	public void setQuestion11sec1(String question11sec1) {
		this.question11sec1 = question11sec1;
	}

	public String getQuestion13sec1() {
		return question13sec1;
	}

	public void setQuestion13sec1(String question13sec1) {
		this.question13sec1 = question13sec1;
	}



	
}