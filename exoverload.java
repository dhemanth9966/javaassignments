package javaassignments;

public class exoverload {
	
	static void greet() {
		System.out.println("Hello java");
	}
	static void greet( int x, int y) {
		System.out.println("Hello priyanka");
	}
	static void greet(double x ,int y) {
		System.out.println("Hello vamsi");
	}

	public static void main(String[] args) {
		
		exoverload ad = new exoverload();
		ad.greet(5.6,10);
	}

}
