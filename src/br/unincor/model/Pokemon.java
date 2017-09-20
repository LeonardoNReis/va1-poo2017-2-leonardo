package br.unincor.model;

public class Pokemon {

	private String nome; // Nome do pokemon - sem validação
	private String tipo; // Tipo do pokemon - sem validação
	private Double peso; // Peso do pokemon - deve ser um valor positivo
	private Double altura; // Altura do pokemon - deve ser um valor positivo
	private Long cp; // Pontos de combate - deve ser um valor positivo

	public Pokemon(String nome, String tipo, Double peso, Double altura) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		if (peso <= 0) {
			this.peso = 5.;
		} else {
			this.peso = peso;
		}
		if (altura <= 0) {
			this.altura = 5.0;
		} else {
			this.altura = altura;
		}
		cp = (long) (Math.random() * 150);
		if (cp <= 0) {
			this.cp = 0L;
		} else {
			this.cp = cp;
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		if (peso <= 0) {
			this.peso = 4.;
		} else {
			this.peso = peso;
		}
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		if (altura <= 0) {
			this.altura = 1.0;
		} else {
			this.altura = altura;
		}
	}

	public Long getCp() {
		return cp;
	}

	public void setCp(Long cp) {
		cp = (long) (Math.random() * 150);
		if (cp <= 0) {
			this.cp = 5L;
		} else {
			this.cp = cp;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/** Implementar este método para retornar os dados do pokemon **/
	public String verDados() {
		return "Nome: " + this.getNome() + "\nTipo: " + this.nome + "\nPeso: " + this.peso + "\nAltura: " + this.altura
				+ "\nPontos de Combate: " + this.cp;
	}
}
