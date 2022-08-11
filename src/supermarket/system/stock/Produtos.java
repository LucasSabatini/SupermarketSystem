package supermarket.system.stock;

public class Produtos {

    private String nomeDoProduto;
    private double valor;
    private int quantidade;

    //Constructors
    public Produtos(){

    }

    public Produtos(String nomeProduto, double valor, int quantidade){
        setNomeDoProduto(nomeProduto);
        setValor(valor);
        setQuantidade(quantidade);
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

    public void criarListaDeProdutos(){
        System.out.println("\nProduto: " + this.getNomeDoProduto());
        System.out.printf("Valor: R$%.2f", this.getValor());
        System.out.println("\nQuantidade: " + this.getQuantidade());
    }
}
