package pacotenota;



public class NotaPrincipal {

	public static void main (String[] args) {
	Nota objNota = new Nota();
	objNota.nota1= 10;
	objNota.nota2=10;
	objNota.nota3=10;
	objNota.nota4=10;
	objNota.nome = "Renan";
	System.out.println("Nome: "+objNota.nome);
	
	
	objNota.realizaOperacao();
	objNota.imprimir();

}
}
