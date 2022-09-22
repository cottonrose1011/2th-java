package duck;

import java.util.ArrayList;

public class DuckDriver {

	public static void main(String[] args) {
		ArrayList<Duck> a = new ArrayList<>();
		
		a.add(new MallardDuck(new FlyWell()));
		a.add(new RedHeadDuck(new NoFly()));
		a.add(new MallardDuck(new FlyWell()));
		//이렇게 하거나 MallrdDuck 생성자에 flyStyle = new FlyWell();로 선언해도 됨.
		//그러면 파라미터 값을 받지 않고도 new MallardDuck(); 만 add해도 잘난다고 나옴.
		
		for(Duck duck: a) {
			duck.fly();
		}
	}

}
