package br.com.alura.cliente;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws Exception {
		
		
		
		
		String conteudo = Request
		.Post("http://localhost:8080/gerenciador/empresa")
		.addHeader("Accept", "application/json")
		.execute() //executar o posto
		.returnContent() //aguardar o json
		.asString(); //retorno em string
		
		System.out.println(conteudo);
	}

}
