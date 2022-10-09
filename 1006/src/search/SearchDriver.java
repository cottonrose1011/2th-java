package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class SearchDriver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File("c:\\users\\정부용\\Desktop\\search.txt"));
		Search search = new Search();
				
		while(fileScanner.hasNextLine()) {
			StringTokenizer st = new StringTokenizer(fileScanner.next());
			String str = st.nextToken();
			search.put(str);
		}
		search.go();
	}
}
