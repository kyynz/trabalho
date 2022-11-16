package br.ifpr.execucao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.ifpr.modelo.ClientPF;

public class CriarClientePF {
	public static void main(String [] args) throws IOException { 
		BufferedReader reader =
		new BufferedReader(new InputStreamReader(System.in));
		  
		  ClientPF cliente = new ClientPF();
 		  System.out.println("Informe o CPF ");
		  String CPF = reader.readLine();
		   cliente.setCPF(CPF);
		   
		   
		    
	 	 System.out.println("Informe a Idade ");
		String idade = reader.readLine();
		cliente.setIdade(Integer.parseInt(idade));
			   
			  
		System.out.println("informe o ID do Cliente : ");
		 String idCliente = reader.readLine();
		cliente.setIdCliente(Integer.parseInt(idCliente));
			
			
			
		System.out.println("Informe a Nome: ");
		String nome = reader.readLine();
		cliente.setNome(nome);
			   
			   
			   
			   
		System.out.println("Informe a Endereço: ");
		String endereco = reader.readLine();
		cliente.setEndereco(endereco);
				   
				   
	    System.out.println("Informe a Cidade: ");
		String cidade = reader.readLine();
		cliente.getCidade();
					   
		
	    System.out.println("Informe a Unidade Federativa: ");
		String uf = reader.readLine();
		cliente.setUf(uf);
		
		System.out.println(cliente.retornaDadosCliente());
		
		
			
			
          		  
		
		     
		   
		
		
	}

}
