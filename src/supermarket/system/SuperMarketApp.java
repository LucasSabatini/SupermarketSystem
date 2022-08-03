package supermarket.system;

import supermarket.system.stock.Produtos;

public class SuperMarketApp {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Arroz", 15.00, 4, "06/06/2026");
        System.out.println(produto1.getNomeDoProduto());
    }

}