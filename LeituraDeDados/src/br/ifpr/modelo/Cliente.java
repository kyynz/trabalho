package br.ifpr.modelo;

public abstract class Cliente {
	 private Integer  idCliente;
	 private String nome ;
	 private String endereco;
	 private String cidade;
	 private String uf;
	 
	 public abstract String  getNrodoc();
	 
	 public Integer getIdCliente() { 
		 return idCliente;
	 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	 
		 

}
