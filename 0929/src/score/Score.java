package score;

import java.util.ArrayList;
import java.util.Iterator;

public class Score {
	ArrayList<Double> scores = new ArrayList<>();
	
	
	public Score() {
		scores.add(80.0);
		scores.add(90.0);
		scores.add(50.0);
		scores.add(100.0);
	}
	
	public double average() {
		double sum = 0.0;
		
		for(Double s: scores) {
			sum += s;
		}
		return sum/scores.size();
	}
	
	public double max() {
		double max = 0.0;
		
		Iterator<Double> alba = scores.iterator();
		while(alba.hasNext()) {
			double score = alba.next();
			if(score > max) max = score;
		}
		return max;
	}
	
	public void go() {
		System.out.println("평균은: "+average());
		System.out.println("최댓값은: "+max());
	}
}
