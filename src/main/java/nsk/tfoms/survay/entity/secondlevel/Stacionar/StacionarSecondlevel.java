package nsk.tfoms.survay.entity.secondlevel.Stacionar;

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
@Table(name="SURVAY_SL_STACIONAR")
public class StacionarSecondlevel implements Serializable {
	
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="GENERAL_ID_SLS")
	private Integer id;
	@OneToMany(mappedBy="stacionarsecondlevel", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	//@JsonIgnore
	private Set<QuestionManyStacionar> manySSL;

	@Column(name="AGE_SLS")
	private int ageSls;

	@Column(name="DATA_INPUT_SLS")
	private String dataInputSls = new SimpleDateFormat("dd.MM.yyyy").format(new Date());

	@Column(name="DATA_RESP_SLS")
	private String dataRespSls;

	@Column(name="MO_SLS")
	private String moSLS;

	@Column(name="POLZOVATEL_SLS")
	private String polzSecondlSls;

	@Column(name="SEX_SLS")
	private String sexSls;

	@Column(name="questionS1")
	private String questionS1;
	
	@Column(name="questionS2")
	private String questionS2;
	
	@Column(name="questionS3")
	private String questionS3;
	
	@Column(name="questionS4")
	private String questionS4;
	
	@Column(name="questionS6")
	private String questionS6;
	
	@Column(name="questionS7")
	private String questionS7;
	
	@Column(name="questionS8")
	private String questionS8;
	
	@Column(name="questionS10")
	private String questionS10;
	
	@Column(name="questionS12")
	private String questionS12;
	
	@Column(name="questionS16")
	private String questionS16;
	
	@Column(name="questionS19")
	private String questionS19;
	
	@Column(name="questionS22")
	private String questionS22;
	
	@Column(name="questionS25")
	private String questionS25;
	
	@Column(name="questionS26")
	private String questionS26;
	
	@Column(name="questionS27")
	private String questionS27;
	
	@Column(name="questionS30")
	private String questionS30;
	
	@Column(name="questionS31")
	private String questionS31;
	
	@Column(name="questionS32")
	private String questionS32;
	
	
	


	//bi-directional one-to-one association to SurvayClinicSec1
	@OneToOne(mappedBy="stacionarsecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SCSSLSec1 scsslsec1;

	@OneToOne(mappedBy="stacionarsecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SCSSLSec2 scsslsec2;
	
	@OneToOne(mappedBy="stacionarsecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SCSSLSec3 scsslsec3;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<QuestionManyStacionar> getManySSL() {
		return manySSL;
	}

	public void setManySSL(Set<QuestionManyStacionar> manySSL) {
		this.manySSL = manySSL;
	}

	public int getAgeSls() {
		return ageSls;
	}

	public void setAgeSls(int ageSls) {
		this.ageSls = ageSls;
	}

	public String getDataInputSls() {
		return dataInputSls;
	}

	public void setDataInputSls(String dataInputSls) {
		this.dataInputSls = dataInputSls;
	}

	public String getDataRespSls() {
		return dataRespSls;
	}

	public void setDataRespSls(String dataRespSls) {
		this.dataRespSls = dataRespSls;
	}

	public String getMoSLS() {
		return moSLS;
	}

	public void setMoSLS(String moSLS) {
		this.moSLS = moSLS;
	}

	public String getPolzSecondlSls() {
		return polzSecondlSls;
	}

	public void setPolzSecondlSls(String polzSecondlSls) {
		this.polzSecondlSls = polzSecondlSls;
	}

	public String getSexSls() {
		return sexSls;
	}

	public void setSexSls(String sexSls) {
		this.sexSls = sexSls;
	}

	public String getQuestionS1() {
		return questionS1;
	}

	public void setQuestionS1(String questionS1) {
		this.questionS1 = questionS1;
	}

	public String getQuestionS2() {
		return questionS2;
	}

	public void setQuestionS2(String questionS2) {
		this.questionS2 = questionS2;
	}

	public String getQuestionS3() {
		return questionS3;
	}

	public void setQuestionS3(String questionS3) {
		this.questionS3 = questionS3;
	}

	public String getQuestionS4() {
		return questionS4;
	}

	public void setQuestionS4(String questionS4) {
		this.questionS4 = questionS4;
	}

	public String getQuestionS6() {
		return questionS6;
	}

	public void setQuestionS6(String questionS6) {
		this.questionS6 = questionS6;
	}

	public String getQuestionS7() {
		return questionS7;
	}

	public void setQuestionS7(String questionS7) {
		this.questionS7 = questionS7;
	}

	public String getQuestionS8() {
		return questionS8;
	}

	public void setQuestionS8(String questionS8) {
		this.questionS8 = questionS8;
	}

	public String getQuestionS10() {
		return questionS10;
	}

	public void setQuestionS10(String questionS10) {
		this.questionS10 = questionS10;
	}

	public String getQuestionS12() {
		return questionS12;
	}

	public void setQuestionS12(String questionS12) {
		this.questionS12 = questionS12;
	}

	public String getQuestionS16() {
		return questionS16;
	}

	public void setQuestionS16(String questionS16) {
		this.questionS16 = questionS16;
	}

	public String getQuestionS19() {
		return questionS19;
	}

	public void setQuestionS19(String questionS19) {
		this.questionS19 = questionS19;
	}

	public String getQuestionS22() {
		return questionS22;
	}

	public void setQuestionS22(String questionS22) {
		this.questionS22 = questionS22;
	}

	public String getQuestionS25() {
		return questionS25;
	}

	public void setQuestionS25(String questionS25) {
		this.questionS25 = questionS25;
	}

	public String getQuestionS26() {
		return questionS26;
	}

	public void setQuestionS26(String questionS26) {
		this.questionS26 = questionS26;
	}

	public String getQuestionS27() {
		return questionS27;
	}

	public void setQuestionS27(String questionS27) {
		this.questionS27 = questionS27;
	}

	public String getQuestionS30() {
		return questionS30;
	}

	public void setQuestionS30(String questionS30) {
		this.questionS30 = questionS30;
	}

	public String getQuestionS31() {
		return questionS31;
	}

	public void setQuestionS31(String questionS31) {
		this.questionS31 = questionS31;
	}

	public String getQuestionS32() {
		return questionS32;
	}

	public void setQuestionS32(String questionS32) {
		this.questionS32 = questionS32;
	}

	public SCSSLSec1 getScsslsec1() {
		return scsslsec1;
	}

	public void setScsslsec1(SCSSLSec1 scsslsec1) {
		this.scsslsec1 = scsslsec1;
	}

	public SCSSLSec2 getScsslsec2() {
		return scsslsec2;
	}

	public void setScsslsec2(SCSSLSec2 scsslsec2) {
		this.scsslsec2 = scsslsec2;
	}

	public SCSSLSec3 getScsslsec3() {
		return scsslsec3;
	}

	public void setScsslsec3(SCSSLSec3 scsslsec3) {
		this.scsslsec3 = scsslsec3;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StacionarSecondlevel [id=");
		builder.append(id);
		builder.append(", manySSL=");
		builder.append(manySSL);
		builder.append(", ageSls=");
		builder.append(ageSls);
		builder.append(", dataInputSls=");
		builder.append(dataInputSls);
		builder.append(", dataRespSls=");
		builder.append(dataRespSls);
		builder.append(", moSLS=");
		builder.append(moSLS);
		builder.append(", polzSecondlSls=");
		builder.append(polzSecondlSls);
		builder.append(", sexSls=");
		builder.append(sexSls);
		builder.append(", questionS1=");
		builder.append(questionS1);
		builder.append(", questionS2=");
		builder.append(questionS2);
		builder.append(", questionS3=");
		builder.append(questionS3);
		builder.append(", questionS4=");
		builder.append(questionS4);
		builder.append(", questionS6=");
		builder.append(questionS6);
		builder.append(", questionS7=");
		builder.append(questionS7);
		builder.append(", questionS8=");
		builder.append(questionS8);
		builder.append(", questionS10=");
		builder.append(questionS10);
		builder.append(", questionS12=");
		builder.append(questionS12);
		builder.append(", questionS16=");
		builder.append(questionS16);
		builder.append(", questionS19=");
		builder.append(questionS19);
		builder.append(", questionS22=");
		builder.append(questionS22);
		builder.append(", questionS25=");
		builder.append(questionS25);
		builder.append(", questionS26=");
		builder.append(questionS26);
		builder.append(", questionS27=");
		builder.append(questionS27);
		builder.append(", questionS30=");
		builder.append(questionS30);
		builder.append(", questionS31=");
		builder.append(questionS31);
		builder.append(", questionS32=");
		builder.append(questionS32);
		builder.append(", scsslsec1=");
		builder.append(scsslsec1);
		builder.append(", scsslsec2=");
		builder.append(scsslsec2);
		builder.append(", scsslsec3=");
		builder.append(scsslsec3);
		builder.append("]");
		return builder.toString();
	}
	
	

}