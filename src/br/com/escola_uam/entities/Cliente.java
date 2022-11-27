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
	
	

}
