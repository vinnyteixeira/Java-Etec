package javaExercicios;

import java.util.Scanner;

public class javaExercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		int numAnt;
		int numSuc;
		
		System.out.println("Digite um numero inteiro");
		num = ler.nextInt();
		
		System.out.println("Numero: "+num);
		
		numAnt = num - 1;
		
		System.out.println("Numero antecessor: "+numAnt);
		
		numSuc = num + 1;
		
		System.out.println("Numero sucessor: "+numSuc);
		
	}

}
