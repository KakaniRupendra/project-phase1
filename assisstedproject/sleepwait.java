package thread;

public class sleepwait {
	private static Object LOCK=new Object();
	public static void main(String[]args)throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("Thread'"+Thread.currentThread().getName()+"'is woken after sleep for 1 second");
		synchronized(LOCK)
		{
		LOCK.wait(1000);
		System.out.println("Object'"+LOCK+"'is wokenafter"+"waiting for 1 second");
}
	}
}
