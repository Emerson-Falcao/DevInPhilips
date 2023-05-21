package semana11.Quiz.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizDTOResponse {

    private String nome;

    private String descricao;

    public QuizDTOResponse(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public QuizDTOResponse() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
