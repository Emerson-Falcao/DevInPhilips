package semana10.Produto.controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEDTO {

    private Long ID;
    private String nome;
    private String descricao;
    private String dtLancamento;
    private double preco;

}
