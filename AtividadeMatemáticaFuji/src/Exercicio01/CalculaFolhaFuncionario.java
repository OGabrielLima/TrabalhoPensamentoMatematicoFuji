package Exercicio01;

import java.util.Scanner;

public class CalculaFolhaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe seu salário: ");
		
		float valorSalario = leitor.nextFloat();
		funcionario.setSalario(valorSalario);
		
		System.out.println("Informe o % de aumento");
		float valorAumento = leitor.nextFloat();
		funcionario.setAumento(valorAumento);
		
		float salarioAumentado = funcionario.calculaAumento(valorSalario, valorAumento);
		float valorDoAumento = valorSalario - salarioAumentado; 
		System.out.println("Valor do aumento" +  valorDoAumento );
		System.out.println("Salario com aumento: R$"+ salarioAumentado);
		
		
	}
}
