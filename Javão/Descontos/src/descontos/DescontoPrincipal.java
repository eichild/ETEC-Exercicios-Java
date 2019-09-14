package descontos;

public class DescontoPrincipal {
	
	public float SalarioBruto,desconto, SalarioLiquido, SalarioHora, HorasTrab;
	


		public void realizaOperacao(){
			SalarioBruto=SalarioHora*HorasTrab;
			desconto= SalarioBruto * 0.11f;
			SalarioLiquido=  SalarioBruto - desconto;
		}
		public void imprimir()	{
			System.out.println("Horas trabalhadas: " + HorasTrab);
			System.out.println("salarioHora: " + SalarioHora);
			System.out.println("Salario Bruto: " + SalarioBruto);
			System.out.println("Desconto Inss: " + desconto);
			System.out.println("Salario Liquido: " + SalarioLiquido);
			System.out.println("Fim do processamento! ");
			
		}
			
		}


