package supermarket.system;

import supermarket.system.stock.Estoque;
import supermarket.system.stock.MenuDoUsuario;
import supermarket.system.stock.Produtos;
import java.awt.*;
import java.util.Scanner;

public class SuperMarketApp{

    public static void main(String[] args) {

        String nomeDoProduto,validade;
        String valorDigitado;
        double valor;
        int quantidade, opcao;

        Scanner sc = new Scanner(System.in); //Construção do objeto sc para utilizar dados de entrada via teclado
        Produtos novoProduto = new Produtos(); //Construção do objeto novoProduto do tipo(classe) Produtos
        Estoque novoEstoque = new Estoque(); //Construção do objeto estoque

        do {
            //Menu do usuário
            System.out.println("\n----------------------");
            System.out.println("        MENU");
            System.out.println("----------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um novo produto");
            System.out.println("2 - Listar produtos do estoque");
            System.out.println("3 - Excluir um produto do estoque");
            System.out.println("0 - Sair");

            opcao = sc.nextInt(); //Ler a opção do usuário
            sc.nextLine(); //Limpar o buffer do teclado

            switch (opcao) {
                case 1 -> {
                    System.out.println("Vamos cadastrar um novo produto!");
                    System.out.print("Digite o nome: ");
                    nomeDoProduto = sc.nextLine();
                    System.out.print("Digite o valor: R$");
                    valorDigitado = sc.nextLine();
                    valorDigitado = valorDigitado.replaceAll(",", "."); //Substituir a virgula digitada para separar decimal por ponto para evitar erro de execução
                    valor = Double.parseDouble(valorDigitado); //Converter o valor digitado de string para double
                    System.out.print("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    sc.nextLine(); //Limpar o buffer do teclado
                    System.out.print("Digite a data de validade: ");
                    validade = sc.nextLine();

                    novoProduto = new Produtos(nomeDoProduto, valor, quantidade, validade);

                    novoEstoque.inserirProduto(novoProduto);
                }
                case 2 -> {
                    novoEstoque.listarProdutos();
                }
                case 3 -> System.out.println("Escolha um produto do seu estoque para alterar: ");
                case 0 -> System.out.println("\nSaindo...");
                default -> System.out.println("Opção inválida!");
            }
        }while(opcao != 0);
    }

}