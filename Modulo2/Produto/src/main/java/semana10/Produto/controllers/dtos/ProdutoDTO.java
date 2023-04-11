package semana10.Produto.controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {

    private String nome;
    private String descricao;
    private Date dtLancamento;
    private double preco;

}
