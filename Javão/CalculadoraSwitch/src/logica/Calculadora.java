package logica;

import javax.swing.JOptionPane;

public class Calculadora {
 
	public int val1, val2,escolha, res;
	
	public void escolha(){
		
		escolha = Integer.parseInt(JOptionPane.showInputDialog("D�gite a opera��o desejada - \n 1. Soma \n 2. Subtra��o  \n 3. Divis�o \n 4. Multiplica��o"));
	switch (escolha) {
	case 1:
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = val1 +val2;
		System.out.println("O resultado da opera��o � :" +res);
		break;

	case 2:
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = val1 - val2;
		System.out.println("O resultado da opera��o � :" +res);
		break;
		
	case 3:
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = val1 / val2;
		System.out.println("O resultado da opera��o � :" +res);
		break;
		
	case 4:
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = val1 * val2;
		System.out.println("O resultado da opera��o � :" +res);
		break;
		
	default:
		System.out.println("Erro no processamento!!");
		break;
	}
	}
}
