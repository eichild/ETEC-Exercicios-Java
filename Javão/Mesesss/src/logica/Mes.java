package logica;

import javax.swing.JOptionPane;

public class Mes {
	
		public int month;
		
		public void Meses(){
			
			month = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s:\n" +
			"1.\n 2.\n3.\n4.\n5.\n6.\n.\n7.\n8.\n.\n9.\n10.\n11.\n12."));
			
			switch (month) {
			case 1:
				System.out.println("M�s 1 � Janeiro");
				break;
			case 2:
				System.out.println("M�s 2 � Fevereiro");
				break;
			case 3:
				System.out.println("M�s 3 � Mar�o");
				break;
			case 4:
				System.out.println("M�s 4 � Abril");
				break;
			case 5:
				System.out.println("M�s 5 � Maio");
				break;
			case 6:
				System.out.println("M�s 6 � Junho");
				break;
			case 7:
				System.out.println("M�s 7 � Julho");
				break;
			case 8:
				System.out.println("M�s 8 � Agosto");
				break;
			case 9:
				System.out.println("M�s 9 � Setembro");
				break;
			case 10:
				System.out.println("M�s 10 � Outubro");
				break;
			case 11:
				System.out.println("M�s 11 � Novembro");
				break;
			case 12:
				System.out.println("M�s 12 � Dezembrov");
				break;

			default:System.out.println("Erro de processamento...");
				break;
			}
		}
}
