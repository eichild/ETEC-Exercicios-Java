package exercicio1;

import java.util.Scanner;

public class Cadastro {

	public String nome,  senha;


public void Receber(){
	//Método de fazer com JOption
	//nome = JOptionPane.showInputDialog("Dígite o usuario");
	//senha = JOptionPane.showInputDialog("Dígite a senha");
	
	System.out.println("Dígite o nome de usuario");
	Scanner ler = new Scanner(System.in);
	String nome=ler.nextLine();
	
	System.out.println("Digite a senha ");
	Scanner read= new Scanner(System.in);
	String senha=ler.nextLine();
//public void verificar({

 if (nome.equals("etec")&& (senha.equals("franco")) ){
	 //JOptionPane.showMessageDialog(null,"Seja bem vindo")
	 System.out.println("Seja bem-vindo!!");
 }
 else{
	 System.out.println("Usuario e senha incorretos");
 }
}
}