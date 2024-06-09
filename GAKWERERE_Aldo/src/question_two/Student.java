package question_two;

public class Student {
	private int id;
	private String name;
	private String grade;
	private int feesPaid;
	private int feesTotal;
	public Student(int id, String name, String grade, int feesPaid, int feesTotal) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 30000;
	}
	public Student(int i, String string, int j) {
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	public void payfees(int fees){
		feesPaid+=fees;
		School.UpdateTotalMoneyEarned(fees);
	}
}

