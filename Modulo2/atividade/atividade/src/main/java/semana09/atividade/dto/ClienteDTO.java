package semana09.atividade.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String nome;

    private String cpf;

    private Date dtNascimento;

}
