import java.util.Scanner;
public class VowelandConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any character");
		ch=scan.next().charAt(0);
		switch(ch)
		{
		case 'a':
			System.out.println("It is a vowel");
			break;
		case 'e':
			System.out.println("It is a vowel");
			break;
		case 'i':
			System.out.println("It is a vowel");
			break;
		case 'o':
			System.out.println("It is a vowel");
			break;
		case 'u':
			System.out.println("It is a vowel");
			break;
		case 'A':
			System.out.println("It is a vowel");
			break;
		case 'E':
			System.out.println("It is a vowel");
			break;
		case 'I':
			System.out.println("It is a vowel");
			break;
		case 'O':
			System.out.println("It is a vowel");
			break;
		case 'U':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("It is a consonant");
		}
		}
		
}

