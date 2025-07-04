package com.example;

public class EncapsulationExample {
	private int id;
	private String name;
	private int batch;
	private double cgpa;
	private String description;
	public void setId(int id) {
		this.id= id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBatch(int batch) {
		this.batch=batch;
		
	}
	public void setCgpa(double cgpa) {
		this.cgpa=cgpa;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public int getBatch() {
		return batch;
	}
	public double getCgpa() {
		return cgpa;
	}
	public String getDescription() {
		return description;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample ee= new EncapsulationExample();
		ee.setId(101);
		ee.setName("Ashutosh Tripathi");
		ee.setBatch(2023-25);
		ee.setCgpa(7.5);
		ee.setDescription("The curriculum records of the student is excellent");
		System.out.println(ee.getId());
		System.out.println(ee.getName());
		System.out.println(ee.getBatch());
		System.out.println(ee.getCgpa());
		System.out.println(ee.getDescription());

		

	}

}
