package supermarket.system.stock;

import java.util.ArrayList;

public class Estoque {

    ArrayList<Produtos> listaDeProdutos;

    public Estoque(){
        this.listaDeProdutos = new ArrayList<Produtos>();
    }

    public void inserirProduto(Produtos novoProduto){
        listaDeProdutos.add(novoProduto);
    }

    public void listarProdutos(){
        System.out.println("\nLista de Produtos");

        for (Produtos produtoNoEstoque:listaDeProdutos){
            produtoNoEstoque.criarListaDeProdutos();
        }
    }

}
