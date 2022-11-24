package cacao;

import java.util.ArrayList;

public class Server {
	ArrayList<Observer> observers = new ArrayList<>();
	
	public void register(Observer o) {
		observers.add(o);
	}
	
	public void remove(Observer o) {
		observers.remove(o);
	}
	
	public void notify(String msg) {
		for(Observer o: observers) {
			o.update(msg);
		}
	}
}
