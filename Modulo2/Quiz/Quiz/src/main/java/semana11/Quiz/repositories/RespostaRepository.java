package semana11.Quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import semana11.Quiz.model.RespostaEntity;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaEntity,Long> {
}
