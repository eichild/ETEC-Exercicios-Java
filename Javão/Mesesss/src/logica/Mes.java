package logica;

import javax.swing.JOptionPane;

public class Mes {
	
		public int month;
		
		public void Meses(){
			
			month = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:\n" +
			"1.\n 2.\n3.\n4.\n5.\n6.\n.\n7.\n8.\n.\n9.\n10.\n11.\n12."));
			
			switch (month) {
			case 1:
				System.out.println("Mês 1 é Janeiro");
				break;
			case 2:
				System.out.println("Mês 2 é Fevereiro");
				break;
			case 3:
				System.out.println("Mês 3 é Março");
				break;
			case 4:
				System.out.println("Mês 4 é Abril");
				break;
			case 5:
				System.out.println("Mês 5 é Maio");
				break;
			case 6:
				System.out.println("Mês 6 é Junho");
				break;
			case 7:
				System.out.println("Mês 7 é Julho");
				break;
			case 8:
				System.out.println("Mês 8 é Agosto");
				break;
			case 9:
				System.out.println("Mês 9 é Setembro");
				break;
			case 10:
				System.out.println("Mês 10 é Outubro");
				break;
			case 11:
				System.out.println("Mês 11 é Novembro");
				break;
			case 12:
				System.out.println("Mês 12 é Dezembrov");
				break;

			default:System.out.println("Erro de processamento...");
				break;
			}
		}
}
