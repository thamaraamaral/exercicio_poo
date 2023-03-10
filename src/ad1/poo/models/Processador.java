package ad1.poo.models;

public class Processador extends Produto {

	public Processador(String descricao, Double preco) {
		super(descricao, preco);
	}

	@Override
	public String toString() {
		return "Processador [nome =" + getDescricao() + ", preco = R$ " + getPreco() + "]";
	}
	
}
