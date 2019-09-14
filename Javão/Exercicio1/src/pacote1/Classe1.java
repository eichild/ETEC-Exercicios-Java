package pacote1;


public class Classe1 {
	public int calculo1,calculo2, resultado;
	


	public void imprimir(){
		resultado = calculo1 + calculo2;
		System.out.println("Soma: "+ resultado);
		
		resultado = calculo1 / calculo2;
		System.out.println("Divisão: "+ resultado);
		
		resultado = calculo1 * calculo2;
		System.out.println("Multiplicação: "+ resultado);
		
		resultado = calculo1 - calculo2;
		System.out.println("Subtração: "+ resultado);
		
		System.out.println("Fim do processamento! ");
	
	
	}
	
}


