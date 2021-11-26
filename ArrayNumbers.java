import java.util.Scanner;
public class ArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int sum=0,a=0;
int numbers[]=new int[10];
for( a=0;a<10;a=a+1) {	
System.out.println("enter your number");
numbers[a]=scan.nextInt();
sum=sum+numbers[a];

}
System.out.println("enter sum of numbers " +sum );

float avg=sum/(a*1.0f);
System.out.println("enter avg of numbers " +avg );

}

}
