package javaassignments;

public class thiskey {
	int x;//instance variable
	
	thiskey(int x)  {
		this.x =x; //local variable
		
	 }
	void display() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskey  ad = new thiskey(20);
		ad.display();
		
	}
}
