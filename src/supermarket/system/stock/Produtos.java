package supermarket.system.stock;

import java.util.Scanner;

public class Produtos {
    Scanner sc = new Scanner(System.in);

    String nomeDoProduto;
    double valor;
    int quantidade;
    String validade;

    //Constructors
    public Produtos(){

    }

    public Produtos(String nomeProduto, double valor, int quantidade, String validade){
        setNomeDoProduto(nomeProduto);
        setValor(valor);
        setQuantidade(quantidade);
        setValidade(validade);
    }

    //Getters and Setters
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeProduto) {
        this.nomeDoProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void criarListaDeProdutos(){
        System.out.println("\nProduto: " + this.nomeDoProduto);
        System.out.printf("Valor: R$%.2f", this.valor);
        System.out.println("\nQuantidade: " + this.quantidade);
        System.out.println("Validade: " + this.validade);
    }
}
