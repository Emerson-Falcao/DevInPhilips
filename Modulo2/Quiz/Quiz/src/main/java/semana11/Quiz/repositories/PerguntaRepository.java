package semana11.Quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import semana11.Quiz.model.PerguntaEntity;

@Repository
public interface PerguntaRepository extends JpaRepository<PerguntaEntity,Long> {
}
