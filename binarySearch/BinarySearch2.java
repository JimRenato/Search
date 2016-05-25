package binarySearch;

import java.text.Normalizer;
import java.util.Scanner;

/**
 * BinarySearch
 * 
 * Version 1.0
 * 
 * 2016/05/23
 * 
 * @author Renato Souto Maior
 * 
 * Implementation of Binary Search Method.
 * 
 */

public class BinarySearch2 {

	private static Scanner input;

	public String binarySearchMethod(String[] array, String name) {
		int begin = 0;
		int end = array.length - 1;
		while (begin <= end) {
			int middle = (begin + end) / 2;

			if (array[middle].equalsIgnoreCase(name) || removeAcentos(array[middle]).equalsIgnoreCase(name)) {
				return "Foi encontrado o nome " + name + " no index " + String.valueOf(middle) + ".";
			}
			if (name.compareToIgnoreCase(array[middle]) > 0) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return "Nome " + name + " não foi encontrado.";
	}

	public static void orderArrayString(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = (i + 1); j < array.length; j++) {
				if (array[i].compareTo(array[j]) > 0) {
					String aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
			System.out.println(array[i]);
		}
	}

	public static String removeAcentos(String str) {

		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

	public static void inputName() {
		System.out.println("Digite o nome que deseja encontrar: ");
		input = new Scanner(System.in);
	}

	public static void main(String[] args) {

		String[] arrayOfNames = { "Abrão", "Abraão", "Aci", "Acira", "Ada", "Adail", "Adalberto", "Adália", "Adalgisa",
				"Adalton", "Adamir", "Adamo", "Adão", "Adauto", "Adelaide", "Adélia", "Adelina", "Aline", "Ademar",
				"Ademir", "Adina", "Adir", "Adira", "Ado", "Adolfo", "Adonias", "Adoniran", "Adônis", "Adriana",
				"Adriane", "Adriano", "Aécio", "Afonso", "Altieres", "Agenor", "Agildo", "Agnaldo", "Agnelo",
				"Aguinaldo", "Aída", "Aimoré", "Airumã", "Akira", "Alan", "Alba", "Alberico", "Albertina", "Alberto",
				"Albino", "Alceu", "Alcina", "Alcione", "Alcindo", "Alcione", "Alda", "Aldir", "Aldo", "Aleixo",
				"Alejandra", "Alexandre", "Alfeu", "Alfredo", "Alice", "Alícia", "Alina", "Aline", "Alípio", "Alma",
				"Almeida", "Almir", "Almira", "Aloísio", "Altino", "Alzira", "Amadeu", "Amador", "Amália", "Amanda",
				"Amândio", "Amauri", "Aarão", "Arão", "Abaçaí", "Abacílio", "Abel", "Abelardo", "Abella", "Abigail",
				"Abílio", "Abner", "Ambrósio", "Amélia", "América", "Américo", "Amílcar", "Amin", "Amir", "Ana",
				"Anacleto", "Ananias", "Anastácia", "Balduíno", "Baltazar", "Bárbara", "Barnabé", "Bartolomeu",
				"Baruque", "Basílio", "Batista", "Beatriz", "Benjamim", "Caio", "Calena", "Candido", "Carina", "Carla",
				"Carlos", "Carmen", "Carol", "Carolina", "Cassiana", "Cassiano", "Cassilda", "Cássio", "Catarina",
				"Cedar", "Célia", "Celina", "Celso", "Cátia", "Cecília", "Cesar", "Cibele", "Cícero", "Cíntia",
				"Cirilo", "Ciro", "Clara", "Clarissa", "Cláudio", "Cleber", "Clécio", "Clemente", "Cleusa", "Clodoaldo",
				"Clodomiro", "Clodovil", "Colombo", "Conceição", "Conrado", "Crispim", "Cristiano", "Cristina",
				"Cristóvão", "Custódio", "Dácio", "Dafne", "Dagoberto", "Dalila", "Dalton", "Damião", "Daniel",
				"Daniela", "Eduardo", "Emanuel", "Eliana", "Enzo", "Erick", "Emilly", "Evelyn", "Fernanda", "Filipa",
				"Franklin", "Fausto", "Gabrieli", "Giuliana", "Guilherme", "Gustavo", "Helena", "Heloísa", "Henrique",
				"Henry", "Ian", "Isabela", "Isadora", "Iasmin", "Joaquim", "Juliano", "Joice", "Júlia", "Kevin",
				"Kelly", "Kaique", "Laura", "Luiza", "Lauro", "Lorenzo", "Milena", "Melissa", "Miguel", "Matheus",
				"Nicolas", "Noah", "Natha", "Odete", "Ofélia", "Oliveira", "Otília", "Pietra", "Pérola", "Pietro",
				"Pierre", "Quezia", "Queiroz", "Raissa", "Rayane", "Ryan", "Rafael", "Renato", "Samara", "Samuel",
				"Sandro", "Thiago", "Téo", "Tales", "Talita", "Tainá", "Úrsula", "Uriel", "Ugo", "Vinícius", "Vitor",
				"Valentina", "Verônica", "William", "Wesley", "Wilma", "Walesca", "Ximenes", "Xande", "Yago", "Yuri",
				"Yara", "Yanni", "Zilda", "Zara", "Zaqueu", "Zeca" };

		orderArrayString(arrayOfNames);
		inputName();
		String value = input.nextLine();
		BinarySearch2 bs = new BinarySearch2();
		String result = bs.binarySearchMethod(arrayOfNames, value);
		System.out.println(result);
	}
}
