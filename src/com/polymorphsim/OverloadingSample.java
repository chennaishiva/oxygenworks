package com.polymorphsim;

public class OverloadingSample {

	// Arguments depends on dataType count or number
	private void empInfo(String name, int age, char gender, float avg) {
		System.out.println("Employee Info :" + name + '\t' + age + '\n' + gender + '\t' + avg);
	}

	public static void main(String[] args) {
		OverloadingSample o = new OverloadingSample();
		o.empInfo("ram", 24, 'm', 234.23f);

	}
}
