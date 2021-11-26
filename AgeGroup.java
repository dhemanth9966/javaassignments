
public class AgeGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int age=36;
    if (age<=0) {
	System.out.println( "invalid age");
  } 
     else if(age>=1 && age<=12) {
	 System.out.println( "kidoo");
  }
    else if (age>=13 && age<=19) {
	System.out.println( "teenager");
  }
    else if(age>=20 && age<=34) {
	System.out.println( "youth");
  }
     else if (age>=35 && age<=59) {
	System.out.println( "middle age");
  }
    else if (age>=60 && age<=199) {
	System.out.println( "old age");
  }
   else {
	System.out.println( "rip");
  }
	}

}
