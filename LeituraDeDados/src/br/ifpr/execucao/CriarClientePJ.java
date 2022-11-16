package br.ifpr.execucao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.ifpr.modelo.ClientePJ;

public class CriarClientePJ {
	
	  public static void main(String[] args) throws  IOException {
		   BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		   
		   
		   System.out.println("Informe o CNPJ: ");
		   ClientePJ cliente = new ClientePJ();
		   String CNPJ = reader.readLine();
		   cliente.setCNPJ(CNPJ);
		   
		  
		   System.out.println("Informe o Razao Social : ");
		   String razaoSocial = reader.readLine();
		   cliente.setRazaoSocial(razaoSocial);
		   
		  
		  
		  
	  }

}
