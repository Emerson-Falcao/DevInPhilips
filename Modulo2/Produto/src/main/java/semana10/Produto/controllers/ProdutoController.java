package semana10.Produto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import semana10.Produto.controllers.dtos.ProdutoDTO;

import java.util.Date;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public String requestProdutos(ProdutoDTO pdto, Model model){
        pdto.setNome("Alvejante");
        pdto.setDescricao("Produto de Limpeza");
        pdto.setPreco(10.00);
        pdto.setDtLancamento(new Date());
        model.addAttribute("produto",pdto);
        return "produtos";
    }

}
