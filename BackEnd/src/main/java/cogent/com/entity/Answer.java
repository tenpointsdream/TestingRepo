package cogent.com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String description_answer;
	private String img_src;
	private String status;
	private String datetime;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "question_id")
	private Question question;

	@OneToOne
	@JoinColumn(name = "approved_by_id")
	private User approved_by;

	@OneToOne
	@JoinColumn(name = "created_by_id")
	private User created_by;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(String description_answer, String img_src, String status, String datetime, Question question,
			User approved_by, User created_by) {
		super();
		this.description_answer = description_answer;
		this.img_src = img_src;
		this.status = status;
		this.datetime = datetime;
		this.question = question;
		this.approved_by = approved_by;
		this.created_by = created_by;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription_answer() {
		return description_answer;
	}

	public void setDescription_answer(String description_answer) {
		this.description_answer = description_answer;
	}

	public String getImg_src() {
		return img_src;
	}

	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public User getApproved_by() {
		return approved_by;
	}

	public void setApproved_by(User approved_by) {
		this.approved_by = approved_by;
	}

	public User getCreated_by() {
		return created_by;
	}

	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}

}
