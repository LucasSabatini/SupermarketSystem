package supermarket.system.stock;

import java.util.Scanner;

public class MenuDoUsuario {

    public void openUserMenu(){
        int opcao; //Opção do menu
        String nomeDoProduto,validade, valorDigitado;
        double valor;
        int quantidade;

        new Produtos();
        Produtos novoProduto; //Construção do objeto novoProduto do tipo(classe) Produtos
        Estoque novoEstoque = new Estoque(); //Construção do objeto estoque
        Scanner sc = new Scanner(System.in); //Construção do objeto sc para utilizar dados de entrada via teclado

        do {
            //Menu do usuário
            System.out.println("\n----------------------");
            System.out.println("        MENU");
            System.out.println("----------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um novo produto");
            System.out.println("2 - Listar produtos do estoque");
            System.out.println("3 - Alterar um produto do estoque");
            System.out.println("4 - Excluir um produto do estoque");
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

                    novoProduto = new Produtos(nomeDoProduto, valor, quantidade);

                    novoEstoque.inserirProduto(novoProduto);
                }
                case 2 -> {
                    novoEstoque.listarProdutos();
                }
                case 3 -> {
                    novoEstoque.listarProdutos();
                    System.out.print("\nDigite o nome do produto que você deseja alterar: ");
                    String produtoDigitado = sc.nextLine();
                    novoEstoque.alterarProduto(produtoDigitado);
                }
                case 4 -> System.out.println("Escolha um produto para excluir de seu estoque: ");
                case 0 -> System.out.println("\nSaindo...");
                default -> System.out.println("Opção inválida!");
            }
        }while(opcao != 0);

    }
}
