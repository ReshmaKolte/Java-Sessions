package javasession;

import java.util.Scanner;
//import java.lang.*;

public class VowelsConsonents {

	private static Scanner sc;

	public static void main(String[] args) {
		//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		
		System.out.println("Enter character");
		sc = new Scanner(System.in);
		char ch =sc.nextLine().charAt(0);
		switch(ch)
		{
			case 'a':System.out.println(ch +" is Vowel");
					break;
			case 'A':System.out.println(ch +" is Vowel");
					break;
			case 'e':System.out.println(ch +" is Vowel");
					break;
			case 'E':System.out.println(ch +" is Vowel");
			 		break;
			case 'i':System.out.println(ch +" is Vowel");
					break;
			case 'I':System.out.println(ch +" is Vowel");
			break;
			case 'o':System.out.println(ch +" is Vowel");
					break;
			case 'O':System.out.println(ch +" is Vowel");
			break;
			case 'u':System.out.println(ch +" is Vowel");
					break;
			case 'U':System.out.println(ch +" is Vowel");
			break;
			default:System.out.println(ch +" is consonent");
					break;
		}
	}

}
