package semana10.Produto.services;

import org.springframework.stereotype.Service;
import semana10.Produto.controllers.dtos.ProdutoDTO;
import semana10.Produto.controllers.dtos.ProdutoEDTO;
import semana10.Produto.models.ProdutoEntity;
import semana10.Produto.repo.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository repo;

    public ProdutoService(ProdutoRepository prodRepo){
        this.repo = prodRepo;
    }

    public List<ProdutoDTO> getProdutos(){

        List<ProdutoEntity> produtosE = repo.findAll();
        List<ProdutoDTO> produtosDTO = new ArrayList();
        for(ProdutoEntity produtoEntity : produtosE){
            ProdutoDTO produtoDTO = new ProdutoDTO(produtoEntity.getNome(),
                                                produtoEntity.getDescricao(),
                                                produtoEntity.getDtLancamento(),
                                                produtoEntity.getPreco());
            produtosDTO.add(produtoDTO);
        }

        return produtosDTO;
    }

    public void createProduto(ProdutoDTO newProd){
        ProdutoEntity produtoEntity = new ProdutoEntity(newProd.getNome(),
                                                        newProd.getDescricao(),
                                                        newProd.getDtLancamento(),
                                                        newProd.getPreco());
        repo.save(produtoEntity);
    }

    public void editProduto(ProdutoEDTO editProd){
        ProdutoEntity produtoEntity = repo.findById(editProd.getID()).orElse(null);
        produtoEntity.setNome(editProd.getNome());
        produtoEntity.setDescricao(editProd.getDescricao());
        produtoEntity.setDtLancamento(editProd.getDtLancamento());
        produtoEntity.setPreco(editProd.getPreco());
        repo.save(produtoEntity);
    }

    public void deleteProduto(ProdutoEDTO produtoEDTO){
        ProdutoEntity produtoEntity = repo.findById(produtoEDTO.getID()).orElse(null);
        repo.delete(produtoEntity);
    }

}
