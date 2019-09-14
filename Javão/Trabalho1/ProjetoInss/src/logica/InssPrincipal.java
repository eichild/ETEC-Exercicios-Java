package logica;

public class InssPrincipal {

	public static void main(String[] args) {
		Inss objPagamento =new Inss();
		
		objPagamento.nome = "Rodrigo";
		
		objPagamento.salario = 1000;
		
		objPagamento.realizaOperacao();
		
		objPagamento.imprimir();
		
		
	}
}
