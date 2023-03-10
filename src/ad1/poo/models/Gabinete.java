package ad1.poo.models;

public class Gabinete {

	private String nome;
	private Processador processador;
	private Placa placa;

	public Gabinete(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}


	public Placa getPlaca() {
		return placa;
	}

	public void setPlaca(Placa placa) {
		this.placa = placa;
	}

	public void inclui(Processador processador) {
		setProcessador(processador);

	}

	public void inclui(Placa placa) {
		setPlaca(placa);
	}

	@Override
	public String toString() {
		return "Gabinete [nome = " + nome + ", processador = " + processador + ", placa=" + placa + "]";
	}
	
}
