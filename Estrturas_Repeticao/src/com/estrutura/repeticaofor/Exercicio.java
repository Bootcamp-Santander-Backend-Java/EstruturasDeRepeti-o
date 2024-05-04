package com.estrutura.repeticaofor;

public class Exercicio {

	public static void main(String[] args) {
		/*int num = 5, count = 1;
		do {
			num += count;
			System.out.println(num);
		} while (count <= 3);
*/
		boolean condicao = false;

		while (condicao) {
			System.out.println("executou ... ");

		}
		
			int numero = 1;
		   for (int x=1; x<2; x++){
	            numero = numero + x;
	        }
	        System.out.println("O valor de número é: " + numero);
	    
		String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
		System.out.print(nomes.length);
	}
}

