package semana11.Quiz.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import semana11.Quiz.model.QuizEntity;
import semana11.Quiz.model.dto.QuizDTOResponse;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuizMapper {

    QuizDTOResponse map(QuizEntity source);

    QuizEntity map(QuizDTOResponse source);

}
