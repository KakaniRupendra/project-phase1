package stringDemo;

public class stringDemo {
	public static void main(String[]args) {
		System.out.println("methods of Strings");
		String sl=new String("hello world");
		System.out.println(sl.length());
		System.out.println("\nsubstring");
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));
		System.out.println("String Comparison");
		String s1="Hello";
		String s2="heldo";
		System.out.println(s1.compareTo(s2));
		System.out.println("IsEmpty");
		String s4="";
		System.out.println(s4.isEmpty());
		System.out.println("toLowerCase");
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		System.out.println("replace");
		String s6="Heldo";
		String replace=s2.replace('d','l');
		System.out.println(replace);
		System.out.println("equals");
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
		System.out.println("\n");
		System.out.println("Creating String Buffer");
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your lerning");
		System.out.println(s);
		System.out.println("insert method");
		s.insert(0, 'w');
		System.out.println(s);
		System.out.println("replace method");
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2,"hEl");
		System.out.println(sb);
		System.out.println("delete method");
		sb.delete(0, 1);
		System.out.println(sb);
		System.out.println("StringBuilder");
		System.out.println("\n");
		System.out.println("Creation StringBuffer");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);
		sb1.append("Learning");
		System.out.println(sb1);
		System.out.println(sb1.delete(0, 1));
		System.out.println(sb1.insert(1, "welcome"));
		System.out.println(sb1.reverse());
		//conversion
		System.out.println("\n");
		System.out.println("Conversion of String to StringBuffer and StringBuilder");
		String str="Hello";
		// conversion from Stringobject to StringBuffer
		StringBuffer sbr=new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		StringBuilder sbl=new StringBuilder(str);
		System.out.println("world");
		System.out.println("String to StringBuilder");
		System.out.println(sbl);
	}

}
