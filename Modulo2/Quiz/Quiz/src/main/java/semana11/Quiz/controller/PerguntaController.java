package semana11.Quiz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import semana11.Quiz.model.dto.PerguntaDTOResponse;
import semana11.Quiz.service.PerguntaService;

import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaController {

    @Autowired
    private PerguntaService perguntaService;

    @GetMapping
    public List<PerguntaDTOResponse> getPerguntas(){

        return perguntaService.getPerguntas();
    }

    @GetMapping("/{ID}")
    public PerguntaDTOResponse getPerguntaByID(@PathVariable Long ID){

        return perguntaService.getPerguntaByID(ID);
    }

}
