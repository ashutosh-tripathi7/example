package com.example;

public class RunTimePolymorphism extends CompileTimePolymorphism {
	String description;
	@Override
	 void studentsDetails(int id,String name,int batch,double cgpa) {
		 super.studentsDetails(id,name,batch,cgpa);
		 this.description="The student has an overall excellent curriculum record";
		 
	 }
		@Override
		void display() {
			System.out.println("------Student Info--------");
			System.out.println("Name :"+name);
			System.out.println("Id :"+id);
			if(cgpa!=null) System.out.println("CGPA :"+cgpa);
			if(batch!=0) System.out.println("Batch :"+batch);
			System.out.println("The id of the student "+name +" is "+id+" from the batch "+" had obtained a cgpa of "+cgpa+" and the description about the student is"+description);
			System.out.println();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphism ctp= new RunTimePolymorphism();
     
		ctp.studentsDetails(101,"Ashutosh",2023-25,7.5);
		ctp.display();
			
	}

}
