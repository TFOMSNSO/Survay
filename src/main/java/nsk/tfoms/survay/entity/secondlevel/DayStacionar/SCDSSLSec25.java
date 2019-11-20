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
@Table(name="SURVAY_CLINIC__DSSL_SEC_25")
public class SCDSSLSec25 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer idSCDSSLSec25;
	private DayStacionarSecondlevel daystacionarsecondlevel;
	
	@Column(name="question25_1",length=100)
	private String question25_1;
	
	@Column(name="question25_2",length=100)
	private String question25_2;
	
	@Column(name="question25_3",length=100)
	private String question25_3;
	
	@Column(name="question25_4",length=100)
	private String question25_4;
	
	@Column(name="question25_5",length=100)
	private String question25_5;
	
	
	public SCDSSLSec25() {
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

	public void setIdSCDSSLSec25(Integer idSCDSSLSec25) {
		this.idSCDSSLSec25 = idSCDSSLSec25;
	}
	

	@GenericGenerator(name = "gent", strategy = "foreign", parameters = @Parameter(name = "property", value = "daystacionarsecondlevel"))
	@Id
	@GeneratedValue(generator = "gent")
	@Column(name="ID_SURVAY_CLINIC__DSSL_SEC_25")
	public Integer getIdSCDSSLSec25() {
		return idSCDSSLSec25;
	}


	public String getQuestion25_1() {
		return question25_1;
	}


	public void setQuestion25_1(String question25_1) {
		this.question25_1 = question25_1;
	}


	public String getQuestion25_2() {
		return question25_2;
	}


	public void setQuestion25_2(String question25_2) {
		this.question25_2 = question25_2;
	}


	public String getQuestion25_3() {
		return question25_3;
	}


	public void setQuestion25_3(String question25_3) {
		this.question25_3 = question25_3;
	}


	public String getQuestion25_4() {
		return question25_4;
	}


	public void setQuestion25_4(String question25_4) {
		this.question25_4 = question25_4;
	}


	public String getQuestion25_5() {
		return question25_5;
	}


	public void setQuestion25_5(String question25_5) {
		this.question25_5 = question25_5;
	}
	



	


}