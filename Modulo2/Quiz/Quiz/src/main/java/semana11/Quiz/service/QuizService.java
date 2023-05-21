package semana11.Quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semana11.Quiz.mapper.QuizMapper;
import semana11.Quiz.model.QuizEntity;
import semana11.Quiz.model.dto.QuizDTOResponse;
import semana11.Quiz.repositories.QuizRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuizMapper quizMapper;

    public List<QuizDTOResponse> getQuizes(){

        List<QuizEntity> quizEntities = quizRepository.findAll();
        List<QuizDTOResponse> quizDTOResponses = new ArrayList<>();

        for(QuizEntity quiz : quizEntities){
            quizDTOResponses.add(quizMapper.map(quiz));
        }
        return quizDTOResponses;
    }

    public QuizDTOResponse getQuizByID(Long ID){

        QuizEntity quiz = quizRepository.findById(ID).orElse(null);
        return  quizMapper.map(quiz);

    }

}
