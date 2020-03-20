import java.util.ArrayList;

public class Student {

	private long id;
	private String name;
	private ArrayList<Integer> grades;

	public Student(long id, String name) {
		this.id = id;
		this.name = name;
		this.grades = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addGrade(int grade){
		this.grades.add(grade);
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	public double getGradeAverage(){
		double sum = 0;
		for (int grade: this.grades){
			sum += grade;
		}
		return sum / this.grades.size();
	}
}
