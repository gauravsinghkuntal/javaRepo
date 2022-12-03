package package_default;

import java.util.Arrays;

class Student extends Object

{
	
	private String studentName;
	private int[] testScores;
	String testResults;
	
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getTestScores() {
		return testScores;
	}
	public void setTestScores(int testNumber, int testScore) {
		this.testScores = testScores;
	}
	public String getTestResults() 
	{
		return testResults;
	}
	public void setTestResults(String testResults) 
	{
		this.testResults = testResults;
	}
	
	@Override
	public String toString()
	{
		return "Student [studentName=" + studentName + ", testScores=" + Arrays.toString(testScores) + ", testResults="
				+ testResults + "]";
	}
	
	public void generateResult() 
	{
		
	}
}

class UnderGraduateStudent extends Student

{
	public UnderGraduateStudent(String studentName)
	{
		super(studentName);
	}
	
    @Override
    public void generateResult()
    {
    	System.out.println(this.testResults);
	}
    
 }

class GraduateStudent extends Student
{
	public GraduateStudent(String studentName)
	{
		super(studentName);
	}
}

public class Tester {
	
public static void main(String[] args) 
{
	
	GraduateStudent graduateStudent=new GraduateStudent("gaurav");
	graduateStudent.setTestResults("A");
	System.out.println(graduateStudent.getTestResults());
	System.out.println(graduateStudent.toString());

}
}
