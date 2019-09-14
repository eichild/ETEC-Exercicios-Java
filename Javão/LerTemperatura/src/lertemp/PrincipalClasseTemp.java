package lertemp;

public class PrincipalClasseTemp {
	
	public int grausC,grausF,resp;
	public void calcular(){
		
		//Faça uma classe que leia a temperatura em °F e mostre em °C (Obs: C=5*((F-32/9)
		grausC = 5*(grausF-32)/9;
		System.out.println("PROGRAMA TEMPERATURA °C:");
		System.out.println("Temperatura em °C é : "+grausC);
		
	}

}
