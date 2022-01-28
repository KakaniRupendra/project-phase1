package queue;

import java.util.Queue;
import java.util.*;
public class queueexample 
{
    public static void main(String[]args)
    {
    	Queue<String>locationsqueue=new LinkedList<>();
    	locationsqueue.add("kolkata");
    	locationsqueue.add("patna");
    	locationsqueue.add("delhi");
    	locationsqueue.add("gurgaon");
    	locationsqueue.add("noida");
        System.out.println("queue is: "+locationsqueue);
        System.out.println("head of queue: "+locationsqueue.peek());
        locationsqueue.remove();
        System.out.println("after removing head of queue:"+locationsqueue);
        System.out.println("size of queue:"+locationsqueue.size());
        
    }
}
