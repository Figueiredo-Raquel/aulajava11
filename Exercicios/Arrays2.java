package Exercicios;

import java.util.*;

public class Arrays2 {
	
	public static void main(String[] args) {
		
	//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	//	� Os n�meros pares digitados;  
	//	� A soma dos n�meros pares digitados; 
	//	� Os n�meros �mpares digitados; 
	//	� A quantidade de n�meros �mpares digitados.

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
	        		  System.out.printf("O numero %d � par.\n",vetor[x]);
	        	  }
	        	  else if(vetor[x]<=0) {
	        		  System.out.println("Valor inv�lido.");
	        	  }
	        	  else
	        	  {
	        		  impar++;
	        		  cimpar+=vetor[x];
	        		  System.out.printf("O numero %d � impar.\n",vetor[x]);
	        	  }
	          }
	          
	          System.out.printf("\nA soma dos %d numeros pares digitados � de : %d \nA soma dos %d numeros �mpares digitado � de : %d ",par,cpar,impar,cimpar);
		   
		   
		   
		   
	ler.close();
	}
}
