package Exe8;

import javax.swing.JOptionPane;

public class Funcionarios {

	public String sexo;
	public int idade, horasTrabalhadas, codigo, qtdHom = 0, qtdMu = 0, qtdMU30 = 0, qtdTot = 0;
	public float salarioHora, mediaMu, mediaMu30, mediaTot, mediaHo;
	public float salarioMu, salarioHo, salarioMU30;

	public void insereDados() {
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Funcionário"));
		while (codigo != 999) {

			try {
				sexo = JOptionPane.showInputDialog("Digite o Sexo \n 1 - Masculino \n 2 - Feminino");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
				horasTrabalhadas = Integer
						.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
				salarioHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario hora"));
				imprimeDados();
				analisaFuncionario();
				codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Funcionário"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		calculaResultados();
	}

	public void imprimeDados() {
		JOptionPane.showMessageDialog(null, "Dados do Funcionário\n" + "\nCódigo " + codigo + "\nSexo " + sexo
				+ "\nIdade " + idade + "\nHoras Trabalhadas " + horasTrabalhadas + "\nSalario Hora " + salarioHora);
	}

	public void calculaResultados() {

		// Quantidade de Homens
		JOptionPane.showMessageDialog(null, "Quantidade de Homens cadastrados " + qtdHom);

		// media salarial de todas as mulheres
		float mediaSalarial = mediaMu / qtdMu;
		JOptionPane.showMessageDialog(null, "Media salarial de Todas as mulheres " + mediaSalarial);

		// media salarial das mulheres com menos de 30
		mediaSalarial = mediaMu30 / qtdMU30;
		JOptionPane.showMessageDialog(null, "Media salarial de mulheres com menos de 30 " + mediaSalarial);

		// media salarial de todos os empregados
		float totalDindin = mediaHo + mediaMu;
		int qtdFun = qtdHom + qtdMu;
		mediaTot = totalDindin / qtdFun;
		JOptionPane.showMessageDialog(null, "Media Salarial de Todos os Funcionários " + mediaTot);

	}

	public void analisaFuncionario() {

		if (sexo.equals("1")) {
			qtdHom++;
			calcSalarioHo();
			mediaHo = mediaHo + salarioHo;
		} else if (sexo.equals("2")) {
			qtdMu++;
			calcSalarioMu();
			mediaMu = mediaMu + salarioMu;
			if (idade <= 30) {
				qtdMU30++;
				calcSalarioMu30();
				mediaMu30 = mediaMu30 + salarioMU30;

			}
		}
	}

	public void calcSalarioMu() {
		salarioMu = horasTrabalhadas * salarioHora;
	}

	public void calcSalarioHo() {
		salarioHo = horasTrabalhadas * salarioHora;
	}

	public void calcSalarioMu30() {
		salarioMU30 = horasTrabalhadas * salarioHora;
	}
}
