package lmsproject;

 class paracondemo {
	int id;
	String name;
	 paracondemo(int i,String n)
	 {
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

}
class demo{
	public static void main(String[]args) {
		paracondemo p1=new paracondemo(2,"Alex");
		paracondemo p2=new paracondemo(10,"siri");
		p1.display();
		p2.display();
	}
}
