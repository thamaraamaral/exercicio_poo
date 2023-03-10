package ad1.poo.models;

public class Placa {

	private String descricao;
	private Integer capacidadeEmGigabyte;
	private Double preco;
	
	public Placa(String descricao, Integer capacidadeEmGigabyte, Double preco) {
		super();
		this.descricao = descricao;
		this.capacidadeEmGigabyte = capacidadeEmGigabyte;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCapacidadeEmGigabyte() {
		return capacidadeEmGigabyte;
	}

	public void setCapacidadeEmGigabyte(Integer capacidadeEmGigabyte) {
		this.capacidadeEmGigabyte = capacidadeEmGigabyte;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Placa [descricao=" + descricao + ", capacidadeEmGigabyte=" + capacidadeEmGigabyte + ", preco=" + preco
				+ "]";
	}

}
