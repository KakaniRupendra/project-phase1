package lmsproject;

 class defAccessSpecifier {
	void display() {
		System.out.println("you are using default access specifier");
	}

}
 class accessSpecifier1{
	public static void main(String[]args) {
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj=new defAccessSpecifier();
		obj.display();
	}
}
class priaccessspecifier{
	private void display() {
		System.out.println("you are using private access specifier");
	}
}
 class accessSpecifier2{
	public static void main(String[]args) {
		System.out.println("private access specifier");
		priaccessspecifier obj=new priaccessspecifier();
	}
}
