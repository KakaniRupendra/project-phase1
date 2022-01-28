package lmsproject;

 class methodExecution {
  public int multiplynumbers(int a,int b) {
	  int z=a*b;
	  return z;
  }
  public static void main(String[]args) {
	  methodExecution b=new methodExecution();
	  int ans=b.multiplynumbers(10,3);
	  System.out.println("multiplication is:"+ans);
  }
 }
   class callMethod{
	  int val=150;
	  int operation(int val) {
		  val=val*10/100;
		  return(val);
	  }
	  public static void main(String[]args) {
		  callMethod d=new callMethod();
		  System.out.println("before operation value of data is"+d.val);
		  d.operation(100);
		  System.out.println("After operation value of data is"+d.val);
	  }
 }

   class overloadMethod{
	  public void area(int b,int h) {
		  System.out.println("Area of triangle:"+(0.5*b*h));
		  
	  }
	  public void area(int r) {
		  System.out.println("Area of circle:"+(3.14*r*r));
	  }
	  public static void main(String[]args) {
		  overloadMethod ob=new overloadMethod();
		  ob.area(10,12);
		  ob.area(5);
	  }
  }

