package innerclass;

 abstract class AnonymousInnerClass
 {
	 abstract void display();
}
  class  innerclass3{
	   public static void main(String[]args) 
	   {
		   AnonymousInnerClass i=new AnonymousInnerClass() {
			   public  void display()
			   {
				   System.out.println("Anonymous inner class");
			   }
	   }; 
		   i.display();
	   
       }
  }


