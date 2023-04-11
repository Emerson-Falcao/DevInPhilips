package semana10.Produto.services;

import org.springframework.stereotype.Service;
import semana10.Produto.repo.ProdutoRepository;

@Service
public class ProdutoService {

    private ProdutoRepository repo;

    public ProdutoService(ProdutoRepository prodRepo){
        this.repo = prodRepo;
    }

}
