package nomemedia;

public class ClassePrincipal {
	
	public int not1,not2,not3,not4,resp;
	public String nome;
	
	public void Notas(){
		resp = (not1+not2+not3+not4)/4;
		System.out.println("PROGRAMA NOME NOTA:");
		System.out.println("A média das notas é: "+resp);;
		System.out.println("Nome do Aluno: "+nome);
	}
	
}
