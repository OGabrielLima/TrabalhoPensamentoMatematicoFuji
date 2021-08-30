package Exercicio01;

public class Funcionario {
	private float aumento;
	private float salario;
	
	public float getAumento() {
		return aumento;
	}
	
	public void setAumento(float aumento) {
		this.aumento = aumento;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float calculaAumento(float salario, float aumento) {
		float aumentarSalarioEm = salario * (aumento/100);
		float novoSalario = aumentarSalarioEm + salario;
		return novoSalario;
	}
	
}
