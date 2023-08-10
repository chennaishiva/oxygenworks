package com.datatypes;

public class SampleProgram {
	
	public void add() {

		//dataType variableName = variableValue;
		
		byte age = 127;
		short empId = 32767;
		int appNo = 2147483647;
		long phno = 7448432188l;
		
		float avg = 1221.123454f;
		double newAvg = 1331.12345678;
		
		char gender = 'M';
		String name = "ram";
		
		boolean status = false;
		
		System.out.println(age);
		System.out.println(empId);
		System.out.println(appNo);
		System.out.println(phno);
		System.out.println(avg);
		System.out.println(newAvg);
		System.out.println(gender);
		System.out.println(name);
		System.out.println(status);
		
		System.out.println("My name is :" + name);
		System.out.println(age + 100);
		System.out.println(name + age + gender);
	}
	
	public static void main(String[] args) {
		SampleProgram s = new SampleProgram();
		s.add();
	}

}
