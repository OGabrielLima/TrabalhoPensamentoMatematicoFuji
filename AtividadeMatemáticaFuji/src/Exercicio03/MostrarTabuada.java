package Exercicio03;

import java.util.Scanner;

public class MostrarTabuada {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o número imprimir a taboada: ");
		int num = leitor.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(i+"*"+num+"="+i*num);
		}
	}
}
