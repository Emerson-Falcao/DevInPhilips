package semana11.Quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semana11.Quiz.mapper.PerguntaMapper;
import semana11.Quiz.model.PerguntaEntity;
import semana11.Quiz.model.dto.PerguntaDTOResponse;
import semana11.Quiz.repositories.PerguntaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerguntaService {

    @Autowired
    private PerguntaRepository perguntaRepository;

    @Autowired
    private PerguntaMapper perguntaMapper;

    public List<PerguntaDTOResponse> getPerguntas(){

        List<PerguntaEntity> perguntaEntities = perguntaRepository.findAll();
        List<PerguntaDTOResponse> perguntaDTOResponses = new ArrayList<>();
        for(PerguntaEntity perguntaEntity : perguntaEntities){
                perguntaDTOResponses.add(perguntaMapper.map(perguntaEntity));
        }
        return perguntaDTOResponses;
    }

    public PerguntaDTOResponse getPerguntaByID(Long ID){
        PerguntaEntity perguntaEntity = perguntaRepository.findById(ID).orElse(null);
        return perguntaMapper.map(perguntaEntity);
    }

}
