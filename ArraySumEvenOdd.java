import java.util.Scanner;
public class ArraySumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int numbers[]=new int[10];
int even=0,odd=0,c=0;
for( c=0;c<10;c++) {
	System.out.println("enter your number");
	numbers[c]=scan.nextInt();
	if(numbers[c]%2==0) {
		even = even+numbers[c];
	}
	else {
		odd=odd+numbers[c];
	}
	
}
System.out.println("sum of even numbers is "+ even);
System.out.println("sum of odd numbers is "+ odd);
int dif=even-odd;
System.out.println("Difference between even and odd "+ dif);
	}

}
