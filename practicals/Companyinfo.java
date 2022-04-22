package com;

class employee{
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	void employee(long id,String name,String address,long phone){
		
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
	}
	void calculatesalary() {
		
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary*Hra/100);
		System.out.println("salary is "+salary);
	}
}

class manager extends employee{
	

	manager(long id,String name,String address,long phone,double salary) {
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;
	}
	
}
class trainee extends employee{
	
	public trainee(int id, String name, String address, long phone, double salary) {
		// TODO Auto-generated constructor stub
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;
	}

	
	
}


public class Companyinfo {

	public static void main(String[] args) {
		manager m = new manager(126534,"peter","chennai india",237844, 65000.0);
		m.calculatesalary();
		trainee t = new trainee(29846,"Jack","Mumbai India",442085,45000);
		t.calculatesalary();;
		
		

	}

}
