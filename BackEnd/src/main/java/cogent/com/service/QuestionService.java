package cogent.com.service;

import java.util.List;
import java.util.Optional;

import cogent.com.entity.Question;

public interface QuestionService {

	public Question addQuetion(Question question);

	public Question updateQuestion(Question question);

	public void deleteQuestionById(int id);

	public List<Question> getAllQuestion();

	public List<Question> getQuestionByTopic(String topic);

	public Optional<Question> getQuestionById(int id);
}
