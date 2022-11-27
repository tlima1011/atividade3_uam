package br.com.escola_uam.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.escola_uam.entities.Cliente;

public class Main {

	 	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		
		ArrayList <Cliente> clientes = new ArrayList<Cliente>(); 
		
		int opcao = 0;	
		Character repetir; 
		
		
		do { 
			Cliente.menu();
			opcao = ler.nextInt();
			ler.nextLine(); 
	        System.out.println("----------------------------------------------------------------------------------");
	        switch(opcao){
	            case 1:
	            	System.out.println("****INCLUSÃO DE CLIENTES****");
		            do {
		            		System.out.print("Nome: ");
			                String nome = ler.nextLine(); 
			                System.out.print("Ano de Nascimento: ");
			                int ano = ler.nextInt(); 
			                System.out.print("Montante Gasto em R$");
			                double gasto =ler.nextDouble(); 
			                nome = nome.toUpperCase(); 
			                nome = nome.trim(); 
			                clientes.add(new Cliente(nome, ano, gasto));
			                System.out.print("Cadastrar outro cliente? [S/N]: ");
		            		repetir = ler.next().charAt(0); 
		            		repetir = repetir.toUpperCase(repetir);
		            		if(repetir == 'N') {
		            			break; 
		            		}
		            		ler.nextLine();
		            }while(repetir == 'S');
		        break;
	            case 2:
	                //apagarCliente();
	            break;
	            case 3:
	                //apagarMontate();
	                break;
	            case 4:
	                //printf("Exibir um montante de compras de um cliente específico\n");
	                //montanteCliente();
	                break;
	            case 5:
	                Cliente.listarClientes(clientes);
	                break;
	            case 6:
	                //printf("Melhor comprador");
	                break;
	        }
	    }while(opcao != 7);
		ler.close();
	}

}
