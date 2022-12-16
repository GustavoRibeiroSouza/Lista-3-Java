//2) Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da 
//fórmula 
//VOLUME=COMPRIMENTO * LARGURA * ALTURA. 
package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

public static void main (String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Digite o comprimento ds caixa");

int comprimento= sc.nextInt();

System.out.println("Digite a largura da caixa");

int largura= sc.nextInt();

System.out.println("Digite a altura da caixa");

int altura= sc.nextInt();

System.out.println("O volume da caixa é de :" + comprimento*largura*altura + "M3");

}}
