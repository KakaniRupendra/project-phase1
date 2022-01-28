package fixbugs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class bugsfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello World!");
        System.out.println("\n ************************\n");
        System.out.println("\t Welcome to the desk \n");
        System.out.println("\n************************\n");
        optionsSelection();
	}
	private static void optionsSelection()
	{
		String[]arr= {"1.I wish to review my expenditure",
				"2.I wish toadd my expenditure",
				"3.I wish to delete my expenditure",
				"4.I wish to sort the expenditure",
				"5.I wish to search for a particular expenditure",
				"6.Close the application"
				};
		int arr1[]= {1,2,3,4,5,6};
		int slen=arr1.length;
		for(int i=0;i<slen;i++)
		{
			System.out.println(arr[i]);
			//to display all the strings mentioned in the string array
		
		}
		ArrayList<Integer>arrlist=new ArrayList<Integer>();
		ArrayList<Integer>expenses=new ArrayList<Integer>();
		expenses.add(1000);
		expenses.add(2300);
		expenses.add(35000);
		expenses.add(32000);
		expenses.add(1100);
		expenses.addAll(arrlist);
		System.out.println("\n enter your choice: ");
		Scanner s=new Scanner(System.in);
		int options=s.nextInt();
		for(int j=1;j<=slen;j++) {
			if(options==j) {
				switch(options) {
				case 1:System.out.println("your saved expenses are listed below:");
			       System.out.println(expenses+"\n");
			       optionsSelection();
			       break;
				case 2:System.out.println("enter the value to add your expenses:");
				        int value=s.nextInt();
				        expenses.add(value);
				        System.out.println("your value is updated");
				        expenses.addAll(arrlist);
			            System.out.println(expenses+"\n");
			            optionsSelection();
			            break;
				case 3:System.out.println("you are about the delete all your expenses \n" 
			             +"confirm again by selecting the same option");
			            int con_choice=s.nextInt();
			            if(con_choice==options) {
			            	expenses.clear();
			             System.out.println(expenses+"\n");
			             System.out.println("all your expenses are erased");
			            }
			            else {
			            	System.out.println("Oops.....try again");
			            }
			            optionsSelection();
			            break;
				case 4:sortExpenses(expenses);
				       optionsSelection();
				       break;
				case 5:searchExpenses(expenses);
			           optionsSelection();
			           break;  
				case 6:closeApp();
				        break;
			   default:System.out.println("you have made an invalid choice");
			            break;
				}
			}
		}
		
	}
private static void closeApp() {
	System.out.println("closing your application...\n Thank You!");
	
}
private static void searchExpenses(ArrayList<Integer>arrayList)
{
	int leng=arrayList.size();
	System.out.println("enter the expenses you need to search:");
	Scanner s=new Scanner(System.in);
	int input=s.nextInt();
	//linear search
	for(int i=0;i<leng;i++) 
	{   if(arrayList.get(i)==input) {
		
		    System.out.println("found the expenses"+input+" at "+i+" position");
	}
	}

}
private static void sortExpenses(ArrayList<Integer>arrayList) {
	int arrlength=arrayList.size();
	//complete the method.The expenses should be sorted in ascending order.
	Collections.sort(arrayList);
	System.out.println("Sorted expenses:");
	for(Integer i:arrayList) {
		System.out.print(i+" ");
		
	}
	System.out.println("\n");
}
}
