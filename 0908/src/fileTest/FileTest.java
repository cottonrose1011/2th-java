package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
	
	public void go() throws IOException {
		File file = new File("c:\\tmp\\filetest.txt");
		FileReader fileReader = new FileReader(file);
		int ch = fileReader.read();
		System.out.println(ch);
		fileReader.close();
	}
}
