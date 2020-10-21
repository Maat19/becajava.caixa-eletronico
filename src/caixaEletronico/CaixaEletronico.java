package caixaEletronico;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		// exercicio para sacar dinheiro.
		
	         Scanner leitura = new Scanner(System.in);
	         
	         int valor;
	         
	         int nota200 = 0;
	         int nota100 = 0;
	         int nota50 = 0;
	         int nota20 = 0;
	         int nota10 = 0;
	         int nota5 = 0;
	         int nota2 = 0;
	         int nota1= 0;

	         System.out.println("digite o valor a ser sacado:");
	         valor = leitura.nextInt();

	         while(valor != 0) {

	         if (valor >= 200) {
	             valor = valor -200;
	             nota200 ++;

	         }
	         else if (valor >= 100) {
	             valor = valor -100;
	             nota100 ++;

	         }
	         else if (valor >= 50) {
	             valor = valor -50;
	             nota50 ++;

	         }
	         else if (valor >= 20) {
	             valor = valor -20;
	             nota20 ++;

	         }
	         else if (valor >= 10) {
	             valor = valor -10;
	             nota10 ++;

	         }
	         else if (valor >= 5) {
	             valor = valor -5;
	             nota5 ++;

	         }
	         else if (valor >= 2) {
	             valor = valor -2;
	             nota2 ++;
	             {
	            	 
	             }
	            	            }
	             
	        else if (valor >= 1) {
		       valor = valor -1;
		         nota1 ++;
		             

	         }


	        }

	        System.out.println(nota200 + " notas de R$200,00");
	        System.out.println(nota100 + " notas de R$100,00");
	        System.out.println(nota50 + " notas de R$50,00");
	        System.out.println(nota20 + " notas de R$20,00");
	        System.out.println(nota10 + " notas de R$10,00");
	        System.out.println(nota5 + " notas de R$5,00");
	        System.out.println(nota2 + " notas de R$2,00");
	        System.out.println(nota1 + " notas de R$1,00");

	}}
		
		
	
			


	
	
		


		