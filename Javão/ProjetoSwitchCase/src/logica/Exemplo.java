package logica;

import javax.swing.JOptionPane;

public class Exemplo {

	
	public void exemploIf(){
	int val = 10;
	
	if ((val == 10) || val ==20){
		
	}
	else if (val ==20){
		
	}
	String nome = "Etec";
	String escola = "Franco";
	if (nome.equals("Etec")){
	JOptionPane.showMessageDialog(null, "OBA");
	}
	else{
		
		JOptionPane.showMessageDialog(null, "!OBA");
	}
	}

	public void exemploCase(){
		JOptionPane.showMessageDialog(null, "1 - Azul \n2 - Verde \n3 - Vermelho");
		int op = Integer.parseInt(JOptionPane.showInputDialog("Dígite sua opc")); //receber
	switch (op) {
	case 1:
		System.out.println("Você escolheu a cor azul");
		break;
	case 2:
		System.out.println("Você escolheu a cor verde");
		break;
	case 3:
		System.out.println("Você escolheu a cor vermelho");
		break;
	default:
		System.out.println("Escolha um valor entre 1 a 3");
		break;
	}
	
	
	
	
	
	}
}
