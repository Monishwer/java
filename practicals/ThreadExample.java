package thread;
import java.util.*;

public class ThreadExample extends Thread
{
public void run()
{
System.out.println("I am Thread Thread is running..");
}
public static void main(String args[])
{
ThreadExample t=new ThreadExample();
t.start();
String s=t.getName();
System.out.println(s);
}
}
