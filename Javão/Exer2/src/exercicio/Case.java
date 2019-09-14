package exercicio;

import javax.swing.JOptionPane;

public class Case {

	public int escolha, quant;
	public float res;;

	public void Escolha() {

		System.out.println("--Lista de  produtos--");

		escolha = Integer.parseInt(JOptionPane.showInputDialog("Dígite o produto desejado - \n "
				+ "1. Refrigerante - R$10,00 \n2. Cachorro quente - R$15,00 \n3. Pizza - R$45,00 \n4. Paçoca - R$1,50"));
		switch (escolha) {
		case 1:

			quant = Integer.parseInt(JOptionPane.showInputDialog("Dígite a quantidade desejada"));
			res = quant * 10;
			System.out.println("O valor a ser pago é :" + res);
			break;
		case 2: 
			quant = Integer.parseInt(JOptionPane.showInputDialog("Dígite a quantidade desejada"));
			res = quant * 15;
			System.out.println("O valor a ser pago é :" + res);
			break;
		
		case 3: 
			quant = Integer.parseInt(JOptionPane.showInputDialog("Dígite a quantidade desejada"));
			res = quant * 45;
			System.out.println("O valor a ser pago é :" + res);
			break;
		
		case 4: 
			quant = Integer.parseInt(JOptionPane.showInputDialog("Dígite a quantidade desejada"));
			res = quant * 1.5f;
			System.out.println("O valor a ser pago é :" + res);
			break;
		
		default:
			System.out.println("Erro de processamento");
		
			break;
		}
	}
}
