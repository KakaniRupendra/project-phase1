package innerclass;

 public class innerclass1 {
   private String msg="Welcome to java";
    public class inner
    {
	   public void hello()
	   {
		   System.out.println(msg+", Let us start learning Inner Classes");
	   }
    }
	   public static void main(String[]args) 
	   {
		   innerclass1 obj=new innerclass1();
		   innerclass1.inner in=obj.new inner();
		   in.hello();
	   }
   }


	   class innerclass2{
		   private String msg="Inner Classes";
		   void display() {
			   class inner{
				   void msg() {
					   System.out.println(msg);
					
				   }
			   }
			   inner i=new inner();
			   i.msg();
		   }
		   public static void main(String[]args) {
			  innerclass2 ob=new innerclass2();
			  ob.display();
		   }
	   }
	   
	   
