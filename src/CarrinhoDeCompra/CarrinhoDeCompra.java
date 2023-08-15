package CarrinhoDeCompra;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompra{
    public List<Item> itens;//class Item dentro do diamante.

    public void CarrinhoDeCompras(){

        this.itens = new ArrayList();
    }
public void adicionarItem(String name, int quantidade, double preco){
        Item novoItem = new Item(quantidade, preco, name);
        itens.add(novoItem);
}
public void removerItem(String name, int quantidade, double preco){
        List<Item> removerItem = new ArrayList<>();
        for(Item t: itens){
if(t.getName().equalsIgnoreCase(name)){
 removerItem.add(t);
}
        }
}
public double CalcularValorTotal(){
        double total = 0;
        for(Item e : itens){
            total += e.getPreco() * e.getQuantidade();
        }
    return total;
}
public void exibirItens(){
    System.out.println("itens no carrinho: ");
    for(Item b : itens){
        System.out.println("Nome: " + b.getName() + "| Preço: " + b.getPreco() + "| Quantidade: " + b.getQuantidade());
    }
}

}