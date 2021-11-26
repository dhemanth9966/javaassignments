package javaassignments;

public class triangles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=4,b=5,c=6;
	if  (a==b && b==c) {
		System.out.println("equilateral triangles");
	}
	if (a==b  && c!=a) {
		System.out.println("issoseles triangle");
	
	}
  if (a!=b && b!=c && c!=a){
		System.out.println("scelene triangle");
	}
	}
}
