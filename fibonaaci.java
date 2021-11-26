package javaassignments;

public class fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int l=30,m=0,n=1;
for (int i=1;i<l;i++) {
	System.out.print(m+",");
	int sum= m + n;
	m=n;
	n=sum;
}

	}

}
