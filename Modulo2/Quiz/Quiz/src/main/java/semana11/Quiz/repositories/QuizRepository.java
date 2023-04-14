package semana11.Quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import semana11.Quiz.model.QuizEntity;

@Repository
public interface QuizRepository extends JpaRepository<QuizEntity,Long> {
}
