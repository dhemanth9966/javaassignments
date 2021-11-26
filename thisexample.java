package javaassignments;

public class thisexample {
	int x;//instance variable

	thisexample( int x ){
		 x=x;
	}
	void dispaly() {
	
		System.out.println(x);
	}

	public static void main(String[] args) {
		 
		 thisexample ad = new  thisexample(60);
		 ad.dispaly();
	}

}
