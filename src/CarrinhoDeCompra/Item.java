package CarrinhoDeCompra;
public class Item {
    protected String name;
    protected double preco;
    protected int quantidade;

    public Item(int quantidade, double preco, String name) {
        this.quantidade = quantidade;
        this.name = name;
        this.preco = preco;

    }
}





