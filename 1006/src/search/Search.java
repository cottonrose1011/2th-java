package search;

import java.util.HashMap;
import java.util.Scanner;

public class Search {
	HashMap<String, Word> map = new HashMap<>();

	public void go() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾을 단어를 입력하세요: ");
		String findWord = scanner.next();
		System.out.println(map.get(findWord).wordCount);
		
	}
	public void put(String str) {
		if(map.containsKey(str)) {
			Word word = map.get(str);
			word.setWordCount(word.getWordCount()+1);
			map.put(str, word);
		}
		else map.put(str, new Word(1));
	}
	
	private class Word{
		int wordCount=0;

		public int getWordCount() {
			return wordCount;
		}

		public void setWordCount(int wordCount) {
			this.wordCount = wordCount;
		}

		public Word(int wordCount) {
			super();
			this.wordCount = wordCount; 	
		}
	}

}
