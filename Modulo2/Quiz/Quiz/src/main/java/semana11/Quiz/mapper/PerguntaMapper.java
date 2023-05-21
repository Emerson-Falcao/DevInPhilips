package semana11.Quiz.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import semana11.Quiz.model.PerguntaEntity;
import semana11.Quiz.model.dto.PerguntaDTOResponse;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PerguntaMapper {

    PerguntaDTOResponse map(PerguntaEntity source);

    PerguntaEntity map(PerguntaDTOResponse source);

}
