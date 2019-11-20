package nsk.tfoms.survay.entity.secondlevel.Clinic;

import java.io.Serializable;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Cascade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the SURVAY_CLINIC_SECONDLEVEL database table.
 * 
 */
@Entity
@Table(name="SURVAY_CLINIC_SECONDLEVEL")
@NamedQuery(name="SurvayClinicSecondlevel.findAll", query="SELECT s FROM SurvayClinicSecondlevel s")
public class SurvayClinicSecondlevel implements Serializable {
	
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="GENERAL_ID")
	private Integer id;
	@OneToMany(mappedBy="survayClinicSecondlevel", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<QuestionManyClinic> many;

	@Column(name="AGE_SECONDLEVEL")
	private int ageSecondlevel;

	@Column(name="DATA_INPUT_SECONDLEVEL")
	private String dataInputSecondlevel = new SimpleDateFormat("dd.MM.yyyy").format(new Date());

	@Column(name="DATA_RESP_SECONDLEVEL")
	private String dataRespSecondlevel;

	@Column(name="MO_SECONDLEVEL",length=200)
	private String moSecondlevel;

	@Column(name="POLZOVATEL_SECONDLEVEL",length=15)
	private String polzovatelSecondlevel;

	@Column(name="SEX_SECONDLEVEL",length=15)
	private String sexSecondlevel;

	@Column(name="VISIT_CLINIC_SECONDLEVEL",length=50)
	private String visitClinicSecondlevel;
	
	@Column(name="question5_clinic",length=50)
	private String question5;
	
	@Column(name="question9_1_clinic",length=50)
	private String question9_1;
	
	@Column(name="question9_2_clinic",length=50)
	private String question9_2;
	
	@Column(name="question11_clinic",length=50)
	private String question11;
	
	@Column(name="question16_clinic",length=500)
	private String question16;
	
	@Column(name="question17_clinic",length=500)
	private String question17;
	
	@Column(name="question19_clinic",length=30)
	private String question19;
	
	@Column(name="question27_clinic",length=30)
	private String question27;
	
	@Column(name="question30_clinic",length=50)
	private String question30;
	
	@Column(name="question33_clinic",length=350)
	private String question33;
	
	@Column(name="question34_clinic",length=350)
	private String question34;
	
	@Column(name="question35_clinic",length=350)
	private String question35;
	
	@Column(name="question36_clinic",length=500)
	private String question36;
	
	@Column(name="question37_clinic",length=200)
	private String question37;
	
	@Column(name="question38_clinic",length=50)
	private String question38;
	
	@Column(name="question41_clinic",length=100)
	private String question41;
	
	@Column(name="question42_clinic",length=100)
	private String question42;
	
	@Column(name="question43_clinic",length=100)
	private String question43;
	
	

	//bi-directional one-to-one association to SurvayClinicSec1
	@OneToOne(mappedBy="survayClinicSecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SurvayClinicSec1 survayClinicSec1;
	
	@OneToOne(mappedBy="survayClinicSecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SurvayClinicSec25 survayClinicSec25;
	
	@OneToOne(mappedBy="survayClinicSecondlevel",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JsonIgnore
	private SurvayClinicSec2 survayClinicSec2;

	public SurvayClinicSecondlevel() {
	}


	//@Transient 
	//private String replacementClinicSecondlevelsurvayClinicSec1;
	

	
	public String getDataInputSecondlevel() {
		return this.dataInputSecondlevel;
	}

	public void setDataInputSecondlevel(String dataInputSecondlevel) {
		this.dataInputSecondlevel = dataInputSecondlevel;
	}

	
	public String getMoSecondlevel() {
		return this.moSecondlevel;
	}

	public void setMoSecondlevel(String moSecondlevel) {
		this.moSecondlevel = moSecondlevel;
	}

	public String getPolzovatelSecondlevel() {
		return this.polzovatelSecondlevel;
	}

	public void setPolzovatelSecondlevel(String polzovatelSecondlevel) {
		this.polzovatelSecondlevel = polzovatelSecondlevel;
	}

	public String getSexSecondlevel() {
		return this.sexSecondlevel;
	}

	public void setSexSecondlevel(String sexSecondlevel) {
		this.sexSecondlevel = sexSecondlevel;
	}

	public String getVisitClinicSecondlevel() {
		return this.visitClinicSecondlevel;
	}

	public void setVisitClinicSecondlevel(String visitClinicSecondlevel) {
		this.visitClinicSecondlevel = visitClinicSecondlevel;
	}

	
	public SurvayClinicSec1 getSurvayClinicSec1() {
		return this.survayClinicSec1;
	}

	public void setSurvayClinicSec1(SurvayClinicSec1 survayClinicSec1) {
		this.survayClinicSec1 = survayClinicSec1;
	}

	public String getDataRespSecondlevel() {
		return dataRespSecondlevel;
	}



	public void setDataRespSecondlevel(String dataRespSecondlevel) {
		this.dataRespSecondlevel = dataRespSecondlevel;
	}

	
	public int getAgeSecondlevel() {
		return ageSecondlevel;
	}

	public void setAgeSecondlevel(int ageSecondlevel) {
		this.ageSecondlevel = ageSecondlevel;
	}

	
	/*public String getReplacementClinicSecondlevelsurvayClinicSec1() {
		return replacementClinicSecondlevelsurvayClinicSec1;
	}

	public void setReplacementClinicSecondlevelsurvayClinicSec1(String replacementClinicSecondlevelsurvayClinicSec1) {
		this.replacementClinicSecondlevelsurvayClinicSec1 = replacementClinicSecondlevelsurvayClinicSec1;
	}
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	public String getQuestion9_1() {
		return question9_1;
	}

	public void setQuestion9_1(String question9_1) {
		this.question9_1 = question9_1;
	}

	public String getQuestion9_2() {
		return question9_2;
	}

	public void setQuestion9_2(String question9_2) {
		this.question9_2 = question9_2;
	}

	public String getQuestion11() {
		return question11;
	}

	public void setQuestion11(String question11) {
		this.question11 = question11;
	}

	public String getQuestion16() {
		return question16;
	}

	public void setQuestion16(String question16) {
		this.question16 = question16;
	}

	public String getQuestion17() {
		return question17;
	}

	public void setQuestion17(String question17) {
		this.question17 = question17;
	}

	public String getQuestion19() {
		return question19;
	}

	public void setQuestion19(String question19) {
		this.question19 = question19;
	}

	public String getQuestion27() {
		return question27;
	}

	public void setQuestion27(String question27) {
		this.question27 = question27;
	}

	public String getQuestion30() {
		return question30;
	}

	public void setQuestion30(String question30) {
		this.question30 = question30;
	}

	public String getQuestion33() {
		return question33;
	}

	public void setQuestion33(String question33) {
		this.question33 = question33;
	}

	public String getQuestion34() {
		return question34;
	}

	public void setQuestion34(String question34) {
		this.question34 = question34;
	}

	public String getQuestion35() {
		return question35;
	}

	public void setQuestion35(String question35) {
		this.question35 = question35;
	}

	public String getQuestion36() {
		return question36;
	}

	public void setQuestion36(String question36) {
		this.question36 = question36;
	}

	public String getQuestion37() {
		return question37;
	}

	public void setQuestion37(String question37) {
		this.question37 = question37;
	}

	public String getQuestion38() {
		return question38;
	}

	public void setQuestion38(String question38) {
		this.question38 = question38;
	}

	public String getQuestion41() {
		return question41;
	}

	public void setQuestion41(String question41) {
		this.question41 = question41;
	}

	public String getQuestion42() {
		return question42;
	}

	public void setQuestion42(String question42) {
		this.question42 = question42;
	}

	public String getQuestion43() {
		return question43;
	}

	public void setQuestion43(String question43) {
		this.question43 = question43;
	}



	public SurvayClinicSec25 getSurvayClinicSec25() {
		return survayClinicSec25;
	}

	public void setSurvayClinicSec25(SurvayClinicSec25 survayClinicSec25) {
		this.survayClinicSec25 = survayClinicSec25;
	}

	public SurvayClinicSec2 getSurvayClinicSec2() {
		return survayClinicSec2;
	}

	public void setSurvayClinicSec2(SurvayClinicSec2 survayClinicSec2) {
		this.survayClinicSec2 = survayClinicSec2;
	}

	
	public Set<QuestionManyClinic> getQuestion_many() {
		return many;
	}

	public void setQuestion_many(Set<QuestionManyClinic> many) {
		this.many = many;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SurvayClinicSecondlevel [id=");
		builder.append(id);
		builder.append(", many=");
		builder.append(many);
		builder.append(", ageSecondlevel=");
		builder.append(ageSecondlevel);
		builder.append(", dataInputSecondlevel=");
		builder.append(dataInputSecondlevel);
		builder.append(", dataRespSecondlevel=");
		builder.append(dataRespSecondlevel);
		builder.append(", moSecondlevel=");
		builder.append(moSecondlevel);
		builder.append(", polzovatelSecondlevel=");
		builder.append(polzovatelSecondlevel);
		builder.append(", sexSecondlevel=");
		builder.append(sexSecondlevel);
		builder.append(", visitClinicSecondlevel=");
		builder.append(visitClinicSecondlevel);
		builder.append(", question5=");
		builder.append(question5);
		builder.append(", question9_1=");
		builder.append(question9_1);
		builder.append(", question9_2=");
		builder.append(question9_2);
		builder.append(", question11=");
		builder.append(question11);
		builder.append(", question16=");
		builder.append(question16);
		builder.append(", question17=");
		builder.append(question17);
		builder.append(", question19=");
		builder.append(question19);
		builder.append(", question27=");
		builder.append(question27);
		builder.append(", question30=");
		builder.append(question30);
		builder.append(", question33=");
		builder.append(question33);
		builder.append(", question34=");
		builder.append(question34);
		builder.append(", question35=");
		builder.append(question35);
		builder.append(", question36=");
		builder.append(question36);
		builder.append(", question37=");
		builder.append(question37);
		builder.append(", question38=");
		builder.append(question38);
		builder.append(", question41=");
		builder.append(question41);
		builder.append(", question42=");
		builder.append(question42);
		builder.append(", question43=");
		builder.append(question43);
		builder.append(", survayClinicSec1=");
		builder.append(survayClinicSec1);
		builder.append(", survayClinicSec25=");
		builder.append(survayClinicSec25);
		builder.append(", survayClinicSec2=");
		builder.append(survayClinicSec2);
		builder.append("]");
		return builder.toString();
	}


}