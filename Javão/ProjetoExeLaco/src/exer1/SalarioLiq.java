package exer1;

import javax.swing.JOptionPane;

public class SalarioLiq {

	public String nome;
	public int matricula, opc;
	public float salarioBruto, salarioLiquido, desconto, totalLiq,salA;

	public void desejo(){
		opc = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas usuarios deseja consultar:"));
	}
	
public void insereDados(){
for(int i=1; i<=opc;i++){
	nome=JOptionPane.showInputDialog("D�gite seu nome :");
	matricula=Integer.parseInt(JOptionPane.showInputDialog("D�gite o numero de sua matricula :"));
	salarioBruto=Float.parseFloat(JOptionPane.showInputDialog("Digite salario Bruto :"));
	calculoDesc();	
	imprimeDados();

}



}
public void imprimeDados() {
	
	JOptionPane.showMessageDialog(null, "Dados do Funcion�rio\n" + "\nNome " + nome 
			+ "\nMatricula " + matricula + "\nSalario Bruto" +salarioBruto+ 
			"\nSalarioLiquido :" +salarioLiquido);

}


public void calculoDesc(){
	if( salarioBruto<=1500){
		desconto = salarioBruto * 0.6f;
		salarioLiquido = salarioBruto - desconto;
		salA+=salarioLiquido;
	}
	else if(salarioBruto >=1501){
		desconto = salarioBruto * 09.5f;
		salarioLiquido = salarioBruto - desconto;
		salA+=salarioLiquido;
	}
}
	public void calculoTotal(){
		JOptionPane.showMessageDialog(null, "O total �: "+salA);
}


}

