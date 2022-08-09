package supermarket.system.stock;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    Scanner sc = new Scanner(System.in);
    String produtoParaAlterar;
    ArrayList<Produtos> listaDeProdutos;

    public Estoque() {
        this.listaDeProdutos = new ArrayList<>();
    }

    public void inserirProduto(Produtos novoProduto) {
        listaDeProdutos.add(novoProduto);
    }

    public void listarProdutos() {
        System.out.println("\nLista de Produtos");
        for (Produtos produtoNoEstoque : listaDeProdutos) {
            produtoNoEstoque.criarListaDeProdutos();
        }
    }

    public void alterarProduto(String buscarProduto) {
        for (Produtos buscador : listaDeProdutos) {
            if (buscador.nomeDoProduto.equals(buscarProduto)) {
                System.out.println("\nEncontrado!");
                System.out.println("Digite os novos dados do produto");
                System.out.print("\nNome do produto: ");
                String novoNome = sc.nextLine();
                System.out.print("Valor do produto: ");
                double novoValor = sc.nextDouble();
                sc.nextLine(); //Limpar o buffer do teclado
                System.out.print("Quantidade do produto: ");
                int novaQuantidade = sc.nextInt();

                Produtos produtoAlterado = new Produtos(novoNome, novoValor, novaQuantidade);
                listaDeProdutos.set(listaDeProdutos.indexOf(buscador), produtoAlterado);
            }
        }
    }

}
