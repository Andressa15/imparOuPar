package com.br.zup;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Exercicio1 {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		List<Integer> listaImpares = new ArrayList <Integer>();
		List < Integer> listaPares = new ArrayList <Integer>();

		System.out.println(" digite um numero ");

		int entrada = scan.nextInt();
		while ( entrada != 0) {	
			if(entrada % 2 == 0) {
				System.out.println(" Numero que voce informou é par");
				listaPares.add(entrada);

			}else {
				System.out.println("Numero que você informou é impar");
				listaImpares.add(entrada);
			}

			System.out.println(" Digite um numero");	
			entrada = scan.nextInt();

		}

		System.out.println("Esses foram os valores ímpares digitados:" + listaImpares);

		int totalMedia = 0;
		System.out.println("Lista de números pares é:" + listaPares);
		for (Integer valor : listaPares) {
			System.out.println("Valor no foreach equivale a:" + valor);
			System.out.println("Soma dos valores no foreach equivale a:" + totalMedia);
			totalMedia += valor;
			System.out.println("Nova soma dos valores no foreach equivale a:" + totalMedia);
		}

		System.out.println("Média dos valores pares é:"+totalMedia/listaPares.size());
		scan.close();		 
	}

}





