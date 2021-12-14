package br.com.generation.classes;

public class ChecarAviao {

	public static void main(String[] args) {
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao();
		
		a1.nome = "Jeff";
		a1.modelo = "Boeing ";
		a1.assentos = 320;
		a1.assentosPegos = 220;
		a1.nSerie = 3401;
		
		
		
		a2.nome = "Vagner";
		a2.modelo = "Boeing ";
		a2.assentos = 320;
		a2.assentosPegos = 110;
		a2.nSerie = 3402;
		
		System.out.println("*****************************");
		System.out.println("Nome: " +a1.nome);
		System.out.println("Modelo: "+ a1.modelo);
		System.out.println("Numero de Assentos: "+ a1.assentos);
		System.out.println("Numero de Assentos pegos: "+a1.assentosPegos);
		System.out.println("Numero de Série: "+ a1.nSerie);
		a1.viagem();
		System.out.println("*****************************");
		
		System.out.println("Nome: " +a2.nome);
		System.out.println("Modelo: "+ a2.modelo);
		System.out.println("Numero de Assentos: "+ a2.assentos);
		System.out.println("Numero de Assentos pegos: "+a2.assentosPegos);
		System.out.println("Numero de Série: "+ a2.nSerie);
		a2.estacionado();
		System.out.println("*****************************");
		

	}

}
