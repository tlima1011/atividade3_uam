package br.com.escola_uam.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	
	private String nome; 
	private int anoNascimento; 
	private Double gasto;

	public Cliente() { 
		
	}

	public Cliente(String nome, int anoNascimento, Double gasto) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.gasto = gasto;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public Double getGasto() {
		return gasto;
	}

	public void setGasto(Double gasto) {
		this.gasto = gasto;
	}

	public static void menu() { 
		        System.out.println("-----------------------------CADASTRO DE CLIENTES-------------------------------");
		        System.out.println("[ 1 ] - Incluir um novo cliente ");
		        System.out.println("[ 2 ] - Remover cliente");
		        System.out.println("[ 3 ] - Zerar todos os montantes de compras por ocasião da virada de mês");
		        System.out.println("[ 4 ] - Exibir um montante de compras de um cliente específico");
		        System.out.println("[ 5 ] - Listar clientes");
		        System.out.println("[ 6 ] - Informar melhor comprador");
		        System.out.println("[ 7 ] - Sair");
		        System.out.println("--------------------------------------------------------------------------------");
		        System.out.print("Opção: ");      
	}

	
	public static void listarClientes(ArrayList<Cliente> clientes) {  
		for(int i = 0; i < clientes.size();i++) {
			System.out.println("Nome: " +clientes.get(i).nome + "\tAno de Nascimento: " +clientes.get(i).anoNascimento + "\tValor Gasto R$"+String.format("%.2f", clientes.get(i).gasto));
		}
	}
}
	
	
	


