import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> itens;

    public Carrinho(){
        this.itens = new ArrayList<>();
    }
    public void adicionarProduto(Produto p){
        itens.add(p);
    }
    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }
}
