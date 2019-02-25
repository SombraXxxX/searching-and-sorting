import java.util.Scanner;

public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("What algorithm would you like to execute?");
		System.out.println("Acceptable responses: bubble, selection, insertion, merge, linear, binary, quit (all case-insensitive).");

		Scanner in = new Scanner(System.in);
		String algorthim = in.nextLine();
		
		System.out.println("What type of data? Acceptable responses: integers, strings.");
		String dataType = in.nextLine();
		System.out.println("How is it stored? Acceptable responses array, list.");
		String stored = in.nextLine();
		System.out.println(" Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5).");
		String data = in.nextLine();
		if(dataType == "integers"){
			
		}else {
			
		}


		
	}
}
