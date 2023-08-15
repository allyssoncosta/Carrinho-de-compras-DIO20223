package CarrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    List<Item> itens;

    public CarrinhoDeCompra() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String name, int quantidade, double preco) {
        Item novoItem = new Item(quantidade, preco, name);
        itens.add(novoItem);
        System.out.println("Item adicionado: " + name);
    }

    public void removerItem(String name) {
        List<Item> removerItem = new ArrayList<>();
        for (Item t : itens) {
            if (t.name.equalsIgnoreCase(name)) {
                removerItem.add(t);
                System.out.println("Item removido: " + name);
            }
        }
    }

    public double CalcularValorTotal() {
        double total = 0;
        for (Item e : itens) {
            total += e.preco * e.quantidade;
        }
        return total;
    }

    public void exibirItens() {
        System.out.println("itens no carrinho: ");
        for (Item b : itens) {
            System.out.println("Nome: " + b.name + "| Preço: " + b.preco + "| Quantidade: " + b.quantidade);
        }
    }
}