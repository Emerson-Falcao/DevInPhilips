package semana11.Quiz.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "respostas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespostaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String texto;

    @ManyToOne
    private PerguntaEntity pergunta;

}
