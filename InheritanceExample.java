package com.example;

 class Student {

	String name="Ashutosh";
	String gender="male";
	int id=101;
	void show1() {
		System.out.println("this is a message of Parent class");
	}
	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(gender);
	}
	
}
 class EngineeringStudents extends Student {
	int branch;
	void display(int branch) {
		this.branch=branch;
		System.out.println("---------------Engineering Student Details------------");
		super.display();
		System.out.println(branch);

	}
 }
 class MedicalStudents extends EngineeringStudents{
	 double cgpa;
	 void display(double cgpa) {
		 this.cgpa=cgpa;
			System.out.println("---------------Medical Student Details------------");
			super.display();
			System.out.println(cgpa);
			
	 }
	 
 }
 public class InheritanceExample{
	public static void main(String[] args) {
		MedicalStudents ms= new MedicalStudents();
		ms.display();
		ms.display(2024-25);
		ms.display(7.7);
		ms.show1();
		// TODO Auto-generated method stub

	}

}
