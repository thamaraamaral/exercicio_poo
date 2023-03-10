package ad1.poo.models;

public class Monitor extends Produto {

	private Double resolucaoEmPolegadas;
	

	public Monitor(String descricao, Double resolucaoEmPolegadas,Double preco) {
		super(descricao, preco);
		this.resolucaoEmPolegadas = resolucaoEmPolegadas;
	}

	public Double getResolucaoEmPolegadas() {
		return resolucaoEmPolegadas;
	}

	public void setResolucaoEmPolegadas(Double resolucaoEmPolegadas) {
		this.resolucaoEmPolegadas = resolucaoEmPolegadas;
	}

	@Override
	public String toString() {
		return "Monitor [nome = " + getDescricao() + ", resolução em polegadas = " + getResolucaoEmPolegadas()
				+ " in, preco: R$ " + getPreco() + "]";
	}
		
}