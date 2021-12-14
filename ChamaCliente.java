package br.com.generation.classes;

public class ChamaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome = "Jeff";
		c1.email = "jeff_o_brabo_1720@generation.com";
		c1.idade = 95;
		c1.sexo = "Masculino";
		c1.cpf = 395667498;
		
		
		c2.nome = "Vagner";
		c2.email = "vagner_o_monstro_1820@generation.com";
		c2.idade = 105;
		c2.sexo = "Masculino";
		c2.cpf = 49566749;
		
		System.out.println("*****************************");
		System.out.println(c1.nome);
		System.out.println(c1.email);
		System.out.println(c1.idade);
		System.out.println(c1.sexo);
		System.out.println(c1.cpf);
		c1.cadastrado();
		System.out.println("*****************************");
		
		System.out.println(c2.nome);
		System.out.println(c2.email);
		System.out.println(c2.idade);
		System.out.println(c2.sexo);
		System.out.println(c2.cpf);
		c2.cadastrado();
		System.out.println("*****************************");
		

	}

}
