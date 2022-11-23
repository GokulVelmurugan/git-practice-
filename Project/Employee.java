public class Employee {
    String employeeName;
    int employeeAge;
    String employeeDOB;
    String employeeDepartment;
    String employeeSkill;

    public Employee(String name, int age, String dateOfBirth, 
                     String department, String skill) {
        employeeName = name;
	employeeAge = age;
	employeeDOB = dateOfBirth;
	employeeDepartment = department;
	employeeSkill = skill;
    }

    public String getEmployeeName() {
	return employeeName;
    }

    public int getEmployeeAge() {
	return employeeAge;
    }

    public String getEmployeeDOB() {
	return employeeDOB;
    }

    public String getEmployeeDepartment() {
	return employeeDeparment;
    }

    public String getEmployeeSkill() {
	return employeeSkill;
    }
}
