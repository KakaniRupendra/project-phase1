package linked_list;

public class LinkedList {
    Node head;//head of list
    static class Node
    {
    	int data;
    	Node next;
    	Node(int d)
    	{
    		data=d;
    		next=null;
    	}
    }
    //Method to insert a new node
    public static LinkedList insert(LinkedList list,int data)
    {
    	//create a new node with given data
    	Node new_node=new Node(data);
    	new_node.next=null;
    	//if the linked list is empty,then make the new node as head
    	if(list.head==null)
    	{
    		list.head=new_node;
    	}
    	else
    	{
    		//else traverse till the last node and insert the new_node
    		Node last=list.head;
    		while(last.next!=null) {
    			last=last.next;
    		}
    		//insert the new_node at last node
    		last.next=new_node;
    	}
    	return list;
    }
    public static void printList(LinkedList list)
    {
    	Node currNode=list.head;
    	System.out.println("LinkedList:");
    	//Traverse through the LinkedList
    	while(currNode!=null)
    	{
    		//print the data at current node
    		System.out.println(currNode.data+" ");
    		//go to next node
    		currNode=currNode.next;
    	}
    	System.out.println();
    	}
    //Method to delete a node in the LinkedList by KEY
    public static LinkedList deleteByKey(LinkedList list,int key) {
    	//store head node
    	Node currNode=list.head,prev=null;
    	if(currNode!=null && currNode.data==key)
    	{
    		list.head=currNode.next;//changed head
    		System.out.println(key+"found and deleted");
    		return list;
    	}
    	while(currNode!=null && currNode.data!=key) {
    		prev=currNode;
    		currNode=currNode.next;
    	}
    	if(currNode!=null) {
    		prev.next=currNode.next;
    		System.out.println(key+"found and deleted");
    	}
    	if(currNode==null)
    	{
    		System.out.println(key+"not found");
    	}
    	return list;
    }
    //method to create a single linked list with n nodes
    public static void main(String[]args) {
    	LinkedList list=new LinkedList();
    	list=insert(list,1);
    	list=insert(list,2);
    	list=insert(list,3);
    	list=insert(list,4);
    	list=insert(list,5);
    	list=insert(list,6);
    	list=insert(list,7);
    	list=insert(list,8);
    	//print the linkedlist
       printList(list);
       //delete node with value1
       deleteByKey(list,1);
       //print the linked list
       printList(list);
       //delete node with value 4
       deleteByKey(list,4);
       //print the linked list
       printList(list);
       //delete node with value 10
       deleteByKey(list,10);
       //print the linked list
       printList(list);
    }
}
