package thread;

public class SyncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sync method
		Sample s = new Sample();
		Thread1 t = new Thread1(s);
		Thread2 t1 = new Thread2(s);
		
		t.start();
		t1.start();
		
		//sync static method
		
//		Thread1 t1 = new Thread1();
//		Thread1 t2 = new Thread2();
//		
//		t1.start();
//		t2.start();
		

	}

}
