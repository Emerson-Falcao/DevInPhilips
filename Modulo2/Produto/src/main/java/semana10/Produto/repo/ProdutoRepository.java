package semana10.Produto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import semana10.Produto.models.ProdutoEntity;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity,Long> {



}
