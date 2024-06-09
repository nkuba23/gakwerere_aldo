package question_two;

public class Teacher {
	private int id;
    private String name;
    private int Salary;
    private int SalaryEarned;
	public Teacher(int id, String name, int salary, int salaryEarned) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		SalaryEarned = 0;
	}
	public Teacher(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getSalaryEarned() {
		return SalaryEarned;
	}
	public void setSalaryEarned(int salaryEarned) {
		SalaryEarned = salaryEarned;
	}
    

	public void recievesalary(int salary){
		this.SalaryEarned+=salary;
		School.UpdateTotalMoneySpent(salary);
	}


}
