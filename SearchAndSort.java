import java.util.ArrayList;
import java.util.Arrays;
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
		String dataType = in.nextLine().toLowerCase();
		System.out.println("How is it stored? Acceptable responses array, arraylist.");
		String stored = in.nextLine().toLowerCase();
		System.out.println(" Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5).");
		String data = in.nextLine();
		if(dataType.equals("strings") && stored.equals("arraylist" )){
			String[] intstrings = data.split(",");
				ArrayList<String> strings = new ArrayList<String>();
				for(int i=0; i<intstrings.length; i++) {
					strings.add(intstrings[i]);
				}
				System.out.print(Arrays.toString(strings.toArray()));
		}else if(dataType.equals("integers") && stored.equals("array")) {
			String[] stringints = data.split(",");
			 int ints[] = new int[stringints.length]; 
		        for (int i=0; i<stringints.length; i++) 
		            ints[i] = Integer.parseInt(stringints[i]);
			System.out.println(Arrays.toString(ints));

		}else if (dataType.equals("strings") && stored.equals("array")) {
			String[] strings = data.split(",");
			System.out.println(Arrays.toString(strings));
		}else if(dataType.equals("integers") && stored.equals("arraylist" )) {
			String[] stringints = data.split(",");
			ArrayList<Integer> ints = new ArrayList<Integer>();
			for(int i=0; i<stringints.length; i++) {
				ints.add(stringints[i]);
			}
			System.out.print(Arrays.toString(ints.toArray()));
		}else {
			System.out.print("error");
		}

	}
}
