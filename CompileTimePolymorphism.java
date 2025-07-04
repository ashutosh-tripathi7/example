package com.example;
import java.util.Scanner;
public class CompileTimePolymorphism {
	int id;
	String name;
	int batch;
	Double cgpa;
	
		void studentsDetails(int id,String name) {
			this.id=id;
			this.name=name;
			display();
		}
		void studentsDetails(String name,int id) {
			this.name=name;
			this.id=id;
			display();
		}
		void studentsDetails(int id,String name,int batch) {
			this.id=id;
			this.name=name;
			this.batch=batch;
			display();
		}
		void studentsDetails(int id,String name,int batch,double cgpa) {
			this.id=id;
			this.name=name;
			this.batch=batch;
			this.cgpa=cgpa;
			display();
		}
		void display() {
			System.out.println("------Student Info--------");
			System.out.println("Name :"+name);
			System.out.println("Id :"+id);
			if(cgpa!=null) System.out.println("CGPA :"+cgpa);
			if(batch!=0) System.out.println("Batch :"+batch);
			System.out.println("The id of the student "+name +" is "+id+" from the batch "+" had obtained a cgpa of "+cgpa);
			System.out.println();
		}

	public static void main(String[] args) {
		CompileTimePolymorphism ctp= new CompileTimePolymorphism();
		ctp.studentsDetails("Ashutosh",1);
		ctp.studentsDetails(1,"Ashutosh Tripathi");
		ctp.studentsDetails(1,"Ashutosh",2023-25);
		//ctp.studentsDetails(1,"Ashutosh",2023-25,7.5);
		ctp.display();
		
		
		// TODO Auto-generated method stub
		

	}

}
