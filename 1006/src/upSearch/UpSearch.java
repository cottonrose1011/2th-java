package upSearch;

import java.util.HashMap;
import java.util.Scanner;


public class UpSearch {
	HashMap<String, Word> map = new HashMap<>();
	int count = 0;
	public void go() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾을 단어를 입력하세요: ");
		String findWord = scanner.next();
		
		System.out.print(map.get(findWord).wordCount+" - ");
		
		for(int i=0; i<map.get(findWord).lineArray.length; i++) {
			if(map.get(findWord).lineArray[i] != 0)System.out.print(map.get(findWord).lineArray[i]+", ");
		}
		
	}
	public void put(String str, int lineCount) {
		if(map.containsKey(str)) {
			Word word = map.get(str);
			word.setWordCount(word.getWordCount()+1);
			if(word.getLineCount() != lineCount) {
				word.lineArray[count] = lineCount;
				word.setLineCount(lineCount);
				count++;
			}
			map.put(str, word);
		}
		else {
			map.put(str, new Word(1, lineCount));
			Word word = map.get(str);
			word.lineArray[count] = lineCount;
			word.setLineCount(lineCount);
			count++;
		}
	}
	
	private class Word{
		int wordCount=0, lineCount = 0;
		int[] lineArray = new int[100];

		public int getLineCount() {
			return lineCount;
		}

		public void setLineCount(int lineCount) {
			this.lineCount = lineCount;
		}

		public int getWordCount() {
			return wordCount;
		}

		public void setWordCount(int wordCount) {
			this.wordCount = wordCount;
		}

		public Word(int wordCount, int lineCount) {
			super();
			this.wordCount = wordCount;
			this.lineCount = lineCount;
		}
	}
}
