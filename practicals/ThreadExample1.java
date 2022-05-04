package thread;
import java.util.*;

class ThreadExample1 implements Runnable
{
public void run()
{
System.out.println("I am thread Thread is running...");
}
public static void main(String args[])
{
	ThreadExample1 t=new ThreadExample1();
Thread th=new Thread(t);
th.start();
}
}
