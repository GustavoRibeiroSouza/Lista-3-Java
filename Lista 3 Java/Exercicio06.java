//6) Elaborar um programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado �
//soma dos quadrados dos tr�s valores lidos.	 
package Exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
public static void main (String[]args){
	
Scanner sc = new Scanner(System.in);

double valor1,valor2,valor3,total1,total2,total3,total;

System.out.println("Digite o primeiro valor");
valor1= sc.nextInt();

System.out.println("Digite o segundo valor");
valor2= sc.nextInt();

System.out.println("Digite o terceiro valor");
valor3= sc.nextInt();

total1 = valor1*valor1;
total2 = valor2*valor2;
total3 = valor3*valor3;
total = total1+total2+total3 ; 

System.out.println(" A soma dos quadrados dos tr�s valores lidos � :" + total*total);
	
}}


