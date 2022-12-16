//7) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado o 
//quadrado da soma dos três valores lidos. 
package Exercicios;
import java.util.Scanner;
public class Exercicio07 {

public static void main (String[]args){
		
Scanner sc = new Scanner(System.in);

double valor1,valor2,valor3,total;

System.out.println("Digite o primeiro valor");
valor1= sc.nextInt();

System.out.println("Digite o segundo valor");
valor2= sc.nextInt();

System.out.println("Digite o terceiro valor");
valor3= sc.nextInt();

total = valor1 + valor2 + valor3 ;

System.out.println("O quadrado da soma dos três valores lidos é:" + total*total);
			
}
}