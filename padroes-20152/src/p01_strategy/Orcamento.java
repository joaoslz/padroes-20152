package p01_strategy;

import java.util.LinkedHashSet;
import java.util.Set;

public class Orcamento {
	
	private final Set<Item> itens;
	
	public Orcamento() {
		itens = new LinkedHashSet<>();
	}
	

	public double getValorTotal() {
		double valorTotal = 0;
		for (Item item : itens) {
			valorTotal += item.getValorTotal();
		}
		return valorTotal;
	}

	public boolean adicionaItem(Item item) {
		return itens.add(item);
	}


	public int getQuantidadeDeItens() {
		return itens.size();
	}

}
