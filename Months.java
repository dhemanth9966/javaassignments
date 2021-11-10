import java.util.Scanner;
public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first three letters of the month:");
		String month = scan.next();
		switch(month)
		{
		case "jan":
			System.out.println("january");
			break;
		case "feb":
			System.out.println("february");
			break;
		case "mar":
			System.out.println("march");
			break;
		case "apr":
			System.out.println("april");
			break;
		case "may":
			System.out.println("may");
			break;
		case "jun":
			System.out.println("June");
			break;
		case "jul":
			System.out.println("July");
			break;
		case "aug":
			System.out.println("august");
			break;
		case "sep":
			System.out.println("september");
			break;
		case "oct":
			System.out.println("october");
			break;
		case "nov":
			System.out.println("november");
			break;
		case "dec":
			System.out.println("december");
			break;
		default:
			System.out.println("Enter a valid month");
			
		}
		}

	}


