package score3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Score {
	HashMap<String, Double> scores = new HashMap<>();
	
	public void go() {
		scores.put("국어", 80.0);
		scores.put("산수", 70.0);
		scores.put("자연", 90.0);
		max1();
		max2();
		
	}
	
	public void max1() {
		double max = 0.0;
		String subject = "";
		
		for(String s: scores.keySet()) { //for-each 사용
			double score = scores.get(s);
			if(score>max) {
				max = score;
				subject = s;
			}
		}
		System.out.println(subject+": "+max);
	}
	
	public void max2() { //iterator 사용
		double max=0.0;
		String subject ="";
		
		Iterator<Map.Entry<String, Double>> alba = scores.entrySet().iterator();
		while(alba.hasNext()) {
			Map.Entry<String, Double> entry = alba.next();
			double score = entry.getValue();
			if(score>max) {
				max=score;
				subject = entry.getKey();
			}
		}
		System.out.println(subject+": "+max);
	}
}
