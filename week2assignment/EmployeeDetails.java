package week2.assignment;

public class EmployeeDetails {
	public void employeeName(String empName, int empId) {
		
		
		System.out.println(empName);
		System.out.println(empId);
	}
	public void getEmployeeAdress(String empAdress){
		
	    System.out.println(empAdress);
	}
	public void employeeSalary(double empSalary) {
		
	    System.out.println(empSalary);
	}
	public void mobileNumber(long empNum) {
		
		System.out.println(empNum);
	}
public static void main(String[] args) {
	
	   EmployeeDetails det=new EmployeeDetails();
	   det.employeeName("Eranjith", 345678);
	   det.getEmployeeAdress("Sankarankovil");
	   det.employeeSalary(60.072);
	   det.mobileNumber(9360642991L);
	   
	   
	   
}
		
		
	

}
