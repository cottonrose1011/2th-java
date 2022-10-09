package upSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UpSearchDriver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File("c:\\users\\정부용\\Desktop\\search.txt"));
		UpSearch upSearch = new UpSearch();
		int lineCount = 0;
		while(fileScanner.hasNextLine()) {
			Scanner scanner = new Scanner(fileScanner.nextLine());
			lineCount++;
			while(scanner.hasNext()) {
				StringTokenizer st = new StringTokenizer(scanner.next());
				String str = st.nextToken();
				upSearch.put(str, lineCount);
			}
			
		}
		upSearch.go();
	}
}