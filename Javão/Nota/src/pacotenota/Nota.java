package pacotenota;

public class Nota {

public int nota1,nota2,nota3,nota4,resultado;
public String nome;

	
	
	public void realizaOperacao(){
		resultado = (nota1 + nota2 + nota3 + nota4)/4;
       
	}
	public void imprimir(){
		System.out.println("Programa Média Nota\n");
		System.out.println("Média: "+resultado);
		System.out.println("Processamento Finalizado!!");
		
	}
	
	
	
	
	
	
	
	

}
