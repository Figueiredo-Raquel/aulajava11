package Exercicios;

import java.util.*;

public class Arrays2 {
	
	public static void main(String[] args) {
		
	//2- Faça um programa que receba 6 números inteiros e mostre: 
	//	• Os números pares digitados;  
	//	• A soma dos números pares digitados; 
	//	• Os números ímpares digitados; 
	//	• A quantidade de números ímpares digitados.

	    int[] vetor = new int[6];
	    int par=0, impar=0, cpar=0,cimpar=0,x=0;
	      
		   Scanner ler = new Scanner (System.in);
	
	      for(x=0; x<vetor.length;x++) {
	    	  System.out.printf("Digite %d numero :",x);
	    	  vetor[x]=ler.nextInt();
	      }
	          System.out.printf("\n");
	          for(x=0;x<vetor.length;x++)
	          {
	        	  if(vetor[x]%2==0 && vetor[x]!=0) {
	        		  par++;
	        		  cpar+=vetor[x];
	        		  System.out.printf("O numero %d é par.\n",vetor[x]);
	        	  }
	        	  else if(vetor[x]<=0) {
	        		  System.out.println("Valor inválido.");
	        	  }
	        	  else
	        	  {
	        		  impar++;
	        		  cimpar+=vetor[x];
	        		  System.out.printf("O numero %d é impar.\n",vetor[x]);
	        	  }
	          }
	          
	          System.out.printf("\nA soma dos %d numeros pares digitados é de : %d \nA soma dos %d numeros ímpares digitado é de : %d ",par,cpar,impar,cimpar);
		   
		   
		   
		   
	ler.close();
	}
}
