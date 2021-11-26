import java.util.Scanner;
public class ArrayCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String cities[] = new String[6];
		
		for(int i=0;i<6;i=i+1) {
			System.out.println("Enter the city name ");
			cities[i] = scan.next();
		}
		
		
		 String temp;
	        for (int i = 0; i < 6; i++) {
	            for (int j = i + 1; j < 6; j++) {
	                
	                // to compare one string with other strings
	                if (cities[i].compareTo(cities[j]) > 0) {
	                    // swapping
	                    temp = cities[i];
	                    cities[i] = cities[j];
	                    cities[j] = temp;
	                }
	            }
	        }
	        System.out.println("The Cities in alphabetical order are: ");
	            for (int i = 0; i < 6; i++) {
	                System.out.println(cities[i]);
	    	}
	}

}
