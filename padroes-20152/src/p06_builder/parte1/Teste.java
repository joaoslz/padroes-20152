package p06_builder.parte1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

class Teste {
	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		builder.paraEmpresa("Empresa XYZ").comCnpj("23.456.789/0001-12").comItem(new Item("Monitor", 500))
				.comItem(new Item("Ultrabook", 2500)).comItem(new Item("Tablet", 1500))
				.comObservacoes("Observação qualquer").naDataAtual();

		NotaFiscal notaFiscal = builder.constroi();

		List<Item> itens = Arrays.asList(new Item("Monitor", 500), new Item("Ultrabook", 2500),
				new Item("Tablet", 1500));
		double valorTotal = 0;

		for (Item item : itens) {
			valorTotal += item.getValorUnitario();
		}
		double impostos = valorTotal * 0.05;

		NotaFiscal nf = new NotaFiscal("razao social qualquer", "um cnpj", Calendar.getInstance(), valorTotal, impostos,
				itens, "observacoes quaisquer aqui");
	}
}
