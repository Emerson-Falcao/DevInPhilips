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
    private Long ID;

    private String titulo;

    private String texto;

    @ManyToOne
    private QuizEntity quiz;

    public PerguntaEntity(Long ID, String titulo, String texto, QuizEntity quiz) {
        this.ID = ID;
        this.titulo = titulo;
        this.texto = texto;
        this.quiz = quiz;
    }

    public PerguntaEntity() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public QuizEntity getQuiz() {
        return quiz;
    }

    public void setQuiz(QuizEntity quiz) {
        this.quiz = quiz;
    }
}
