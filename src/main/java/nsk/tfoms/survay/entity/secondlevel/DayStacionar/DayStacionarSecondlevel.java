package nsk.tfoms.survay.entity.secondlevel.DayStacionar;

import java.io.Serializable;
import javax.persistence.*;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the SURVAY_CLINIC_SECONDLEVEL database table.
 * 
 */
@Entity
@Table(name="SURVAY_CLINIC_DAYSTACIONAR_TWO")
public class DayStacionarSecondlevel implements Serializable {
	
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="GENERAL_ID_DSSL")
	private Integer id;
	@OneToMany(mappedBy="daystacionarsecondlevel", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	//@JsonIgnore
	private Set<QuestionManyDayStacionar> manyDSSL;

	@Column(name="AGE_daystacionar_two")
	private int ageSecondleveldaystacionar;

	@Column(name="DATA_INPUT_daystacionar_two")
	private String dataInputSecondlevel = new SimpleDateFormat("dd.MM.yyyy").format(new Date());

	@Column(name="DATA_RESP_daystacionar_two")
	private String dataRespSecondleveldaystacionar;

	@Column(name="MO_daystacionar_two",length=200)
	private String moSecondleveldaystacionar;

	@Column(name="POLZOVATEL_daystacionar_two",length=15)
	private String polzSecondleveldaystacionar;

	@Column(name="SEX_daystacionar_two",length=15)
	private String sexSecondleveldaystacionar;

	
	
	@Column(name="QuestionDS1",length=500)
	private String questionDS1;
	
	@Column(name="QuestionDS2",length=500)
	private String questionDS2;
	
	@Column(name="QuestionDS3",length=500)
	private String questionDS3;
	
	@Column(name="QuestionDS4",length=500)
	private String questionDS4;
	
	@Column(name="QuestionDS5",length=500)
	private String questionDS5;
	
	@Column(name="QuestionDS6",length=500)
	private String questionDS6;
	
	@Column(name="QuestionDS9",length=500)
	private String questionDS9;
	
	@Column(name="QuestionDS17",length=500)
	private String questionDS17;
	
	@Column(name="QuestionDS20",length=500)
	private String questionDS20;
	
	@Column(name="QuestionDS23",length=500)
	private String questionDS23;
	
	@Column(name="QuestionDS26",length=500)
	private String questionDS26;
	
	@Column(name="QuestionDS27",length=500)
	private String questionDS27;
	
	@Column(name="QuestionDS28",length=500)
	private String questionDS28;
	
	@Column(name="QuestionDS31",length=500)
	private String questionDS31;
	
	@Column(name="QuestionDS32",length=500)
	private String questionDS32;
	
	@Column(name="QuestionDS33",length=500)
	private String questionDS33;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAgeSecondleveldaystacionar() {
		return ageSecondleveldaystacionar;
	}

	public void setAgeSecondleveldaystacionar(int ageSecondleveldaystacionar) {
		this.ageSecondleveldaystacionar = ageSecondleveldaystacionar;
	}

	public String getDataInputSecondlevel() {
		return dataInputSecondlevel;
	}

	public void setDataInputSecondlevel(String dataInputSecondlevel) {
		this.dataInputSecondlevel = dataInputSecondlevel;
	}

	public String getDataRespSecondleveldaystacionar() {
		return dataRespSecondleveldaystacionar;
	}

	public void setDataRespSecondleveldaystacionar(String dataRespSecondleveldaystacionar) {
		this.dataRespSecondleveldaystacionar = dataRespSecondleveldaystacionar;
	}

	public String getMoSecondleveldaystacionar() {
		return moSecondleveldaystacionar;
	}

	public void setMoSecondleveldaystacionar(String moSecondleveldaystacionar) {
		this.moSecondleveldaystacionar = moSecondleveldaystacionar;
	}

	public String getPolzSecondleveldaystacionar() {
		return polzSecondleveldaystacionar;
	}

	public void setPolzSecondleveldaystacionar(String polzSecondleveldaystacionar) {
		this.polzSecondleveldaystacionar = polzSecondleveldaystacionar;
	}

	public String getSexSecondleveldaystacionar() {
		return sexSecondleveldaystacionar;
	}

	public void setSexSecondleveldaystacionar(String sexSecondleveldaystacionar) {
		this.sexSecondleveldaystacionar = sexSecondleveldaystacionar;
	}

	
	public Set<QuestionManyDayStacionar> getManyDSSL() {
		return manyDSSL;
	}

	public void setManyDSSL(Set<QuestionManyDayStacionar> manyDSSL) {
		this.manyDSSL = manyDSSL;
	}

	public String getQuestionDS1() {
		return questionDS1;
	}

	public void setQuestionDS1(String questionDS1) {
		this.questionDS1 = questionDS1;
	}

	public String getQuestionDS2() {
		return questionDS2;
	}

	public void setQuestionDS2(String questionDS2) {
		this.questionDS2 = questionDS2;
	}

	public String getQuestionDS3() {
		return questionDS3;
	}

	public void setQuestionDS3(String questionDS3) {
		this.questionDS3 = questionDS3;
	}

	public String getQuestionDS4() {
		return questionDS4;
	}

	public void setQuestionDS4(String questionDS4) {
		this.questionDS4 = questionDS4;
	}

	public String getQuestionDS5() {
		return questionDS5;
	}

	public void setQuestionDS5(String questionDS5) {
		this.questionDS5 = questionDS5;
	}

	public String getQuestionDS6() {
		return questionDS6;
	}

	public void setQuestionDS6(String questionDS6) {
		this.questionDS6 = questionDS6;
	}

	public String getQuestionDS9() {
		return questionDS9;
	}

	public void setQuestionDS9(String questionDS9) {
		this.questionDS9 = questionDS9;
	}

	


	//bi-directional one-to-one association to SurvayClinicSec1
	@OneToOne(mappedBy="daystacionarsecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SurvayClinicDayStacionarSec1 survayclinicdaystacionarSec1;

	@OneToOne(mappedBy="daystacionarsecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SCDSSLSec2 scdsslsec2;
	
	@OneToOne(mappedBy="daystacionarsecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SCDSSLSec15 scdsslsec15;
	
	@OneToOne(mappedBy="daystacionarsecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SCDSSLSec25 scdsslsec25;

	
	public SurvayClinicDayStacionarSec1 getSurvayclinicdaystacionarSec1() {
		return survayclinicdaystacionarSec1;
	}

	public void setSurvayclinicdaystacionarSec1(SurvayClinicDayStacionarSec1 survayclinicdaystacionarSec1) {
		this.survayclinicdaystacionarSec1 = survayclinicdaystacionarSec1;
	}

	public SCDSSLSec2 getScdsslsec2() {
		return scdsslsec2;
	}

	public void setScdsslsec2(SCDSSLSec2 scdsslsec2) {
		this.scdsslsec2 = scdsslsec2;
	}

	public SCDSSLSec15 getScdsslsec15() {
		return scdsslsec15;
	}

	public void setScdsslsec15(SCDSSLSec15 scdsslsec15) {
		this.scdsslsec15 = scdsslsec15;
	}

	public SCDSSLSec25 getScdsslsec25() {
		return scdsslsec25;
	}

	public void setScdsslsec25(SCDSSLSec25 scdsslsec25) {
		this.scdsslsec25 = scdsslsec25;
	}

	public String getQuestionDS17() {
		return questionDS17;
	}

	public void setQuestionDS17(String questionDS17) {
		this.questionDS17 = questionDS17;
	}

	public String getQuestionDS20() {
		return questionDS20;
	}

	public void setQuestionDS20(String questionDS20) {
		this.questionDS20 = questionDS20;
	}

	public String getQuestionDS23() {
		return questionDS23;
	}

	public void setQuestionDS23(String questionDS23) {
		this.questionDS23 = questionDS23;
	}

	public String getQuestionDS26() {
		return questionDS26;
	}

	public void setQuestionDS26(String questionDS26) {
		this.questionDS26 = questionDS26;
	}

	public String getQuestionDS27() {
		return questionDS27;
	}

	public void setQuestionDS27(String questionDS27) {
		this.questionDS27 = questionDS27;
	}

	public String getQuestionDS28() {
		return questionDS28;
	}

	public void setQuestionDS28(String questionDS28) {
		this.questionDS28 = questionDS28;
	}

	public String getQuestionDS31() {
		return questionDS31;
	}

	public void setQuestionDS31(String questionDS31) {
		this.questionDS31 = questionDS31;
	}

	public String getQuestionDS32() {
		return questionDS32;
	}

	public void setQuestionDS32(String questionDS32) {
		this.questionDS32 = questionDS32;
	}

	public String getQuestionDS33() {
		return questionDS33;
	}

	public void setQuestionDS33(String questionDS33) {
		this.questionDS33 = questionDS33;
	}
	
	
	

}