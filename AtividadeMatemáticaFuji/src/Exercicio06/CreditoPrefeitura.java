package Exercicio06;

import java.util.Scanner;

public class CreditoPrefeitura {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe seu salário: ");
		Float salario = leitor.nextFloat();
		System.out.println("Informe o valor da parcela");
		Float parcela = leitor.nextFloat();
		if((salario * 0.3) >= parcela) {
			System.out.println("Este emprestimo pode ser concedido. ");
		} else {
			System.out.println("Este emprestimo não pode ser concedido. ");
		}
	}
}
