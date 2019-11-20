package nsk.tfoms.survay.entity.secondlevel.DayStacionar;

import java.io.Serializable;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;



/**
 * The persistent class for the SURVAY_CLINIC_SEC_1 database table.
 * 
 */
@Entity
@Table(name="Question_many_daysstacionar")
public class QuestionManyDayStacionar implements Serializable {
	private static final long serialVersionUID = 1L;

	

	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="ID_question_many_daystacionar")
	private Integer idQuestionManydaystacionar;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_SURVAY_CLINIC_DSSL", referencedColumnName="GENERAL_ID_DSSL")
    @JsonIgnore
	private DayStacionarSecondlevel daystacionarsecondlevel;
	
	
	@Column(name="QuestionDS14",length=500)
	private String questionDS14many;
	
	@Column(name="QuestionDS16",length=500)
	private String questionDS16many;
	
	@Column(name="QuestionDS18",length=500)
	private String questionDS18many;
	
	@Column(name="QuestionDS19",length=500)
	private String questionDS19many;
	
	@Column(name="QuestionDS21",length=500)
	private String questionDS21many;
	
	@Column(name="QuestionDS22",length=500)
	private String questionDS22many;
	
	@Column(name="QuestionDS24",length=500)
	private String questionDS24many;

	public Integer getIdQuestionManydaystacionar() {
		return idQuestionManydaystacionar;
	}

	public void setIdQuestionManydaystacionar(Integer idQuestionManydaystacionar) {
		this.idQuestionManydaystacionar = idQuestionManydaystacionar;
	}

	public DayStacionarSecondlevel getDaystacionarsecondlevel() {
		return daystacionarsecondlevel;
	}

	public void setDaystacionarsecondlevel(DayStacionarSecondlevel daystacionarsecondlevel) {
		this.daystacionarsecondlevel = daystacionarsecondlevel;
	}

	public String getQuestionDS14many() {
		return questionDS14many;
	}

	public void setQuestionDS14many(String questionDS14many) {
		this.questionDS14many = questionDS14many;
	}

	public String getQuestionDS16many() {
		return questionDS16many;
	}

	public void setQuestionDS16many(String questionDS16many) {
		this.questionDS16many = questionDS16many;
	}

	public String getQuestionDS18many() {
		return questionDS18many;
	}

	public void setQuestionDS18many(String questionDS18many) {
		this.questionDS18many = questionDS18many;
	}

	public String getQuestionDS19many() {
		return questionDS19many;
	}

	public void setQuestionDS19many(String questionDS19many) {
		this.questionDS19many = questionDS19many;
	}

	public String getQuestionDS21many() {
		return questionDS21many;
	}

	public void setQuestionDS21many(String questionDS21many) {
		this.questionDS21many = questionDS21many;
	}

	public String getQuestionDS22many() {
		return questionDS22many;
	}

	public void setQuestionDS22many(String questionDS22many) {
		this.questionDS22many = questionDS22many;
	}

	public String getQuestionDS24many() {
		return questionDS24many;
	}

	public void setQuestionDS24many(String questionDS24many) {
		this.questionDS24many = questionDS24many;
	}

	



	
	
}