package pacotenota;

public class Nota {

public int nota1,nota2,nota3,nota4,resultado;
public String nome;

	
	
	public void realizaOperacao(){
		resultado = (nota1 + nota2 + nota3 + nota4)/4;
       
	}
	public void imprimir(){
		System.out.println("Programa M�dia Nota\n");
		System.out.println("M�dia: "+resultado);
		System.out.println("Processamento Finalizado!!");
		
	}
	
	
	
	
	
	
	
	

}
