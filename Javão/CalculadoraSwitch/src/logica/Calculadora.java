package logica;

import javax.swing.JOptionPane;

public class Calculadora {
 
	public int val1, val2,escolha, res;
	
	public void escolha(){
		
		escolha = Integer.parseInt(JOptionPane.showInputDialog("Dígite a operação desejada - \n 1. Soma \n 2. Subtração  \n 3. Divisão \n 4. Multiplicação"));
	switch (escolha) {
	case 1:
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = val1 +val2;
		System.out.println("O resultado da operação é :" +res);
		break;

	case 2:
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = val1 - val2;
		System.out.println("O resultado da operação é :" +res);
		break;
		
	case 3:
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = val1 / val2;
		System.out.println("O resultado da operação é :" +res);
		break;
		
	case 4:
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = val1 * val2;
		System.out.println("O resultado da operação é :" +res);
		break;
		
	default:
		System.out.println("Erro no processamento!!");
		break;
	}
	}
}
