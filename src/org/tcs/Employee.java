package org.tcs;

public class Employee  {
	
	private Employee() {
	}
	
	static Employee object;
	
	public static Employee getObject() {
		
		if(object == null) {
			
			System.out.println("Before Object creation : "+ System.identityHashCode(object));
			
			object = new Employee();
			
			System.out.println("After Object creation : "+ System.identityHashCode(object));
		}
		return object;
		
	}
	
	public void m1() {
		System.out.println("Hello all");
	}
	
	public static void main(String[] args) {
		Employee obj1 = getObject();
		obj1.m1();
		System.out.println(System.identityHashCode(obj1));
		
		Employee obj2 = getObject();
		System.out.println(System.identityHashCode(obj2));
		
		Employee obj3 = getObject();
		System.out.println(System.identityHashCode(obj3));
	}
	
}
