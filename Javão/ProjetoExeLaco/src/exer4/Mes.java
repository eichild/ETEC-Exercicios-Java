package exer4;

import javax.swing.JOptionPane;

public class Mes {

	public int num,escolha;

	public void InsereNumero(){
		do{
			JOptionPane.showMessageDialog(null,"--------Meses-------");
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero correspondente ao mes do ano :"));
			switch (num) {
			case 1:
				JOptionPane.showMessageDialog(null, "Janeiro, 31 dias");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Fevereiro, 28 dias");
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Mar�o, 31 dias");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Abril, 30 dias");
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Maio, 31 dias");
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"Junho, 30 dias");
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"Julho, 31 dias");
				break;
			case 8:
				JOptionPane.showMessageDialog(null,"Agosto, 31 dias");
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Setembro, 30 dias");
				break;
			case 10:
				JOptionPane.showMessageDialog(null,"Outubro, 31 dias");
				break;
			case 11:
				JOptionPane.showMessageDialog(null,"Novembro, 30 dias");
				break;
			case 12:
				JOptionPane.showMessageDialog(null,"Dezembro 31 dias");
				
				break;

			default:System.out.println("N�o foi possivel executar esta a��o...");
				break;
			}
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Deseja executar novamente? Digite 1 para sim e 2 para n�o."));
			if(escolha== 2){
		JOptionPane.showMessageDialog(null, "ADEUS...");
			}
		}
		while(escolha == 1);
		
		}
	}
	


	
