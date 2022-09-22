package thread;

public class ThreadDriver {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		Thread send = new Thread(myThread);
		send.start();
		
		myThread = new MyThread(2);
		Thread send2 = new Thread(myThread);
		send2.start();
		
		myThread = new MyThread(3);
		Thread send3 = new Thread(myThread);
		send3.start();		
	}
}