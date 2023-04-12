package semana10.Produto.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "produtos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String nome;
    private String descricao;
    private String dtLancamento;
    private double preco;

    public ProdutoEntity(String nome, String descricao, String dtLancamento, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.dtLancamento = dtLancamento;
        this.preco = preco;
    }
}
