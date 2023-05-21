package semana11.Quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import semana11.Quiz.model.dto.QuizDTOResponse;
import semana11.Quiz.service.QuizService;

import java.util.List;

@RestController
@RequestMapping("/quizes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping
    public List<QuizDTOResponse> requestQuizes(){
        return quizService.getQuizes();
    }

    @GetMapping("/{ID}")
    public QuizDTOResponse requestQuizById(@PathVariable Long ID){
        return quizService.getQuizByID(ID);
    }

}
