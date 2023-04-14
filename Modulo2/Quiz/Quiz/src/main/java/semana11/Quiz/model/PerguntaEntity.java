package semana11.Quiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "perguntas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerguntaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String titulo;

    private String texto;

    @ManyToOne
    private QuizEntity quiz;

}
