package oops;
//uses of class and objects
import java.util.*;
import java.io.*;
public class dog {
	String name;
	String breed;
	int age;
	String color;
	public dog(String name,String breed,int age,String color) {
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
		
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return("Hi my name is "+this.getName()+".\n My breed,age and color are "+
	this.getBreed()+","+this.getAge()+", and"+this.getColor()+".");
	}
	public static void main(String[]args) {
		dog scott=new dog("scott","papillon",5,"black");
		System.out.println(scott.toString());
	}
 
}
