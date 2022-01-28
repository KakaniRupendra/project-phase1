package lmsproject;

public class defaultconstructor {
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}

}
 class constructordemo{
	public static void main(String[]args) {
		defaultconstructor d1=new defaultconstructor();
		defaultconstructor d2=new defaultconstructor();
		d1.display();
		d2.display();
	}
}