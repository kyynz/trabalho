package br.ifpr.modelo;

public class ClientePJ extends Cliente {
	 private String CNPJ;
	 private String razaoSocial;
	 
	
	
	
	public String getNrodoc() {
		return CNPJ;
		

}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String retornaDadosClientePJ() {
		String dados = "\nCPF: " + this.CNPJ;
		dados +=  "\nIdade: " +  this.razaoSocial;
		
		return dados;
	
}
	
}

