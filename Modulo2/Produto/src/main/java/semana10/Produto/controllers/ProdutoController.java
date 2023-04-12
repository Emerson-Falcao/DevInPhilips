package semana10.Produto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import semana10.Produto.controllers.dtos.ProdutoDTO;
import semana10.Produto.controllers.dtos.ProdutoEDTO;
import semana10.Produto.services.ProdutoService;

import java.util.Date;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService prodService;

    public ProdutoController(ProdutoService prodService){
        this.prodService = prodService;
    }

    @GetMapping
    public String requestProdutos(Model model){
        model.addAttribute("produtos",prodService.getProdutos());
        return "produtos";
    }

    @GetMapping("/cadastrar")
    public String requestFormProduto(ProdutoDTO produtoDTO,Model model){
        return "criarProduto";
    }

    @PostMapping("/cadastrar")
    public String createProduto(@Validated ProdutoDTO produtoDTO, Model model){
        prodService.createProduto(produtoDTO);
        return "redirect:/produtos";
    }

    @GetMapping("/editar")
    public String requestFormProdutoEdit(ProdutoEDTO produtoEDTO, Model model){
        return "editarProduto";
    }

    @PostMapping("/editar")
    public String editProduto(@Validated ProdutoEDTO produtoEDTO, Model model){
        prodService.editProduto(produtoEDTO);
        return "redirect:/produtos";
    }

    @PostMapping("/deletar")
    public String deleteProduto(ProdutoEDTO produtoEDTO, Model model){
        prodService.deleteProduto(produtoEDTO);
        return "redirect:/produtos";
    }

}
