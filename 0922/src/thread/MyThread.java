package thread;

public class MyThread implements Runnable{
	
	private int counter = 0, num =0;
	
	@Override
	public void run() {
		while(true) {
			System.out.println(num+"번 쓰레드: "+counter++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public MyThread(int num) {
		this.num = num;
		
	}
	public MyThread() {
		this(1);
	}
}
