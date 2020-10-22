package caixaEletronico;

import java.util.Scanner;

public class Produto {
		
	public int Valor;
	public int Nota200;
	public int Nota100;
	public int Nota50;
	public int Nota20;
	public int Nota10;
	public int Nota5;
	public int Nota2;
	public int Nota1;
	public Scanner Leitura = new Scanner(System.in);
	
	public void ObterSaque () {
		System.out.println("Digite o valor a ser sacado:");
	    Valor = Leitura.nextInt();}
	
	public void Dinheiro () {
		
		 while(Valor != 0) {

	         if (Valor >= 200) {
	             Valor = Valor -200;
	             Nota200 ++;}

	         else if (Valor >= 100) {
	             Valor = Valor -100;
	             Nota100 ++; }
	         
	         else if (Valor >= 50) {
	             Valor = Valor -50;
	             Nota50 ++; }
	         
	         else if (Valor >= 20) {
	             Valor = Valor -20;
	             Nota20 ++; }
	         
	         else if (Valor >= 10) {
	             Valor = Valor -10;
	             Nota10 ++; }
	         
	         else if (Valor >= 5) {
	             Valor = Valor -5;
	             Nota5 ++; }
	         
	         else if (Valor >= 2) {
	             Valor = Valor -2;
	             Nota2 ++; }

	         else if (Valor >= 1) {
	             Valor = Valor -1;
	             Nota1 ++; }
		 }
	}
	        
		 
		 public void Total() 
		 
		 {
					if(Nota200 >0) {
			        System.out.println(Nota200 + " x de R$200,00");}
			         
			         if(Nota100 >0) {
			        System.out.println(Nota100 + " x de R$100,00");}
			         
			         if (Nota50 >0) {
			        System.out.println(Nota50 + " x de R$50,00");}
			         
			         if (Nota20 >0) {
			        System.out.println(Nota20 + " x de R$20,00");}
			         
			         if (Nota10 >0) {
			        System.out.println(Nota10 + " x de R$10,00");}
			         
			         if (Nota5 >0) {
			        System.out.println(Nota5 + " x de R$5,00");}
			         
			         if(Nota2 >0) {
			        System.out.println(Nota2 + " x de R$2,00");}
			         
			         if (Nota1 >0) {
			        System.out.println(Nota1 + " x de R$1,00");}
		 }
		 }
