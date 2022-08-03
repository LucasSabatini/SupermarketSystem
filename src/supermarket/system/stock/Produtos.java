package supermarket.system.stock;

public class Produtos {

    String nomeDoProduto;
    double valor;
    int quantidade;
    String validade;

    //Constructors
    public Produtos(){}

    public Produtos(String nomeDoProduto, double valor, int quantidade, String validade){
        this.nomeDoProduto = nomeDoProduto;
        this.valor = valor;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    //Getters and Setters
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
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

}
