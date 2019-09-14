package logica;

public class Inss {
	public float salario;
	public float desconto;
	public float salarioLiquido;
	public String nome;
	
	public void realizaOperacao(){
		desconto = salario * 0.11f;
		salarioLiquido = salario - desconto;
	}
	
	public void imprimir(){
		System.out.println("Resultado da Operação: ");
		System.out.println("Nome do Funcionario: " + nome);
		System.out.println("Salario Bruto: " + salario);
		System.out.println("Desconto Inss: " + desconto);
		System.out.println("Salario Liquido: " + salarioLiquido);
		System.out.println("Fim do processamento! ");
	}
	
}
