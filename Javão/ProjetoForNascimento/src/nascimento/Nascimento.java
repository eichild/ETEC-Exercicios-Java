package nascimento;

import javax.swing.JOptionPane;

public class Nascimento {
	
	public int anoNas , idade, media, res,acumidade;
	public int anoAtual = 2017;
	public int LIMITE_MAXIMO=3;	

	public void receberAno(){
		try{
			anoNas = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano do nascimento"));
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
	}
	public void calculaAno(){
		idade = anoAtual - anoNas;
	}
	public void imprimeIdade(){
		JOptionPane.showMessageDialog(null, "Idade é " + idade);
	}
	public void menu(){
		for (int i = 0; i <LIMITE_MAXIMO; i++){
			receberAno();
			calculaAno();
			imprimeIdade();
			acumidade=acumidade+idade;
		}
		int mediaidade=acumidade/LIMITE_MAXIMO;
		JOptionPane.showMessageDialog(null, "A media das idades é:"+mediaidade );
	}
}
