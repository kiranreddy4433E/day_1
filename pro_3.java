package dsa;

import java.util.Scanner;

public class pro_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vowel[] = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
		Scanner input = new Scanner(System.in);
		System.out.println("enter a letter");
		String value;
		value = input.nextLine();
		boolean isVowel = false; 
		for (String v : vowel) {
			if(value.equalsIgnoreCase(v)) {
				isVowel = true;
				break;
			}
		}
		if (isVowel) {
			System.out.println("Vowel");
		}
		else if (value.length()!=1 || !Character.isLetter(value.charAt(0))) {
			System.out.println("Invalid input");
		}
		else {
			System.out.println("Consonent");
		}
		
	}

}
