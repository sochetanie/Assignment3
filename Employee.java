abstract class Employee {
	String name;
	int id;
  	String designation;
  	String department;
  	double experience;
  	private double salary;
  	private String address; 
   
    public double getSalary(){
    	return salary;
  	}
    public String getAddress(){
    	return address;
  	}
    
  	public Employee(String name,int empid,String empdsgn,String empdept,double empexp,double tempsalary,String tempaddress){
  		this.name=name;
    	this.id=empid;
    	this.designation=empdsgn;
    	this.department=empdept;
    	this.experience=empexp;
    	this.salary=tempsalary;
    	this.address=tempaddress;
    }
  
  	public void printEmpDetails(){
    	System.out.println("Employee Details are as follows:\n Name: " +name+";\n ID: " + id+";\n Designation: "+designation+";\n Department: "+department+";\n Experience: "+experience);
  	}
  }

  	public class MyEmployee extends Employee {

	  	public MyEmployee(String name,int empid,String empdsgn,String empdept,double empexp,double tempsalary,String tempaddress){
	  		super(name,empid,empdsgn,empdept,empexp,tempsalary,tempaddress);
	    }

	    public static void main(String[]args){
	    	MyEmployee emp1=new MyEmployee("Madhu",9563,"Jr.Manager","Electrical",3.5,900000,"RJY"); 
	      	emp1.printEmpDetails(); 
	      	System.out.println(" Salary: "+emp1.getSalary());
	      	System.out.println(" Address: "+emp1.getAddress())
	  	}
}


