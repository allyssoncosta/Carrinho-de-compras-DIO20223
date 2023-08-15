package CarrinhoDeCompra;
public class Main {
    public static void main(String[] args) {
CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionarItem("Camiseta nike", 2, 29.99);
        carrinho.adicionarItem("tenis nike", 1, 150.50);
        carrinho.adicionarItem("bermuda nike", 1, 69.90);

        carrinho.exibirItens();
    }
}