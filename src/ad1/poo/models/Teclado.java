package ad1.poo.models;

public class Teclado extends Produto{

	public Teclado(String descricao, Double preco) {
		super(descricao, preco);
	}

	@Override
	public String toString() {
		return "Teclado [nome = " + getDescricao() + ", preco: R$" + getPreco() + "]";
	}

}
