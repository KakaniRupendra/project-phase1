package thread;
import java.io.*;
import java.util.*;
public class thread_synchronization_sender {
	public void send(String msg) {
		System.out.println("Sending\t"+msg);
	
	try {
		Thread.sleep(1000);
	}
	catch(Exception e) {
		System.out.println("Thread interrupted.");
	}
	System.out.println("\n"+msg+"sent");
}
}
class ThreadedSend extends Thread{
	private String msg;
	private Thread t;
	thread_synchronization_sender sender;
	ThreadedSend(String m,thread_synchronization_sender obj){
		msg=m;
		sender =obj;
		
	}
	public void run() {
		synchronized(sender) {
			sender.send(msg);
		}
	}
}

class SyncDemo{
	public static void main(String[]args) {
		thread_synchronization_sender snd=new thread_synchronization_sender();
		ThreadedSend s1=new ThreadedSend("Hi ",snd);
		ThreadedSend s2=new ThreadedSend("Bye ",snd);
		s1.start();
		s2.start();
	
	try {
		s1.join();
		s2.join();
	}
	catch(Exception e) {
		System.out.println("Interrupted");
	}

}
}
