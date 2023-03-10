package ad1.poo.models;

public class Memoria extends Placa {

	public Memoria(String descricao, Integer capacidadeEmGigabyte, Double preco) {
		super(descricao, capacidadeEmGigabyte, preco);
		
	}

	@Override
	public String toString() {
		return "Memoria [nome = " + getDescricao() + ", capacidade em GB = " + getCapacidadeEmGigabyte()
				+ "GB, preço = R$ " + getPreco() + "]";
	}
		
}