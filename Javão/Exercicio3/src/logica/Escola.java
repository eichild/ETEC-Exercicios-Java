package logica;

import javax.swing.JOptionPane;

public class Escola {
		
		public int escolha, sem;
		
		public void Cases(){
			System.out.println("Cursos:");
			
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu curso:\n" +
			"1. Informatica\n 2.Administra��o"));
			switch (escolha) {
			case 1:
				System.out.println("Digite seu semestre:");
				sem = Integer.parseInt(JOptionPane.showInputDialog("1. primeiro\n 2. segundo\n 3.terceiro"));
				switch (sem) {
				case 1:
					System.out.println("Pr�dio A - 1� andar");
					break;
				case 2:
					System.out.println("Pr�dio A - 2� andar");
					break;
				case 3:
					System.out.println("Pr�dio A - 3� andar");
					break;

				default:
					System.out.println("Semestre n�o encontrado, tente novamente...");
					break;
				}
			
				
				break;
			case 2:
				System.out.println("Digite seu semestre:");
				sem = Integer.parseInt(JOptionPane.showInputDialog("1. primeiro\n 2. segundo\n 3.terceiro"));
				switch (sem) {
				case 1:
					System.out.println("Pr�dio B - 1� andar");
					break;
				case 2:
					System.out.println("Pr�dio B - 2� andar");
					break;
				case 3:
					System.out.println("Pr�dio B - 3� andar");
					break;

				default:
					System.out.println("Semestre n�o encontrado, tente novamente...");
					break;
				}
			
			default:
				break;
			}
			
		}
}
