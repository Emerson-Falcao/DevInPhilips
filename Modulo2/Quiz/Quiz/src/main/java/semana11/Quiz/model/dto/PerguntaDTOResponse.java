package semana11.Quiz.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerguntaDTOResponse {

    private String titulo;

    private String texto;

    public PerguntaDTOResponse(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    public PerguntaDTOResponse() {
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
}
