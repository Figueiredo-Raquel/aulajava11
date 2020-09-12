package Exercicios;

import java.util.*;

public class Arrays3 {

	public static void main(String[] args) {
		
	//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	
		Scanner ler = new Scanner (System.in);
		Random gerador = new Random ();
		
		
		int [][] matriz = new int [3][3];
		int linha=0, coluna=0, soma=0, numero=0;
		final int tam=3;
		
		//preenchendo matriz
		for(linha=0; linha<tam;linha ++)
		{
			 System.out.printf("|");
			 
			for(coluna=0; coluna<tam;coluna ++) 
			{
				numero=gerador.nextInt(3)+1;
				matriz[linha][coluna]= numero;
				
				System.out.print(matriz[linha][coluna]);
				System.out.print("|");
			}
			
		}//contagem
		for(linha=0; linha<tam;linha ++)
		{
			for(coluna=0; coluna<tam;coluna ++) {
				if(matriz[linha][coluna]>10) {
					soma++;
				}	     
			}
		}
		System.out.println("\n");  
		 System.out.printf("Todos os valores maior que dez são: %d",soma);
		
		
		
		
		
		
	ler.close();
	}

}
