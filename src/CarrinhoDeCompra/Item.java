package CarrinhoDeCompra;
public class Item {
    protected String name;
    protected double preco;
    protected int quantidade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Item(int quantidade, double preco, String name) {
        this.quantidade = quantidade;
        this.name = name;
        this.preco = preco;

    }
}





