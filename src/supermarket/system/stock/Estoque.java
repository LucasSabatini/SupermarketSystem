package supermarket.system.stock;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    Scanner sc = new Scanner(System.in);

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
            else
                System.out.println("\nProduto não encontrado.");
                System.out.println("\nTecle Enter para continuar...");
                sc.nextLine();
        }
    }

    public void excluirProduto(String deleteProduct) {
        boolean comparador = false;
        for (Produtos buscador : listaDeProdutos) {
            if (buscador.nomeDoProduto.equals(deleteProduct)) { //Se o produto digitado existir na lista, comparador = 'true'
                comparador = true;
            }
            else {
                System.out.println("\nProduto não encontrado.");
                System.out.println("\nTecle Enter para continuar...");
                sc.nextLine();
            }
        }
        if (comparador) {   //Se comparador for 'true', prossegue para a exclusão
            System.out.println("\nEncontrado!");
            System.out.println("\nCuidado! Você tem certeza que deseja excluir esse produto?");
            System.out.println("Digite 1 para CONFIRMAR a exclusão");
            System.out.println("Digite 2 para CANCELAR essa operação");
            System.out.print("\nOpção desejada: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 -> {
                    listaDeProdutos.removeIf(prod -> prod.nomeDoProduto.equals(deleteProduct));
                    System.out.println("\nProduto excluído!");
                }
                case 2 -> {
                    System.out.println("\nCancelando...");
                    System.out.println("\nTecle Enter para continuar...");
                    sc.nextLine();
                }
                default ->{
                    System.out.println("\nOpção inválida!");
                    System.out.println("\nTecle Enter para continuar...");
                    sc.nextLine();
                }
            }
        }
    }
}
