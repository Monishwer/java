package thread;

public class Samplee {
	
	synchronized static void print(int num) {//sync static method
		for(int i = 1; i<= 5; i++) {
			System.out.println(num * i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
class Threadd1 extends Thread{
	public void run() {
		Samplee.print(3);
	}
}
class Threadd2 extends Thread{
	public void run() {
		Samplee.print(5);
	}
	
}

	

