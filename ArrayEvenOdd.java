import java.util.Scanner;
public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int numbers[]=new int[15];
int even=0,odd=0,b=0;
for( b=0;b<15;b=b+1) {
	System.out.println("enter your number");
	numbers[b]=scan. nextInt();
	if(numbers[b]%2==0) {
		even=even+1;
	}
	else {
		odd=odd+1;
	}
}
System.out.println("count  of even numbers is "+ even);
System.out.println("count  of odd numbers is "+ odd);
	}

}
