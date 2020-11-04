package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.DocFlavor.STRING;

import com.google.common.util.concurrent.ListenableFuture;

import org.checkerframework.checker.units.qual.Length;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		// 1
		if (name == null) {
			return "Hello World";
		}
		if (name == "") {
			return "Hello World";
		} else
			return "Hello Manu";
	}

	public static String[] removeNullElements(String[] array) {
		// 2
		String[] lista;
		int n = 0;
		for (String Element : array) {
			if (Element != null) {
				n++;
			}
		}
		int r = 0;
		lista = new String[n];
		for (String Element : array) {
			if (Element != null) {
				lista[r] = Element;
				r++;
			}
		}
		return lista;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		// 3
		int width = array.length + 1;

		int[] liste2 = new int[width];
		liste2[0] = element;
		for (int i = 0; i < liste2.length - 1; i++) {

			liste2[i + 1] = array[i];
		}
		System.out.print(Arrays.toString(liste2));

		int[] liste3 = {};
		int[] FinalList = { 1 };
		liste3 = FinalList;
		System.out.print(Arrays.toString(liste3));

		return liste2;

	}

	public static int[] allElementsExceptFirstThree(int[] array) {
		// 4
		List<Integer> cache = new ArrayList<>();
		for (int i =3; i < array.length; i++){
			cache.add(array[i]);
			if (i <3){
				cache.add(0);
			}
		}
		int [] tab = new int [cache.size()];
		for (int j = 0; j < tab.length; j++){
			tab[j] = cache.get(j);
		}

		return tab;	
}
		
		
	
	

	public static String getFirstHalf(String word) {
		// 5
		return word.substring(0, 3);
	}

	public static String[] selectElementsStartingWithA(String[] array) {
		// 6

		int s = 0;
		String[] elementsA;
		for (String fruit : array) {
			if (fruit.charAt(0) == 'a') {
				s++;
			}
		}
		elementsA = new String[s];
		int i = 0;
		for (String fruit : array) {
			if (fruit.charAt(0) == 'a') {
				elementsA[i] = fruit;
				i++;
			}
		}
		return elementsA;
	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7

		int v = 0;
		String[] stock;
		for (String Vowel : array) {
			System.out.println(Vowel);
			if (Vowel != null) {
				if (Vowel.charAt(0) == 'a' || Vowel.charAt(0) == 'e' || Vowel.charAt(0) == 'i' || Vowel.charAt(0) == 'o'
						|| Vowel.charAt(0) == 'u') {
					v++;
				}
			}
		}
		stock = new String[v];
		int i = 0;
		for (String Vowel : array) {
			if (Vowel != null) {
				if (Vowel.charAt(0) == 'a' || Vowel.charAt(0) == 'e' || Vowel.charAt(0) == 'i' || Vowel.charAt(0) == 'o'
						|| Vowel.charAt(0) == 'u') {
					stock[i] = Vowel;
					i++;
				}
			}
		}
		return stock;
	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8
		String[] inverse = new String[array.length];
		int n = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			inverse[n] = array[i];
			n--;
		}
		return inverse;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9
		int tab = array.length;
		int middle = (int) Math.floor(array.length / 2 );
		int [] liste =  new int [array.length +1];
		int j =0;

		if(tab == 0 ){
			liste[0] = element;
		} else {

		for(int i = 0; i< array.length; i++){
			if (i == middle){
				liste[j] = element;
				j++;
				System.out.print(Arrays.toString(liste));
			}
			liste[j] = array[i];
			j++;
		}
	}
		return liste;
	
}

	public static String shortestWord(String text) {
		// 10
		
		String [] liste0 = text.split(" ");
		
		String liste = liste0[0];
		int LeMotPlusPetit = liste0[0].length();
		
		for (String i : liste0) {
			if (i.length() < liste0.length) {
				LeMotPlusPetit = i.length();
				liste = i;
			}
		
		}
		return liste;
	}

	public static String removeCapitals(String text) {
		// 11
		String correc = text.replaceAll("([H-K])", "");
		
		return correc;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		long liste = number1 + number2;
		System.out.print(liste);
		return liste;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		long liste3 = number1 + number2 +number3;
		return liste3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14

		long PlusieurNumbers = 0;
	
		for (int i = 0; i < numbers.length; i++) {
			PlusieurNumbers += numbers[i]; 
		}
		
		return PlusieurNumbers;
	}

	public static float makeNegative(float number) {
		// 15
		if (number < 0){
			return number;
		}else
			number = number * -1;
		return number;
	}

	public static boolean checkForSpecialCharacters(String string) {
		// 16
		Pattern pa = Pattern.compile("[A-Z@#%]");
		Matcher ma = pa.matcher(string);
		Boolean result = ma.find();
		System.out.println(result);
		return result;
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17
		Pattern p = Pattern.compile("[qF]");
		Matcher m = p.matcher(word);
		Boolean result = m.find();
		return result;
	}

	public static String getDomainName(String email) {
		// 18
		return email.replaceAll("(^.*@|.com$)","");
	}

	public static int[] letterPosition(String name) {
		// 19
		int len = name.length();
		int num = 31;
		int retour [] = new int [len];

		for (int i = 0; i < len; i++){
			retour[i] = name.charAt(i) & num;

		}
		
		return retour;
	}
	

	public static boolean isPeer(int number) {
		// 20
		if (number % 2 == 0){
			return true;
		} else {
		return false;
		}
	}
}
