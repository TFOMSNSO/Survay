package nsk.tfoms.survay.entity.secondlevel.Stacionar;

import java.io.Serializable;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;



/**
 * The persistent class for the SURVAY_CLINIC_SEC_1 database table.
 * 
 */
@Entity
@Table(name="Question_many_stacionar")
public class QuestionManyStacionar implements Serializable {
	private static final long serialVersionUID = 1L;

	

	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="ID_question_many_stacionar")
	private Integer idQuestionManystacionar;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_SCSSLmany", referencedColumnName="GENERAL_ID_SLS")
    @JsonIgnore
	private StacionarSecondlevel stacionarsecondlevel;
	
	
	private String questionS13many;
	private String questionS15many;
	private String questionS17many;
	private String questionS18many;
	private String questionS20many;
	private String questionS21many;
	private String questionS23many;
	
	
	public Integer getIdQuestionManystacionar() {
		return idQuestionManystacionar;
	}
	public void setIdQuestionManystacionar(Integer idQuestionManystacionar) {
		this.idQuestionManystacionar = idQuestionManystacionar;
	}
	public StacionarSecondlevel getStacionarsecondlevel() {
		return stacionarsecondlevel;
	}
	public void setStacionarsecondlevel(StacionarSecondlevel stacionarsecondlevel) {
		this.stacionarsecondlevel = stacionarsecondlevel;
	}
	public String getQuestionS13many() {
		return questionS13many;
	}
	public void setQuestionS13many(String questionS13many) {
		this.questionS13many = questionS13many;
	}
	public String getQuestionS15many() {
		return questionS15many;
	}
	public void setQuestionS15many(String questionS15many) {
		this.questionS15many = questionS15many;
	}
	public String getQuestionS17many() {
		return questionS17many;
	}
	public void setQuestionS17many(String questionS17many) {
		this.questionS17many = questionS17many;
	}
	public String getQuestionS18many() {
		return questionS18many;
	}
	public void setQuestionS18many(String questionS18many) {
		this.questionS18many = questionS18many;
	}
	public String getQuestionS20many() {
		return questionS20many;
	}
	public void setQuestionS20many(String questionS20many) {
		this.questionS20many = questionS20many;
	}
	public String getQuestionS21many() {
		return questionS21many;
	}
	public void setQuestionS21many(String questionS21many) {
		this.questionS21many = questionS21many;
	}
	public String getQuestionS23many() {
		return questionS23many;
	}
	public void setQuestionS23many(String questionS23many) {
		this.questionS23many = questionS23many;
	}
	
	
	
		



	
	
}