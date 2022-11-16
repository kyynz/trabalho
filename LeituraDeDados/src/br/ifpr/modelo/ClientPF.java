package br.ifpr.modelo;

public class ClientPF extends Cliente {
	
	  private String CPF;
	  private Integer idade;
	    	
	
	public String getNrodoc() {
		return CPF;
	}


	public String getCPF() {
		return CPF;
	}



	public void setCPF(String cPF) {
		CPF = cPF;
	}



	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String retornaDadosCliente() {
		String dados = "\nCPF: " + this.CPF;
		dados +=  "\nIdade: " + this.idade;
		dados +=  "\nNome: " + this.getNome();
		dados +=  "\nIdade: " + this.idade;
		dados +=  "\nIdade: " + this.idade;
		dados +=  "\nIdade: " + this.idade;
		
		
		return dados;
		
		
		
		
	}
	

}

